fun intervalo(numero:Int,min:Int,max:Int){
        if (numero > min  && numero < max)
            println("el $numero se encuentra en el intervalo de $min y $max ")

        else
            println("el $numero no se encuentra en el intervalo de $min y $max ")
}
fun main(args: Array<String>) {
    intervalo(8,1,5)
}
