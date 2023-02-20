/*Crear un conjunto con elementos y agregar elementos */

fun main() {
    val conjunto = mutableSetOf<String>() /* creamos un mutable llamado conjunto utilizando la funcion mutableSetof que es una funcion para crear el conjuntp */
    conjunto.add("Ropa")
    conjunto.add("Lugares") /*Luego se agregan tres cadenas de texto al conjunto utilizando el metodo add que es cada una de las cadenas de un elemento del conjunto */
    conjunto.add("notas")
    println(conjunto) /*finalmente se imprime el conjunto con la función printl que esto imprimira los elementos del conjunto */
}