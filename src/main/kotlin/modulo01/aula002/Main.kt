package modulo01.aula002

fun main () {

    // ler e mostrar via console

    print("digite nome: ")
    val nome = readln()
    println("Seja bem vindo ${nome.uppercase()}")

    print("digite idade: ")
    val idade: Int? = readln().toIntOrNull() ?: 20
    println("idade $idade")

    // media de notas

    println("digite a nota 1")
    val nota1: Double = readln().toDoubleOrNull() ?: 0.0

    println("digite a nota 2")
    val nota2: Double = readln().toDoubleOrNull() ?: 0.0

    println("digite a nota 3")
    val nota3: Double = readln().toDoubleOrNull() ?: 0.0

    println("digite a nota 4")
    val nota4: Double = readln().toDoubleOrNull() ?: 0.0

    println("digite a nota 5")
    val nota5: Double = readln().toDoubleOrNull() ?: 0.0

    val media = ( nota1 + nota2 + nota3 + nota4 + nota5 ) / 5

//    println(String.format("media: %.2f", media))
    println("media: $media")

    areaQuadrado()
    areaTriangulo()
    gerarNick()

}
