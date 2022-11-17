package modulo01.aula005

fun log(usuario: String, acao: () -> Unit) {
    println(usuario)
    acao.invoke()
}

fun myMap(list: MutableList<Int>, action: (Int) -> Int) {
    for (i in 0 until list.size)
        list[i] = action(list[i]);
}
