/*crear maapa con elementos y eliminar uno en especifico */

fun main() {
    val mapa = mapOf("elemento 1" to 1, "elemento 2" to 2, "elemento 3" to 3)/*Creamos un mapa inmutable llamado mapa con tres elementos */
    for ((clave, valor) in mapa) { /*Utilizamos el bucle for each para recorrer cada elemento del mapa */
        println("$clave -> $valor") /*En la sintaxis clave y valor se utililza para la interpretacion de cadenas y poder separlos con una flecha */
    } /*Por ultimo imprimimos la clave y el valor de cada elemento del mapa */
}