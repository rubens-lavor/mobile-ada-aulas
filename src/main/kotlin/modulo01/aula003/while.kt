package modulo01.aula003

fun funcaoWhile() {
    println("Digite o usuário")
    var usuario = readln()
    while (usuario.isBlank() || usuario.isEmpty()) {
        println("Digite o usuário")
        usuario = readln()
    }
}