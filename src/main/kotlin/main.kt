import kotlin.math.PI
import kotlin.math.pow

fun main() {
    /*val area1 = circleArea(2.3f)
    println(area1)

    val area2 = circleArea(2.6f)
    println(area2)

    println(login("", ""))
    println(login("peter", "jajaja"))

    println(rectangleArea(4.5,5.6))
    println(rectangleArea(4.5,5.6, 7.9))

    println(average(third = 4.5))
    println(average(first = 5.6, third = 4.6))

    verifyAge()

    verifyAgeWhen()

    println(triangleType())

    identifierType("sas")*/

    howManyTimesWord()

    // Sets
    // Un set es un operación que regresa una serie de elementos únicos, es decir, que no se repiten. Por ejemplo, el alfabeto es un set de letras. Un set almacena elementos únicos, incluso con los valores null. Un conjunto regresa un set (conjunto) inmutable usamos la funcion setOf(). Esto nos creará una instancia de un conjunto, en el cual no podremos realizar operaciones de escritura. Para realizar operaciones de escritura sobre un set lo creamos con la funcion mutableSetOf()
    //Creamos dos sets con valores únicos y desordenados en comparación entre ambos.
    val numSet: Set<Int> = setOf(0, 1, 2, 3, 4, 5)
    val reverseNumSet: Set<Int> = setOf(5, 4, 3, 2, 1, 0)

    //Creamos un set mutable
    var names: Set<String> = mutableSetOf("Nombre 1", "Nombre 2")

    // Map
    // El map (o diccionario) es un conjunto de pares clave-valor. Las claves son únicas y cada una de ellas se asigna exactamente a un valor. Los valores pueden ser duplicados. Los mapas son útiles para almacenar conexiones lógicas entre objetos, por ejemplo, la identificación de un empleado y su posición.
    val namesToAges: Map<String, Int> = mapOf("unser_one" to 20, "user_two" to 23)

    // Iterando un mapa
    for ((key, value) in namesToAges) {
        println("$key tiene $value años")
    }



}

fun circleArea(radius: Float): Double = PI*radius.pow(2)

fun login(user: String, password: String): Boolean {
    fun validate(input: String) = input.isNotEmpty()

    val userValidated = validate(user)
    val passValidated = validate(password)

    return userValidated && passValidated
}

fun rectangleArea(base: Double, height: Double, width: Double = 0.0): Double = if (width !== 0.0) base * height * width else base * height

fun average(first: Double = 8.0, second: Double = 8.0, third: Double): Double = (first + second + third) / 3

fun verifyAge(): Unit {
    println("Ingresa Edad y presiona enter: ")
    val age = readln().toInt()

    println(if( age > 18 ) "Mayor de edad" else if (age == 18) "Acabas de cumplir 18" else "Menor de edad")
}

fun verifyAgeWhen(): Unit {
    println("Ingresa Edad y presiona enter: ")
    val age = readln().toInt()

    when(age) {
        in 1..17 -> println("Menor de edad")
        18 -> println("Acabas de cumplir 18")
        else -> println("Mayor de edad")
    }
}

fun triangleType(): String {
    val side1 = readln().toDouble()
    val side2 = readln().toDouble()
    val side3 = readln().toDouble()
    val comparations = listOf(side1 == side2, side2 == side3, side3 == side1)

    if (!comparations.contains(false)) return "Equilatero"

    var acc = 0
    for ((_, value) in comparations.withIndex()) {
        if (!value) acc++
    }

    println(acc)

    return if (acc == 2) "Isoceles" else "Escaleno"

}

fun identifierType(value: Any) {
    when(value) {
        is String -> println("Soy un String")
        is Int -> println("Soy un Int")
        is Double -> println("Soy un String")
        else -> println("otro")
    }
}

fun howManyTimesWord() {
    val names = listOf("Pedro Luis", "Juan Manuel", "Juan Luis", "María Inés", "Romeo", "Ernesto", "Juan Pedro", "Ariadna", "Mireya María", "Ana Sofía", "José Juan")
    println("Nombre a buscar: ")
    val name = readln()

    var acc = 0
    names.forEach { n -> if (n == name) acc++ else acc }

    println("total: $acc")
}

