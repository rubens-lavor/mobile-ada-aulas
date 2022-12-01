package modulo_02.aula_02

data class Guerreiro(
    val nome: String,
    var vida: Int = 20,
    var nivel: String
) {

    fun mudaNivel(novoNivel: String) {
        nivel = novoNivel
    }

}
