fun sumarArreglo(arreglo: IntArray): Int { /*En este codigo se define la funcion llamada sumaArreglo que toma los numeros enteros */
    var suma = 0
    for (i in arreglo.indices) {           /*La funcion bucle for se utiliza para recorrer los elementos del arreglo */
        suma += arreglo[i]                /*Y acmular en la suma llamada la variable como vemos es llamada suma */
    }
    return suma                          /*Es para retornar  */
}

// Ejemplo de uso
fun main() {
    val arreglo = intArrayOf(1, 2, 3, 4, 5)                     /*Tambien cuenta con una funciòn llamada main donde se crea el ejemplo  */
    val resultado = sumarArreglo(arreglo)                       /*Se llama la funciòn sumarArreglo para obtener la suma de los elelementos y luego se imprime un mensaje mostrando el resultado obtenido */
println("La suma de los elementos del arreglo es: $resultado")
}