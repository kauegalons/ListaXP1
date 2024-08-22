package exercicio06

fun main() {
//    Exercício 6: Análise de Dados Meteorológicos (10 XP)



    val dadosMetereologicos = DoubleArray(30)
    for (i in dadosMetereologicos.indices) {
        print("Temperatura do dia ${i + 1}:")
        dadosMetereologicos[i] = readln().toDoubleOrNull() ?: 0.0
    }
    val auxlista = dadosMetereologicos.toList()
    val tempMax = dadosMetereologicos.maxOrNull()
    val diaMax = auxlista.indexOf(tempMax) + 1
    val tempMin = dadosMetereologicos.minOrNull()
    val diaMin = auxlista.indexOf(tempMin) + 1
    val media = dadosMetereologicos.average()
    println("Média de temperatura: %.2f".format(media))
    println("Temperatura máxima: ${"%.2f".format(tempMax)} | Dia $diaMax")
    println("Temperatura mínima: ${"%.2f".format(tempMin)} | Dia $diaMin")

    return
}