package modulo_01.desafios.ePadoca

import modulo_01.desafios.*
import modulo_01.desafios.ePadoca.produtos.Produto

enum class Categoria(
    private val indice: Int,
    val itens: List<Produto>,
    val opcoes: String
) {
    PAES(
        indice = 1,
        itens = listOf(PaoFrances, PaoDeLeite, PaoDeMilho),
        opcoes = Menu.opcoesPao),
    SALGADOS(
        indice = 2,
        itens = listOf(Coxinha, Esfiha, PaoDeQueijo),
        opcoes = Menu.opcoesSalgado
    ),
    DOCES(
        indice = 3,
        itens = listOf(Carolina, Pudim, Brigadeiro),
        opcoes = Menu.opcoesDoce
    );

    companion object {
        fun getCategoria(indice: Int): Categoria {
            return Categoria.values().first { it.indice == indice }
        }
    }
}