package modulo_01.desafios

import modulo_01.desafios.ePadoca.produtos.Produto

object Carolina: Produto() {
    override val nome: String = "Carolina"
    override val valor: Double = 1.50

    override fun toString(): String {
        return "$nome.........$quantidade..........R$$valor..........R$${valorTotal()}"
    }
}

object Pudim: Produto() {
    override val nome: String = "Pudim"
    override val valor: Double = 4.00

    override fun toString(): String {
        return "$nome............$quantidade..........R$$valor..........R$${valorTotal()}"
    }
}

object Brigadeiro: Produto() {
    override val nome: String = "Brigadeiro"
    override val valor: Double = 2.00

    override fun toString(): String {
        return "$nome.......$quantidade..........R$$valor..........R$${valorTotal()}"
    }
}
