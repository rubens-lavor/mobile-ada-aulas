package modulo_02.aula_02

class Retangulo(comprimento: Double, largura: Double) {

    var comprimento: Double = .0
        get() = comprimento
        set(value) {
            if (value < 0)
                throw ArithmeticException("Comprimento não pode ser negativo")

            field = value
        }

    var largura: Double = .0
        get() = largura
        set(value) {
            if (value < 0)
                throw ArithmeticException("Largura não pode ser negativa")
            field = value
        }

    init {
        if (comprimento < 0 || largura < 0)
            throw ArithmeticException("Comprimento e largura não podem ser negativos")

        this.comprimento = comprimento
        this.largura = largura
    }

}
