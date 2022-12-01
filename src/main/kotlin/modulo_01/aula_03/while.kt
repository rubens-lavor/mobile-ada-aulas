package modulo_01.aula_03

fun funcaoWhile() {
    println("Digite o usuário")
    var usuario = readln()
    while (usuario.isBlank() || usuario.isEmpty()) {
        println("Digite o usuário")
        usuario = readln()
    }
}