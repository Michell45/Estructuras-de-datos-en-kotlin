/*crear dos listas con elementos y combinarlas en una tercera lista */

fun main() {
    val lista1 = mutableListOf("a", "b", "c") /*En la primera linea se crea una lista mutable con 3 elementos  */
    val lista2 = mutableListOf("1", "2", "3") /*En la segunda tenemos los otros elementos que son listas mutables */
    val lista3 = lista1 + lista2 /*En la tercer linea tenemos el operador + para concatenar las dos listas y asi poder asignarle el resultado a una nueva lista mutable llamada lista3 */
    println(lista3)/*Se imprime la lista3 utilizando el println esto imprimira los elemntos de la lista 3 debemos recorar separdos por comas y encerrados en corchetes */
}