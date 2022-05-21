fun suma(num1:Int,num2:Int){
    val total = num1 + num2
    println("la suma de $num1 + $num2 = $total")
}
fun resta(num1:Int,num2:Int){
    val total = num1 - num2
    println("la resta de $num1 - $num2 = $total")
}
fun multiplicacion(num1:Int,num2:Int){
    val total = num1 * num2
    println("la multiplicacion de $num1 * $num2 = $total")
}
fun division(num1:Int,num2:Int){

    if(num2 >1 ){
         val total = num1 / num2
         println("la division de $num1 / $num2 = $total")
    }
    else if (num2 == 0) {
        println("no se puede  dividir por cero menso")
    }
}
fun main() {
    suma(10,10)
    resta(10,10)
    multiplicacion(10,10)
    division(10,0)
}


