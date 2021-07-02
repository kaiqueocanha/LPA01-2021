import kotlin.math.pow

/*
Codifique um programa em Kotlin que solicite ao usuário um valor inteiro. Após
o recebimento calcule e apresente seu quadrado e o cubo deste valor.
 */

fun main(args: Array<String>) {

    println("Digite um número:")
    val numero = readLine()!!.toInt()

    val quadradoNumero = numero*numero
    println("Quadrado de $numero é : $quadradoNumero")

    val cuboNumero = numero.toDouble().pow(3.toDouble())
    println("Cubo de $numero é : $cuboNumero")

}