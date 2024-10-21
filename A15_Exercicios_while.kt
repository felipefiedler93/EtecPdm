fun main() {

    //Exercício 1
    fun inverterTexto(texto: String): String {
        var invertido = ""
        var i = texto.length - 1

        while (i >= 0) {
            invertido += texto[i]
            i--
        }
        return invertido
    }

    println("Digite um texto: ")
    val input = readLine() ?: ""
    val textoInvertido = inverterTexto(input)
    println("Texto invertido: $textoInvertido")


    //Exercício 2


    fun verificarXEO(texto: String): Boolean {
        var countX = 0
        var countO = 0
        var i = 0

        while (i < texto.length) {
            when (texto[i].lowercaseChar()) {
                'x' -> countX++
                'o' -> countO++
            }
            i++
        }

        return if (countX == 0 && countO == 0) {
            false
        } else {
            countX == countO
        }
    }

    println("Digite uma string: ")
    val saida = readLine() ?: ""
    val resultado = verificarXEO(saida)
    println("Mesma quantidade de 'x' e 'o' é: $resultado")

}