package tictactoe

fun main() {
    var grid = "         "
    var currentPlayer = 'X'

    printGrid(grid)

    while (true) {
        val coords = readLine()!!
        val parts = coords.trim().split(" ")
        if (parts.size != 2 || !parts[0].all { it.isDigit() } || !parts[1].all { it.isDigit() }) {
            println("You should enter numbers!")
            printGrid(grid)
            continue
        }
        val row = parts[0].toInt() - 1
        val col = parts[1].toInt() - 1
        if (row !in 0..2 || col !in 0..2) {
            println("Coordinates should be from 1 to 3!")
            printGrid(grid)
            continue
        }
        val pos = row * 3 + col
        if (grid[pos] != ' ') {
            println("This cell is occupied! Choose another one!")
            printGrid(grid)
            continue
        }
        grid = grid.toCharArray().apply { this[pos] = currentPlayer }.joinToString("")
        printGrid(grid)
        val result = analyzeGame(grid)
        if (result != "Game not finished") {
            println(result)
            break
        }
        currentPlayer = if (currentPlayer == 'X') 'O' else 'X'
    }
}

fun analyzeGame(grid: String): String {
    val xCount = grid.count { it == 'X' }
    val oCount = grid.count { it == 'O' }

    val xWins = hasThreeInRow(grid, 'X')
    val oWins = hasThreeInRow(grid, 'O')

    // Impossible cases
    if (xWins && oWins) return "Impossible"
    if (Math.abs(xCount - oCount) > 1) return "Impossible"

    // Win cases
    if (xWins) return "X wins"
    if (oWins) return "O wins"

    // Draw or not finished
    val emptyCount = grid.count { it == '_' || it == ' ' }
    return if (emptyCount == 0) "Draw" else "Game not finished"
}

fun hasThreeInRow(grid: String, player: Char): Boolean {
    // Rows
    for (i in 0 until 3) {
        if (grid[i*3] == player && grid[i*3+1] == player && grid[i*3+2] == player)
            return true
    }

    // Columns
    for (i in 0 until 3) {
        if (grid[i] == player && grid[i+3] == player && grid[i+6] == player)
            return true
    }

    // Diagonals
    if (grid[0] == player && grid[4] == player && grid[8] == player) return true
    if (grid[2] == player && grid[4] == player && grid[6] == player) return true

    return false
}

fun printGrid(grid: String) {
    println("---------")
    for (i in 0 until 3) {
        println("| ${grid[i*3]} ${grid[i*3+1]} ${grid[i*3+2]} |")
    }
    println("---------")
}
