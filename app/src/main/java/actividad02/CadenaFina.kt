package actividad02


fun main(args: Array<String>) {
    println("bac".esFina())  // false
    println("aza".esFina())  // false
    println("abaca".esFina())  // false
    println("baaa".esFina())  // true
    println("aaab".esFina())  // true
}

fun String.esFina(): Boolean {
    return (condicionUno(this) + condicionDos(this) + condicionTres(this)) >= 2
}

fun condicionUno(cadena: String): Int {
    val regex = Regex("(bu|ba|be)")
    return if (regex.containsMatchIn(cadena)) 0 else 1
}

fun condicionDos(cadena: String): Int {
    val regex = Regex("[aeiou]")
    val vocalesEnCadena = regex.findAll(cadena.toLowerCase()).count()
    return if (vocalesEnCadena >= 3) 1 else 0
}

fun condicionTres(cadena: String): Int {
    val regex = Regex("(.)\\1")
    return if (regex.containsMatchIn(cadena)) 1 else 0
}