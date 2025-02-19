fun main() {
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    cars[0] = "Jeep"
    println(cars[0])
    println(cars.size)

    if ("Volvo" in cars) {
        println("It's here!")
    } else {
        println("Not here!")
    }

    for (x in cars) {
        println(x)
    }
}