package modulo01.desafios

import modulo01.desafios.ePadoca.produtos.Produto

object Coxinha: Produto() {
    override val nome: String = "Coxinha"
    override val valor: Double = 5.00

    override fun toString(): String {
        return "$nome..........$quantidade..........R$$valor..........R$${valorTotal()}"
    }
}

object Esfiha: Produto() {
    override val nome: String = "Esfiha"
    override val valor: Double = 6.00

    override fun toString(): String {
        return "$nome...........$quantidade..........R$$valor..........R$${valorTotal()}"
    }
}

object PaoDeQueijo: Produto() {
    override val nome: String = "Pão de Queijo"
    override val valor: Double = 3.00

    override fun toString(): String {
        return "$nome....$quantidade..........R$$valor..........R$${valorTotal()}"
    }
}