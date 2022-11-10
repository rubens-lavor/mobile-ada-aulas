package modulo01.aula003

fun funcaoWhen(usuario: String) {

    when {
        usuario.length in 6..10 -> {
            println("usuário cadastrado com sucesso")
        }
        usuario.length > 10 -> {
            println("usuário não pode ter mais de 10 caracteres")
        }
        else -> {
            println("usuário não cadastrado")
        }
    }
}