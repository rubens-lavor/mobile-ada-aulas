package modulo_01.aula_05

/*
* aula de funções
**/
fun main() {
    println(funcaoSemRetorno())
    val nome = retornaNome()
    println(nome)
    println(saudacoes(nome = nome))
    println(saudacoes(nome = nome, dia = true))
    println(mostraSaldo(nome = nome, saldo = 100.0))

    log("rubens", ::funcaoSemRetorno)
    log("rubens") {
        println(mostraSaldo(nome = "rubens",dia = true, saldo = 100.0))
    }

    val myList = mutableListOf(1,2,3,4,5);

    for (i in myList.indices) myList[i] = myList[i] * 2
    println(myList)

    println("----")

    myMap(myList) { n ->
        n * 2
    }

    println(myList)
}

