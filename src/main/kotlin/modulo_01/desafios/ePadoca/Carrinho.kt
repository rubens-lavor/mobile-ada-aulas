package modulo_01.desafios.ePadoca

import modulo_01.desafios.ePadoca.cupons.Cupom
import modulo_01.desafios.ePadoca.produtos.Produto

class Carrinho(val cuponsValidos: Map<String, Cupom>) {
    val listaDeProdutos: MutableSet<Produto> = mutableSetOf()
    private var cupom: Cupom? = null
    val comada: Comanda = Comanda()

    fun addItem(produto: Produto) {
        listaDeProdutos.add(produto)
    }

    fun temItem(): Boolean {
        return listaDeProdutos.isNotEmpty()
    }

    fun total(): Double {
        if (temItem()) {
            val somatorio = listaDeProdutos
                .map {
                    it.valorTotal()
                }.reduce { acc, d ->
                    acc + d
                }

            if (cupom != null) {
                return cupom!!.aplicarDesconto(somatorio)
            }

            return somatorio
        }
        return 0.0
    }

    fun addCupom(chave: String): Boolean {
        cupom = cuponsValidos[chave]
        return cupom != null
    }

    fun finalizarCompar() {
        comada.imprime(listaDeProdutos, total())
    }

}
