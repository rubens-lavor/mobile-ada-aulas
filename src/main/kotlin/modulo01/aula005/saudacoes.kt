package modulo01.aula005

fun saudacoes(nome: String = ""): String = "Boa noite $nome"

fun saudacoes(nome: String, dia: Boolean): String {
    val saudacao = if (dia) "Bom dia" else "Boa noite"
    return "$saudacao $nome"
}

fun mostraSaldo(
    nome: String,
    dia: Boolean = true,
    saldo: Double?
): String {
    val saudacao = saudacoes(nome = nome, dia = dia)
    return "$saudacao seu saldo é de $saldo"
}
