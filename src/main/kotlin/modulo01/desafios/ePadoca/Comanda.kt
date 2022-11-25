package modulo01.desafios.ePadoca

import modulo01.desafios.ePadoca.produtos.Produto

class Comanda {

    fun imprime(produtos: MutableSet<Produto>, total: Double){
        var comanda: String = "====================Comanda E-padoca=======================\n" +
                "===========================================================\n" +
                "item.......Produto..........Qtd........Valor..........Total\n" +
                "===========================================================\n"

        produtos.forEachIndexed { index, produto ->
            comanda += "${index.inc().toString().plus("..........")}$produto\n"
        }

        comanda += "===========================================================\n" +
                "Total ===========================================> R${'$'} ${total}\n" +
                "=====================VOLTE SEMPRE ^-^======================"

        println(comanda)
    }
}
