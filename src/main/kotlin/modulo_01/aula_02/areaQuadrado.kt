package modulo_01.aula_02

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

    val area = lado.pow(2)
    val perimetro = lado.times(MULTIPLICADOR_PERIMETRO)

    println("A área do quadrado é de $area e seu perimetro de $perimetro")
}

private const val MULTIPLICADOR_PERIMETRO = 4
