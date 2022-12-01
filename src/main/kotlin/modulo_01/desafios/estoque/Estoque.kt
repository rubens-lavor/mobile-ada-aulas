package modulo_01.desafios.estoque

class Estoque {
    private val itens = mutableListOf<ItemEstoque>()

    fun adicinar(nome: String, quantidade: Int = 0): Boolean {
        val item = ItemEstoque(nome, quantidade)
        return itens.add(item)
    }

    fun editar(id: Int, nome: String, quantidade: Int): Boolean {
        return itens.firstOrNull { it.id == id && it.ativo}?.let {
            it.nome = nome
            it.quantidade = quantidade
            true
        } ?: false
    }

    fun exibirItem(id: Int) {
        itens.firstOrNull { it.id == id && it.ativo }
            ?.also {
                println("ID | Peça | Quantidade")
                println(it)
            }
            ?:println("Item não encontrado com o id $id")
    }

    fun exibirTodos(){
        if (itens.isEmpty()) {
            println("Lista vazia")
            return
        }
        println("ID | Peça | Quantidade")
        itens.filter { it.ativo }.forEach (::println)
    }

    fun excluir(id: Int) {
        itens.firstOrNull { it.id == id }?.desativar() ?: println("Item não encontrado com o id $id")
    }
}
