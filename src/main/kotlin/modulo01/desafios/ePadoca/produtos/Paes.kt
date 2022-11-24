package modulo01.desafios

import modulo01.desafios.ePadoca.produtos.Produto

object PaoDeLeite: Produto() {

    override val nome: String = "Pão de Leite"
    override val valor: Double = 0.40

    override fun toString(): String {
        return "$nome.....$quantidade..........R$$valor..........R$${valorTotal()}"
    }
}

object PaoFrances: Produto() {

    override val nome: String = "Pão Francês"
    override val valor: Double = 0.40

    override fun toString(): String {
        return "$nome......$quantidade..........R$$valor..........R$${valorTotal()}"
    }
}

object PaoDeMilho: Produto() {

    override val nome: String = "Pão de Milho"
    override val valor: Double = 0.50

    override fun toString(): String {
        return "$nome.....$quantidade..........R$$valor..........R$${valorTotal()}"
    }
}