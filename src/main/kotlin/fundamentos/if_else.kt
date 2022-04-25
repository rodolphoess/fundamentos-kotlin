package fundamentos

fun main() {
    parOuImpar(1)
    parOuImpar(2)

    resultadoDaNota(3)
    resultadoDaNota(5)
    resultadoDaNota(8)
}

fun parOuImpar(numero: Int) {
    return if (numero % 2 == 0 ) {
        println("Par")
    } else {
        println("Ímpar")
    }
}

fun resultadoDaNota(nota: Int) {
    if (nota >= 6) {
        println("Passou")
    } else if (nota >= 4) {
        println("Recuperação")
    } else {
        println("Reprovou")
    }
}