package exercicio01

fun main() {
//    Exercício 1: Verificação de Números Primos (5 XP)
    print("Digite um número inteiro: ")
    val num: Int = readln().toInt()
    var primo = true
    if (num == 0 || num == 1) {
        println("exceção")
        return
    }
    for (i in 2..num - 1) {
        if (num % i == 0) {
            primo = false
            break
        }
    }
    println(if (primo) "$num é um número primo" else "$num não é um número primo")
    return
}