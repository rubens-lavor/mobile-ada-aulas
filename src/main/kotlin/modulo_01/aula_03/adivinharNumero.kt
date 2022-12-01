package modulo_01.aula_03

import kotlin.random.Random

fun adivinharNumero() {

    println("Digite o numero minimo")
    val min = readln().toInt()

    println("Digite o numero maxino")
    val max = readln().toInt()

    val random = Random.nextInt(from = min, until = max + 1)

    println("digite um numero")
    var num = readln().toInt()

    while (num != random) {

        when {
            num > random -> println("numero maior")
            else -> println("numero menor")
        }

        println("digite um numero")
        num = readln().toInt()
    }
    println("vc acertou!! $num")
}