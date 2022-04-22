package fundamentos

fun main() {

    var nome = "Rodolpho" // Valor mutável
    val nomeVal = "Rodolpho" //Valor imutável

    println(nome)

    nome = "Erick"
    //nomeVal = "Erick"

    println(nome)
}

class variaveis {
    lateinit var teste: String // Forma de declarar uma variável em uma classe sem ser iniciada de imediato

    fun iniciaVariavel() {
        teste = "Teste"
    }
}