package modulo01.exercicios

fun main() {

    maiorMenor()
    tabuada()
    ordemInversa()

}

// Ex 1
fun maiorMenor(){
    println("Digite 10 valores:")
    val valores: MutableList<Int> = mutableListOf()

    for (index in 0..9){
        valores.add(readln().toInt())
    }
    valores.sort()
    println("Menor valor: ${valores.first()}")
    println("Maior valor: ${valores.last()}")
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

//Ex 4
fun ordemInversa(){
    println("Digite 15 números:")
    val numeros: MutableList<Int> = mutableListOf()

    for (index in 0..14){
        numeros.add(readln().toInt())
    }
    numeros.reverse()
    for (elemento in numeros){
        println(elemento)
    }
}
