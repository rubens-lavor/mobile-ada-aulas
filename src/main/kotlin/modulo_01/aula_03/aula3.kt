package modulo_01.aula_03

fun main(args: Array<String>) {

    println("--cadastro de usuário--")
    println("*min 6 caracteres")
    println("*max 10 caracteres")
    println("Digite o usuário")

    var usuario = readln()

    funcaoWhen(usuario = usuario)
    funcaoIf(usuario = usuario)
    funcaoWhile()

    adivinharNumero()
}
