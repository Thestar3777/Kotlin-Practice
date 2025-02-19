fun main() {
//    var i = 0
//    while (i < 5) {
//        println(i)
//        i++
    var i = 0
    while (i < 10) {
        println(i)
        i++
        if (i == 4)
        break
    }

    myFunction("John")
    myFunction("Jane")
    myFunction("Steve")
}

fun myFunction(fname: String) {
    println(fname + " Doe")
}

