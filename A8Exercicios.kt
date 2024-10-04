fun main() {

    println(converterAnos(5)) 

    println(contarCaracteres("Exemplo")) 

    println(calcularCubo(7)) 

    println(converterMilhasParaKm(10.0)) 

    trocarLetrasEImprimir("Kotlin, é zica") 
}

// 1. Função para converter anos em meses, dias, horas, minutos e segundos
fun converterAnos(periodo: Int): String { 
    val totalMeses = periodo * 12 
    val totalDias = periodo * 365 
    val totalHoras = totalDias * 24 
    val totalMinutos = totalHoras * 60 
    val totalSegundos = totalMinutos * 60 

    return """
        $periodo anos equivalem a:
        $totalMeses meses
        $totalDias dias
        $totalHoras horas
        $totalMinutos minutos
        $totalSegundos segundos
        """.trimIndent()
}


fun contarCaracteres(palavra: String): Int = palavra.length 


fun calcularCubo(valor: Int): Int = valor * valor * valor 


fun converterMilhasParaKm(distancia: Double): Double = distancia * 1.6 


fun trocarLetrasEImprimir(texto: String) { 
    val resultadoFinal = texto.replace(Regex("[aA]"), "x").toUpperCase() 
    println(resultadoFinal)
}