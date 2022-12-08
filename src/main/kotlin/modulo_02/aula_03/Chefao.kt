package modulo_02.aula_03

import modulo_02.aula_02.ArmaGuerreiro

object Chefao {

    var multiplicador = 1

    val nome: String = "Belzeboss Rarará de Raio Laser"
    var vida: Int = 10_000
    val arma: ArmaGuerreiro = ArmaGuerreiro(nome = "Palheta do Destino", dano = 300)

    fun golpear(): Int {
        return arma.dano * multiplicador
    }

    fun receberDano(danoRecebido: Int) {
        val vidaAposDano = vida - danoRecebido
        vida = if (vidaAposDano <= 0) {
            println("Parabéns! Você venceu o $nome! Agora você é o mestre dos mestres de Aragor e todos te amam! (...créditos)")
            0
        } else vidaAposDano
    }

    override fun toString(): String {
        return """
            Chefao(nome=$nome, vida=$vida, arma=$arma)
        """.trimIndent()
    }
}