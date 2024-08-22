package exercicio05

fun main() {
//    Exercício 5: Simulação de Jogo de Dados (10 XP)


    print("Quantas vezes você deseja lançar os dados? ")
    val vezes = readln().toIntOrNull() ?: 1
    for (i in 1..vezes) {
        val dado1: Int = (1..6).random()
        val dado2: Int = (1..6).random()
        val soma: Int = dado1 + dado2
        println("Lançamento $i:\nDado1: $dado1\nDado2: $dado2\nSoma = $soma\n")
    }
    return
}