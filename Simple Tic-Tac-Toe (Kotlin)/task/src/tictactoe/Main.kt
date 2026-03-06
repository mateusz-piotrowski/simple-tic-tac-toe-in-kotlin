package tictactoe

fun main() {
    val input = readLine()!!

    println("---------")

    for (i in 0..2) {
        print("| ")
        for (j in 0..2) {
            print("${input[i * 3 + j]} ")
        }
        println("|")
    }

    println("---------")
}
