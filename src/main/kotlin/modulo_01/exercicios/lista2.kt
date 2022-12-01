package modulo_01.exercicios

fun main() {

//    maiorMenor()
//    tabuada()
//    ordemInversa()

    numerosPrimos()
}

// Ex 1
fun maiorMenor(){
    println("Digite 10 valores:")
    val valores: MutableList<Int> = mutableListOf()

    for (index in 0..9){
        valores.add(readln().toInt())
    }

    valores.max()
    valores.min()
    println("Menor valor: ${valores.min()}")
    println("Maior valor: ${valores.max()}")
}

//Ex 2
fun tabuada(){
    print("Digite um número: ")
    val tabuada: Int = readln().toInt()
    println("Tabuada do $tabuada")
    for (numero in 1..10){
        val resultado: Int = numero * tabuada
        println("$numero x $tabuada = $resultado")
    }
}

//Ex 3
fun ordemInversa(){
    println("Digite 15 números:")
    val numeros: MutableList<Int> = mutableListOf()

    for (index in 0..14){
        numeros.add(readln().toInt())
    }
    numeros.reverse()
    for (elemento in numeros){
        print("$elemento ")
    }
}

//Ex 4
fun eleicao(){
    print("Digite o número de eleitores:")
    val eleitores = readln().toInt()
    var votosA = 0
    var votosB = 0
    var votosC = 0

    for(index in 1..eleitores){
        println("Vote em A, B ou C:")
        val voto: String = readln()

        when (voto.uppercase()){
            "A" -> votosA++
            "B" -> votosB++
            "C" -> votosC++
        }
    }
    val totalA: Double = (votosA / eleitores.toDouble()) * 100
    val totalB: Double = (votosB / eleitores.toDouble()) * 100
    val totalC: Double = (votosC / eleitores.toDouble()) * 100

    println("Candidato A - $votosA votos ($totalA%)")
    println("Candidato B - $votosB votos ($totalB%)")
    println("Candidato C - $votosC votos ($totalC%)")

}

// Ex. 5
fun numerosPrimos() {
    println("Informe um número inteiro positivo:")
    val numero = readln().toInt()

    val lista = mutableListOf<Int>()

    for (num in 2..numero) {
        if ((2 until num).none{ num % it == 0 })
            lista.add(num)
    }

    println(lista)
}
