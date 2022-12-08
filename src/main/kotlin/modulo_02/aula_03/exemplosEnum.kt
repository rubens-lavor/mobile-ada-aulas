package modulo_02.aula_03

import modulo_02.aula_03.Dia.*
import modulo_02.aula_03.Materia.*

// Bônus: o método .joinToString() usado em listas => transforma listas em strings unificando seus itens, de forma personalizada.
enum class Dia(val nome: String, val abreviacao: String) {
    DOMINGO(nome = "Domingo", abreviacao = "dom"),
    SEGUNDA(nome = "Segunda", abreviacao = "seg"),
    TERCA(nome = "Terça", abreviacao = "ter"),
    QUARTA(nome = "Quarta", abreviacao = "qua"),
}

enum class Materia(val nome: String, val diasDeAula: List<Dia>) {
    PORTUGUES(nome = "Português", diasDeAula = listOf(SEGUNDA, QUARTA)),
    MATEMATICA(nome = "Matemática", diasDeAula = listOf(TERCA)),
    CIENCIA(nome = "Ciências", diasDeAula = listOf(TERCA)),
    GEOGRAFIA(nome = "Geografia", diasDeAula = listOf(SEGUNDA));

    override fun toString(): String {
        return """
            $nome nos dias ${
            diasDeAula.joinToString(
                separator = "|",
                prefix = "(",
                postfix = ")",
                transform = { dia -> dia.abreviacao }
            )
        }
        """.trimIndent()
    }

}

data class Professor(val id: Int, val nome: String, val sobrenome: String, val materias: List<Materia>) {

    override fun toString(): String {
        return """
            O professor $nome $sobrenome de número identificador #$id leciona as aulas ${materias.joinToString()}.
        """.trimIndent()
    }
}

fun main() {

    val professorDePortugues =
        Professor(
            id = 100,
            nome = "Roberto",
            sobrenome = "Cunha",
            materias = listOf(PORTUGUES, MATEMATICA, CIENCIA, GEOGRAFIA)
        )

    println(professorDePortugues)

}