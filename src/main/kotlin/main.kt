
fun main(args: Array<String>) {

    println("Digite o seu nome:")
    val nome : String = readLine()!!

    println("Digite a sua idade:")
    val idade : Int = readLine()!!.toInt()

    println("Digite a sua altura:")
    val altura : Float = readLine()!!.toFloat()

    println("Seu nome é $nome")
    println("Sua idade é $idade")
    println("Sua altura é $altura")

}