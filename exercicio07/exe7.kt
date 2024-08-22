package exercicio07

import exercicio07.objeto.Voo

fun main() {
//    Exercício 7: Sistema de Reserva de Passagens Aéreas (15 XP)



    val voo = Voo("0000", IntArray(10) { it + 1 })
    while (true) {
        if (voo.disponiveis().isEmpty()) {
            println("Não há mais assentos disponíveis.")
            break
        }
        println("Assentos disponíveis: ${voo.disponiveis()}")

        print("Digite o número do assento para reserva(-1 para sair): ")
        val assento = readln().toInt()
        if (assento == -1) break

        if (voo.verifDisponibilidade(assento)) {
            if (voo.reservarAssento(assento)) {
                println("Assento $assento reservado!")
            } else {
                println("Assento $assento não foi reservado!")
            }
        } else {
            println("assento $assento não disponível.")
        }
    }
}