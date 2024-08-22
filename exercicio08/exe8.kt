package exercicio08

import exercicio08.objeto.Produto

fun main() {
//    Exercício 8: Sistema de Gestão de Estoque com Reposição Automática (15 XP)



    val produtos = mutableListOf<Produto>()
    for (i in 1..5) {
        print("Digite o nome do produto $i: ")
        val nome = readln()
        println("Digite a quantidade de $nome em estoque: ")
        val quantidade = readln().toInt()
        println("Digite o nível mínimo de $nome em estoque: ")
        val nivelMinimo = readln().toInt()
        println("Digite o nível máximo de $nome em estoque: ")
        val nivelMaximo = readln().toInt()

        val produto = Produto(nome, quantidade, nivelMinimo, nivelMaximo)
        produtos.add(produto)
    }
    for (produto in produtos){
        println(produto)
        produto.verificaEstoque()

    }
}