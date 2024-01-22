package actividad01

fun main(args: Array<String>) {
    println(verificaCadena("nombre")) // true
    println(verificaCadena("_nombre")) // true
    println(verificaCadena("_12")) // true
    println(verificaCadena("")) // false
    println(verificaCadena("012")) // false
    println(verificaCadena("no$")) // false
}

fun verificaCadena(cadena: String): Boolean{

    //No está vacía
    if (cadena.isEmpty()){
        return false
    }
    //El primer carácter es una letra o un guion bajo (_)
    val primeraPosicion = cadena[0]
    if (!primeraPosicion.isLetter() && primeraPosicion != '_') {
        return false
    }

    //Todos los caracteres consisten de letras, números o guion bajo.
    return cadena.all { it.isLetterOrDigit() || it == '_' }


}