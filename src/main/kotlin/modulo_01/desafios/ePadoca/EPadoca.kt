package modulo_01.desafios.ePadoca

import modulo_01.desafios.ePadoca.produtos.Produto

class EPadoca(val carrinho: Carrinho) {

    fun init() {
        do {
            val opcaoMenuInicial: Int = selecionaOpcao(opcoes = Menu.principal)

            if(opcaoMenuInicial != 0){
                val categoria = Categoria.getCategoria(indice = opcaoMenuInicial)
                selecionaProduto(categoria)
            }
        } while (opcaoMenuInicial != Menu.FINALIZAR)
    }

    private fun selecionaProduto(categoria: Categoria) {
        do {
            val indice: Int = selecionaOpcao(opcoes = categoria.opcoes)

            try {
                val item = categoria.itens[indice.dec()]
                selecionaQuantidade(item)
            } catch (_: ArrayIndexOutOfBoundsException) { }

        } while (indice != 0)
    }

    private fun selecionaOpcao(opcoes: String, variacao: IntRange = 0..3): Int {
        var indice: Int
        do {
            println(opcoes)
            indice = readln().toIntOrNull() ?: -1
        } while (indice !in variacao)

        return indice
    }

    private fun selecionaQuantidade(item: Produto) {
        println("Digite a quantidade desejada de ${item.nome}:")
        val quantidade = readln().toIntOrNull() ?: -1
        if (quantidade > 0) {
            item.add(quantidade)
            carrinho.addItem(item)
            return
        }
        println("valor inválido")
    }
}