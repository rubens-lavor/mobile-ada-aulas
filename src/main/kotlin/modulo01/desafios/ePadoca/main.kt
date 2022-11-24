package modulo01.desafios.ePadoca

fun main() {

    println("Bem Vindo à padaria E-Padoca!")

    val carrinho = Carrinho()
    val ePadoca = EPadoca(carrinho)

    do {
        ePadoca.init()
        var sair: Char = 'S'

        do {
            if (!carrinho.temItem()) {
                println("Deseja mesmo cancelar compra? (S/N)")
                sair = readln()[0]
            }
        } while (sair.uppercaseChar() !in arrayListOf('N', 'S'))

    } while (sair.uppercaseChar() == 'N')

    if (carrinho.temItem()) {
        carrinho.imprimeComanda()
    }

}
