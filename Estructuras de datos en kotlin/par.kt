fun obtenerMayorMenor(a: Int, b: Int): Pair<Int, Int> { /*La función obtenerMayorMenor todo los dos argumentos entero  */
    if (a > b) {
        return Pair(a, b) /*Para determinar cual es el numero mayor y cual es el numero menos si a es mayor que b devuelve con la a que es el primer elemento y b como segundo es decir que se devuelve una pareja con b y el primer elemento y el a con el segundo elemento */
    } else {
        return Pair(b, a)
    }
}

// Ejemplo de uso
fun main() {
    val par = obtenerMayorMenor(5, 3)
    println("El mayor número es ${par.first} y el menor número es ${par.second}")
} 
/*Utilizamos la sintaxis par.fisrt y la second para acceder al primer y segundo elemento que tenemos. */