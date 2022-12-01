package modulo_01.desafios.estoque

class ItemEstoque(var nome: String, var quantidade: Int = 1) {
    var id: Int
        private set
    var ativo = true
        private set

    companion object {
        private var total = 0
    }

    init {
        total++
        id = total
    }

    fun desativar() {
        ativo = false
    }

    override fun toString(): String {
        return "$id | $nome | $quantidade"
    }
}
