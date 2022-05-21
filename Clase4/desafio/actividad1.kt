fun main(args: Array<String>) {
    var i = 1
    var num = 3
    var acum = 0
    while (i <= 10) {
        val multi = num * i
        println("la multiplicacion de $num * $i = $multi")
        acum += i
        i++
        println("el total de esta multiplicacion $acum")
    }
}

