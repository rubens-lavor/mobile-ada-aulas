package modulo01.desafios.ePadoca.cupons

class Cupom10PADOCA: Cupom {
    override fun aplicarDesconto(valor: Double): Double {
        return valor*0.90
    }
}