package modulo01.desafios.ePadoca.cupons

class Cupom5OFF: Cupom {
    override fun aplicarDesconto(valor: Double): Double {
        if (valor <= 5.0 ) {
            return 0.0
        }
        return valor - 5.0
    }
}