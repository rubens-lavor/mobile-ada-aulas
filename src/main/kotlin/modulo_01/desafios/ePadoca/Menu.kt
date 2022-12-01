package modulo_01.desafios.ePadoca

import modulo_01.desafios.*

class Menu {

    companion object {

        private val mensagem: String = "Adicione um item abaixo ao carrinho:"

        val opcoesPao = """ 
                            $mensagem
                            1 - ${PaoFrances.nome} .... R$ ${PaoFrances.valor}
                            2 - ${PaoDeLeite.nome} ... R$ ${PaoDeLeite.valor}
                            3 - ${PaoDeMilho.nome} ... R$ ${PaoDeMilho.valor}
                            0 - Voltar
        """.trimIndent()

        val opcoesSalgado = """ 
                                $mensagem
                                1 - ${Coxinha.nome} ...... R$ ${Coxinha.valor}
                                2 - ${Esfiha.nome} ....... R$ ${Esfiha.valor}
                                3 - ${PaoDeQueijo.nome} .. R$ ${PaoDeQueijo.valor}
                                0 - Voltar
        """.trimIndent()

        val opcoesDoce = """ 
                            $mensagem
                            1 - ${Carolina.nome} .... R$ ${Carolina.valor}
                            2 - ${Pudim.nome} ....... R$ ${Pudim.valor}
                            3 - ${Brigadeiro.nome} .. R$ ${Brigadeiro.valor}
                            0 - Voltar
        """.trimIndent()

        val principal = """
                            Digite a opção desejada no Menu:
                            1..................Pães
                            2..............Salgados
                            3.................Doces
                            0......Finalizar compra
        """.trimIndent()

        const val FINALIZAR = 0
    }

}