package modulo01.desafios.ePadoca

import modulo01.desafios.ePadoca.cupons.Cupom
import modulo01.desafios.ePadoca.cupons.Cupom10PADOCA
import modulo01.desafios.ePadoca.cupons.Cupom5OFF
import modulo01.desafios.ePadoca.cupons.Cupom5PADOCA
import modulo01.desafios.ePadoca.produtos.Produto

fun main() {

    println("Bem Vindo à padaria E-Padoca!")


    val cuponsValidos: Map<String, Cupom> = mapOf(
        "5PADOCA" to Cupom5PADOCA(),
        "10PADOCA" to Cupom10PADOCA(),
        "5OFF" to Cupom5OFF()
    )
    val carrinho = Carrinho(cuponsValidos)
    val ePadoca = EPadoca(carrinho)

    do {
        ePadoca.init()
        var sair: Char = 'S'

        do {
            if (!carrinho.temItem()) {
                println("Deseja mesmo cancelar compra? (S/N)")
                try{ sair = readln().first() }
                catch (_:Exception){ sair = 'X' }
            }
        } while (sair.uppercaseChar() !in arrayListOf('N', 'S'))

    } while (sair.uppercaseChar() == 'N')

    if (carrinho.temItem()) {
        var codigoCupom = ""
        var aplicarCupom: Char  = 'S'

        do {
            do {
                println("Deseja aplicar cupom de desconto? (S/N)")
                try{ aplicarCupom = readln().first() }
                catch (_:Exception){ aplicarCupom = 'X' }
            } while (aplicarCupom.uppercaseChar() !in arrayListOf('N', 'S'))

            if (aplicarCupom.uppercaseChar() == 'S') {
                    println("Digite o cupom")
                    try {
                        codigoCupom = readln()
                    } catch (_: Exception) { }
                if (carrinho.addCupom(chave = codigoCupom)) {
                    println("cupom aplicado")
                    aplicarCupom = 'N'
                } else {
                    println("cupom inválido")
                }
            }
        } while (aplicarCupom.uppercaseChar() == 'S')

        carrinho.finalizarCompar()
    }

}
