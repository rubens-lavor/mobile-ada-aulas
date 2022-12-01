package modulo_01.desafios.ePadoca.cupons

class Cupom5PADOCA: Cupom {
    override fun aplicarDesconto(valor: Double): Double {
        return valor*0.95
    }
}