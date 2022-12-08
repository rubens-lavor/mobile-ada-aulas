package modulo_02.aula_03

import modulo_02.aula_02.Guerreiro

fun main() {
    val bartolomeuAmigoSeu = Guerreiro(nome = "Bartolomeu Amigo Seu")
    println(bartolomeuAmigoSeu)

    evolucoesNoJogo(personagem = bartolomeuAmigoSeu)
    batalhaFinalComOChefao(personagem = bartolomeuAmigoSeu)
}

private fun evolucoesNoJogo(personagem: Guerreiro) {
    personagem.mudaNivel()
    println(personagem)

    personagem.mudaNivel()
    println(personagem)

    personagem.mudaNivel()
    println(personagem)

    personagem.mudaNivel()
    println(personagem)

    personagem.mudaNivel()
    println(personagem)

    personagem.mudaNivel()
    println(personagem)
}

private fun batalhaFinalComOChefao(personagem: Guerreiro) {
    println(Chefao)
    Chefao.receberDano(personagem.golpear())
    println(Chefao)
    Chefao.receberDano(personagem.golpeMultiplo())
    println(Chefao)
    Chefao.receberDano(personagem.superGolpe())
    println(Chefao)
    Chefao.receberDano(personagem.golpear())
    println(Chefao)
    Chefao.receberDano(personagem.golpeMultiplo())
    println(Chefao)
    Chefao.receberDano(personagem.superGolpe())
    println(Chefao)
    println(Chefao)
    Chefao.receberDano(personagem.golpear())
    println(Chefao)
    Chefao.receberDano(personagem.golpeMultiplo())
    println(Chefao)
    Chefao.receberDano(personagem.superGolpe())
    println(Chefao)
    println(Chefao)
    Chefao.receberDano(personagem.golpear())
    println(Chefao)
    Chefao.receberDano(personagem.golpeMultiplo())
    println(Chefao)
    Chefao.receberDano(personagem.superGolpe())
    println(Chefao)
    println(Chefao)
    Chefao.receberDano(personagem.golpear())
    println(Chefao)
    Chefao.receberDano(personagem.golpeMultiplo())
    println(Chefao)
    Chefao.receberDano(personagem.superGolpe())
    println(Chefao)
    println(Chefao)
    Chefao.receberDano(personagem.golpear())
    println(Chefao)
    Chefao.receberDano(personagem.golpeMultiplo())
    println(Chefao)
    Chefao.receberDano(personagem.superGolpe())
    println(Chefao)
    println(Chefao)
    Chefao.receberDano(personagem.golpear())
    println(Chefao)
    Chefao.receberDano(personagem.golpeMultiplo())
    println(Chefao)
    Chefao.receberDano(personagem.superGolpe())
    println(Chefao)
}