fun main(args: Array<String>) {

    val array = mutableListOf<Int>()

    println("Digite os numeros do array, ou pression q para sair:")

    while (true) {

        val input = readLine()

        if(input.toString() == "q"){
            break
        }else{
            array.add(input!!.toInt())
        }

    }

    for(i in array){
        print("$i,")
    }

}