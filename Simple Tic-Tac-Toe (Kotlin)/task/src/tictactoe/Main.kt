package tictactoe

fun main() {
    val input = readLine()!!
    val grid = Array(3) { CharArray(3) }
    var index = 0

    // Read exactly 9 chars from first line only
    for (i in input.indices.take(9)) {
        val row = i / 3
        val col = i % 3
        grid[row][col] = input[i]
    }

    // Print initial grid
    printGrid(grid)

    // Get valid move from user (now reads from remaining input)
    var row: Int
    var col: Int

    while (true) {
        println("Enter the coordinates:")
        val inputLine = readLine()!!.trim().split(" ")

        // Check if exactly 2 inputs
        if (inputLine.size != 2) {
            println("You should enter numbers!")
            continue
        }

        // Check if both are numbers
        try {
            row = inputLine[0].toInt() - 1  // Convert to 0-based index
            col = inputLine[1].toInt() - 1  // Convert to 0-based index
        } catch (e: NumberFormatException) {
            println("You should enter numbers!")
            continue
        }

        // Check if coordinates are in range 1-3
        if (row !in 0..2 || col !in 0..2) {
            println("Coordinates should be from 1 to 3!")
            continue
        }

        // Check if cell is occupied
        if (grid[row][col] != '_') {
            println("This cell is occupied! Choose another one!")
            continue
        }

        // Valid move found
        grid[row][col] = 'X'
        break
    }

    // Print updated grid
    printGrid(grid)
}

fun printGrid(grid: Array<CharArray>) {
    println("---------")
    for (row in grid) {
        print("| ")
        for (cell in row) {
            print("$cell ")
        }
        println("|")
    }
    println("---------")
}
