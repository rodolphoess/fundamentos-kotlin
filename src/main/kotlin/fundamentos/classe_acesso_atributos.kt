package fundamentos

class Carro(var cor: String, var anoFabricacao: Int, val dono: Dono) {

}

data class Dono(var nome: String, var idade: Int) {

}

fun main() {
    val carro = Carro("Branco", 2021, Dono("Rodolfo", 31))

    println(carro.cor)

    carro.cor = "Preto"
    println(carro.cor)

    println(carro.dono.nome)

    carro.dono.nome = "Rodolpho"
    println(carro.dono.nome)
}