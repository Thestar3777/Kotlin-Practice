fun main() {

//    var name = "my name is pino"
//    name = "Pedro"
//    //values with "val" cannot be changed
//    val age = 13
//
//    println("Here is my name and age:")
//    println(name)
//    println(age)

    newFunction("John", 15)
    newFunction("George", 35)
    newFunction("Matthew", 20)
}

fun newFunction(fname: String, age: Int) {
    println(fname + " is " + age)
}