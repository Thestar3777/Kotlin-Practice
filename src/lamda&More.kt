fun main() {
    val lambda = { println("Hello World") }
    val squarifier = { x: Int -> x * x}
    val things = listOf("Foo", "Bar", "Goo")

    lambda.invoke()
    println(squarifier.invoke(3))
    things.forEach {println(it)}
    //things.forEach { thing-> println(thing) }
    things.map { it.toUpperCase()}.forEach {println(it)}
}