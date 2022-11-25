package modulo01.desafios.ePadoca

import modulo01.desafios.*
import modulo01.desafios.ePadoca.produtos.Produto

enum class Cupom(
    private val codigo: String,
    val itens: List<Produto>,
    val opcoes: String
) {
    CUPOM_5PADOCA(
        codigo = "5PADOCA",
        itens = listOf(PaoFrances, PaoDeLeite, PaoDeMilho),
        opcoes = Menu.opcoesPao),
    CUPOM_10PADOCA(
        codigo = "10PADOCA",
        itens = listOf(Coxinha, Esfiha, PaoDeQueijo),
        opcoes = Menu.opcoesSalgado
    ),
    CUPOM_5OFF(
        codigo = "5OFF",
        itens = listOf(Carolina, Pudim, Brigadeiro),
        opcoes = Menu.opcoesDoce
    );

    companion object {
        fun getCategoria(codigo: String): Cupom {
            return Cupom.values().first { it.codigo == codigo }
        }
    }
}