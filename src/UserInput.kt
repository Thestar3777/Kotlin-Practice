import java.util.Scanner

fun main() {
    //print("Enter some text: ")
    //val stringInput = readLine()!!
    //println("You Entered: $stringInput")
    //to use numbers in math equations
    //println("You entered: ${stringInput.toInt()}")

    val scanner = Scanner(System.`in`)
    var number: Int? = null

    while (number == null) {
        print("Enter a number: ")
        val input = scanner.nextLine()

        try {
            number = input.toInt()

        } catch (e: Exception) {
            println("You didn't enter a valid number")
            println("Exception: $e")
            print("Please try again.")
        }
    }
    print("You've entered: $number")
}