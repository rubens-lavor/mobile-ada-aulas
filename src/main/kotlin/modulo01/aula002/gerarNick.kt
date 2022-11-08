package modulo01.aula002

fun gerarNick(){

    /*
    3 - Gerador de usuarios. Crie um programa que receba o nome, sobrenome e ano de nascimento do usuário, e a partir
    disso gere um nick com as duas primeiras letras do nome, seu sobrenome ao contrario e os ultimos dois digitos de
    seu ano de nascimento tudo minusculo.

    Exemplo:

    - Maria
    - Medeiros
    - 1984

    nick gerado: masoriedem84
     */

    println("-----")
    println("informe o nome: ")
    val nome = readln()

    println("informe o sobrenome: ")
    val sobrenome = readln()

    println("informe o ano de nascimento: ")
    val anoNascimento = readln()

    val nick = nome.substring(0,2) + sobrenome.reversed() + anoNascimento.substring(2,4)

    println("nick gerado: ${nick.lowercase()}")
}