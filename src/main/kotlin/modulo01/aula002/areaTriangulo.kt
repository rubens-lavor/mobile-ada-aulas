package modulo01.aula002

fun areaTriangulo () {

    /*
    2 - Faça um algoritimo que leia a base e a altura de um triangulo e calcule a sua area.
    F => base*altura/2
    * */
    println("-----")
    println("informe a base: ")
    val base: Double = readln().toDoubleOrNull() ?: 0.0

    println("informe a altura: ")
    val altura: Double = readln().toDoubleOrNull() ?: 0.0

    val area = base.times(altura).div(2)

    println("A área do triangulo é $area")
}