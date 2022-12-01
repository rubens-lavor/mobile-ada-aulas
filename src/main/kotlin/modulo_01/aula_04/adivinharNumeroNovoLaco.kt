package modulo_01.aula_04

import kotlin.random.Random

fun adivinharNumeroNovoLaco() {

    var continuar = 's'
    val listTentativas = mutableListOf<Int>()
    val listNumerosSorteados = mutableListOf<Int>()

    do {
        jogar(listTentativas, listNumerosSorteados)
        println("Quer continuar o jogo? s/n")
        continuar = readln()[0].uppercaseChar()
    } while (continuar == 'S')

    val sum = listTentativas.reduce { sum, element -> sum + element }
    val media: Double = sum.div(listTentativas.size.toDouble())

    println("media: $media")
    println(listTentativas)
    println(listNumerosSorteados)

}

fun jogar(listTentativas: MutableList<Int>, listNumerosSorteados: MutableList<Int>) {
    println("Digite o numero minimo")
    val min = readln().toInt()

    println("Digite o numero maxino")
    val max = readln().toInt()

    val random = Random.nextInt(from = min, until = max + 1)

    println("digite um numero")
    var num = readln().toInt()

    var tentativas = 1

    while (num != random) {
        when {
            num > random -> println("numero maior")
            else -> println("numero menor")
        }

        println("digite um numero")
        num = readln().toInt()

        tentativas++
    }
    println("vc acertou!! O numero sorteado foi: $num")
    println("tentativas: $tentativas")

    listTentativas.add(tentativas)
    listNumerosSorteados.add(num)

}
