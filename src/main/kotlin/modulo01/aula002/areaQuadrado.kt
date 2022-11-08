package modulo01.aula002

import kotlin.math.pow

fun areaQuadrado () {

    /*
    1 - Faça um algoritimo que receba o comprimento do lado de um quadrado e calcule sua área e seu perímetro.

    Exemplo:

    Digite o lado do do quadrado:
    12

    A area do quadrado e de 144 e seu perimetro de 48

    */

    println("-----")
    println("informe o lado do quadrado: ")
    val lado: Double = readln().toDoubleOrNull() ?: 0.0

    println("A área do quadrado é de ${lado.pow(2)} e seu perimetro de ${lado.times(4)}")
}