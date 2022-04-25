package fundamentos

fun main() {
    val listaImutavel = listOf(1, 2, 3, 4, 5, 6) //Lista imutável por causa do listOf()
    var listaMutavel = mutableListOf(11, 12, 13, 14, 15, 16) //Lista mutável por causa do mutableListOf()

    listaImutavel.forEach {
        elementList -> println(elementList)
    }

    listaMutavel.forEach { println(it) }
}