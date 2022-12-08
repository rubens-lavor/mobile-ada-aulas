package modulo_02.aula_02

import modulo_02.aula_02.NivelGuerreiro.*
import kotlin.random.Random

data class Guerreiro(
    val nome: String,
    var vida: Int = VIDA_INICIAL,
    var nivel: NivelGuerreiro = NIVEL_INICIAL,
    var casa: Casa? = null
) {

    var animalDeEstimacao: AnimalDeEstimacao? = null

    // Nested Class -> será possivelmente acessada de forma externa
    data class Casa(val tamanho: Int, val recuperacao: Int) {
        fun descansar() {
            // Aumentar a vida do guerreiro somando "recuperacao"
        }
    }

    // Inner Class -> acessível apenas internamente no escopo do Guerreiro
    inner class AnimalDeEstimacao(val nome: String, val dano: Int) {
        private val multiplicadorDeDano = Random.nextInt(1, 2)
        fun golpear(): Int {
            return dano * multiplicadorDeDano
        }
    }

    companion object {
        const val VIDA_INICIAL = 20
        val NIVEL_INICIAL = NivelGuerreiro.SOLDADO

        var multiplicadorDano = 1
        fun buscarDescricao(): String {
            return "O guerreiro é um personagem que veio da Terra Média e vive nos anos de 900a.C ..."
        }
    }

    fun golpear(): Int {
        return nivel.arma.dano
    }

    fun golpeMultiplo(): Int {
        return nivel.arma.dano * multiplicadorDano
    }

    fun superGolpe(): Int {
        return nivel.superDano() + (animalDeEstimacao?.dano ?: 0)
    }

    fun ganhouUmCachorro(animal: AnimalDeEstimacao) {
        animalDeEstimacao = animal
    }

    fun mudaNivel() {
        vida *= 2
        nivel = when(nivel) {
            SOLDADO -> GUARDA
            GUARDA -> GENERAL
            GENERAL -> {
                animalDeEstimacao = AnimalDeEstimacao(nome = "Unicórnio", dano = 80)
                CELESTIAL
            }
            CELESTIAL -> {
                animalDeEstimacao = AnimalDeEstimacao(nome = "Dragão Negro de Olhos Vermelhos", dano = 120)
                APOCALIPTICO
            }
            APOCALIPTICO -> DEUS_DOS_DEUSES
            else -> {
                vida /= 2
                println("Aviso: Nível máximo já alcançado!")
                nivel
            }
        }
    }

}