
fun mostrarMayor() {
    fun mayor (x1: Int, x2: Int): Int {
        if (x1 > x2)
            return x1
        else
            return x2
    }

    val valor1 = 4
    val valor2 = 5
    println("El número mayor es el ${mayor(valor1, valor2)}")

}

fun main(args: Array<String>) {
    mostrarMayor()
}

