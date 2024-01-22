package actividad02

fun main() {
    val s1: String? = null
    val s2: String? = ""
    println(s1.esVaciaONula() == true) //true
    println(s2.esVaciaONula() == true) //true

    val s3 = "   "
    println(s3.esVaciaONula() == false) //true
}

fun String?.esVaciaONula(): Boolean{
    return this == null || this.isEmpty()
}