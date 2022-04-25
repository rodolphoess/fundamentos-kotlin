package fundamentos

fun main() {
    printaNumeros()
    printaNumerosAoContrario()
    printaPar1a10()
    printaRange(10, 20)
}


fun printaNumeros() {
    for (numero in 1 .. 10) {
        println(numero)
    }
}

fun printaNumerosAoContrario() {
    for (numero in 10 downTo 1) {
        println(numero)
    }
}

fun printaPar1a10() {
    for (numero in 2 .. 10 step 2) {
        println(numero)
    }
}

fun printaRange(inicio: Int, fim:Int) {
    for (numero in inicio .. fim) {
        println(numero)
    }
}