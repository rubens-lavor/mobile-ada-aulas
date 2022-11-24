package modulo01.desafios.ePadoca.produtos

import modulo01.desafios.PaoDeQueijo

abstract class Produto() {
    abstract val nome: String
    abstract val valor: Double
    protected var quantidade: Int = 0

    fun add(qnt: Int){
        quantidade += qnt
    }

    fun valorTotal() = valor * quantidade
//
//    override fun toString(): String {
//        return "$nome.... $quantidade... R$$valor..... ${valorTotal()}"
//    }
}
