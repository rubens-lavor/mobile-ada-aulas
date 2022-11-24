package modulo01.desafios.ePadoca

import modulo01.desafios.ePadoca.produtos.Produto

class Carrinho {
    private val listaDeProdutos: MutableSet<Produto> = mutableSetOf()

    fun addItem(produto: Produto) {
        listaDeProdutos.add(produto)
    }

    fun addCupom() {}

    fun temItem(): Boolean {
        return listaDeProdutos.isNotEmpty()
    }

    fun total() = listaDeProdutos
        .map {
            it.valorTotal()
        }.reduce { acc, d ->
            acc + d
        }

    fun imprimeComanda() {

        var comanda: String = "====================Comanda E-padoca=======================\n" +
                "===========================================================\n" +
                "item.......Produto..........Qtd........Valor..........Total\n" +
                "===========================================================\n"

        listaDeProdutos.forEachIndexed { index, produto ->
            comanda += "${index.inc().toString().plus("..........")}$produto\n"
        }

        comanda += "===========================================================\n" +
                "Total ===========================================> R${'$'} ${total()}\n" +
                "=====================VOLTE SEMPRE ^-^======================"

        println(comanda)
    }

}