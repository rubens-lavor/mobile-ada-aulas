package modulo01.desafios.estoque

fun main() {
    val estoque = Estoque()

    do {
        val opcaoMenuInicial: Int = selecionaOpcao(opcoes = Menu.principal, variacao = 0..5)

        if(opcaoMenuInicial != 0){
             when (opcaoMenuInicial) {
                 1 -> {
                     try {
                         adicinar(estoque)
                     } catch (e: LimiteEstoqueMaxExcpetion) {
                         println(e.message)
                     }
                 }
                 2 -> {
                     try {
                         editar(estoque)
                     } catch (e: LimiteEstoqueMaxExcpetion) {
                         println(e.message)
                     }
                 }
                 3 -> exibirItem(estoque)
                 4 -> estoque.exibirTodos()
                 5 -> excluirItem(estoque)
             }
        }
    } while (opcaoMenuInicial != 0)
}

private fun selecionaOpcao(opcoes: String, variacao: IntRange): Int {
    var indice: Int
    do {
        println(opcoes)
        indice = readln().toIntOrNull() ?: -1
    } while (indice !in variacao)

    return indice
}

private fun adicinar(estoque: Estoque) {
    println("Digite o nome:")
    val nome = readln()

    println("Digite a quantidade:")
    val quantidade = readln().toIntOrNull() ?: 1
    if (quantidade > 999) throw LimiteEstoqueMaxExcpetion()

    estoque.adicinar(nome, quantidade)
}

private fun editar(estoque: Estoque) {
    println("Digite o id:")
    val id = readln().toIntOrNull() ?: -1

    println("Digite o nome:")
    val nome = readln()

    println("Digite a quantidade:")
    val quantidade = readln().toIntOrNull() ?: 1
    if (quantidade > 999) throw LimiteEstoqueMaxExcpetion()

    if (estoque.editar(id, nome, quantidade)) println("Editado com sucesso")
    else (println("Item não encontrado com id $id"))
}

private fun exibirItem(estoque: Estoque) {
    println("Digite o id:")
    val id = readln().toIntOrNull() ?: -1

    estoque.exibirItem(id)
}

private fun excluirItem(estoque: Estoque) {
    println("Digite o id:")
    val id = readln().toIntOrNull() ?: -1

    estoque.excluir(id)
}
