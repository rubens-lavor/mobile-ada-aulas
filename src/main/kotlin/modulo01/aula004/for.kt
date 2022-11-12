package modulo01.aula004

fun exemplosFor() {

    val listaCompras = listOf(
        "Arroz",
        "Feijão",
        "Batata",
        "Uva",
        "Banana",
        "Carne",
        "Leite",
        "Ovos",
        "Frango"
    )

    for (letra in 'a'..'b'){
        println(letra)

    }

    for (i in 10 downTo 0 step 2){
        println(i)

    }

    for (produto in listaCompras){
        println(produto)

    }

    for (i in listaCompras.indices){
        println(listaCompras[i])
    }
}