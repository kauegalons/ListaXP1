package exercicio03

import exercicio03.objeto.Aluno

fun main() {
//    Exercício 3: Gerenciamento de Notas dos Alunos (10 XP)


    val alunos = mutableListOf<Aluno>()
    for (i in 1..5) {
        print("Digite o nome do aluno $i: ")
        val nome = readln()

        println("Digite as notas do aluno $i (separadas por espaço):")
        val notas = readln().split(" ").map { it.toDouble() }.toDoubleArray()

        alunos.add(Aluno(nome, notas))
    }
    for (aluno in alunos) {
        val media = aluno.media()
        val passou = if (aluno.aprovado()) "aprovado" else "reprovado"
        println("O aluno ${aluno.nome} foi $passou.\nMédia: ${"%.2f".format(media)}")
    }
    return
}