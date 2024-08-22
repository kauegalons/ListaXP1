package exercicio02

fun main() {
//    Exercício 2: Contagem de Palavras em um Texto (5 XP)


    println("Digite um parágrao de texto: ")
    val paragrafo: String = readlnOrNull() ?: ""
    println(paragrafo.split(Regex("\\s+")).count())
    return
}