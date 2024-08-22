package exercicio04

fun main() {
//    Exercício 4: Ordenação de Nomes de Alunos (10 XP)


    val nomes = ArrayList<String>()
    for (i in 1..10) {
        print("Digite o nome $i: ")
        val nome = readln()
        nomes.add(nome)
    }
    nomes.sort()
    nomes.forEach { println(it) }
    return
}