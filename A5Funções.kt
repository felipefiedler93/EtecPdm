fun main(){
    println("println() é uma função utilitária")

    bomDia();
    bomDia();
    bomDia();

    bomDia2();

    //chama o método e passo o parâmetro
    hello("Felipe Fiedler");

    var resultado = soma(7 , 9);
    println(resultado)

    println(subtracao(10.0 , 9));

    println(divisao(9, 2.0));

    mensagem("Felipe" , "Fiedler");
    mensagem("Felipe" , 17);
    mensagem("Fiedler");
    mensagem(17, "Felipe");
}

fun bomDia(){
    println("Bom dia!");
}

fun bomDia2() = print("Bom dia 2!")


// tem parâmetro tipo string pra receber  nome
fun hello(nome: String){
    println("Oi, $nome")
}

fun hello2(nome: String) = println("Olá, $nome")

fun soma(a: Int, b: Int):Int {
    var resultado = a + b
    return resultado
}

fun soma2(a: Int, b: Int) = a + b;

fun subtracao(a: Double, b: Int = 3) = a - b ;

fun divisao(a: Int, b: Double) = (a / b);

fun mensagem(nome: String, sobrenome: String){
    println("Bem-vindo $nome $sobrenome")
}

fun mensagem(nome: String, idade: Int){
    println("como vai, $nome. Você tem $idade anos? ")
}

fun mensagem(sobrenome: String) = println("Seu sobrenome é $sobrenome");

fun mensagem(idade:Int, nome:String) = println("Você tem $idade, $nome?")