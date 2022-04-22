package fundamentos

fun main() {

    println("Hello " + retornaNome() + "!")

    dizOi("Rodolpho")
    dizOi(idade = 30, nome = "Rodolpho")
}

fun retornaNome(): String {
    return "Rodolpho"
}

fun dizOi(nome: String, idade: Int = 20) {
    println("Oi ${nome}! Parabéns pelos seus ${idade} anos.")
}