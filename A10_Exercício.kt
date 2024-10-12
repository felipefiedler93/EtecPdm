fun main() {

    //Exercício 1
    for (i in 1..50) {
        print("$i ")
    }

    print("\n")

    //Exercício 2
    for (i in 50 downTo 1) {
        print("$i ")
    }

    println("\n")

    //Exercício 3
    for (i in 1..50) {
        if (i % 5 != 0) {
            print("$i ")
        }
    }

    println("\n")

    //Exercício 4
    var soma = 0
    for (i in 1..500) {
        soma += i
    }
    print("A soma dos números de 1 a 500 é: $soma")

    println("\n")

    //Exercício 5
    val n = 5  // Você pode alterar o valor de 'n' conforme necessário
    for (i in 1..n) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}