package fundamentos

class MinhaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    companion object {
        fun criaClasse(): MinhaClasse {
            return MinhaClasse("Rodolpho", "Rua Ficticia", 30)
        }
    }
}

class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
) {
    fun criaClasse(): SegundaClasse {
        return SegundaClasse("Rodolpho", "Rua Ficticia", 30)
    }
}

fun main() {

    var segundaClasse = SegundaClasse("Nome invalido", "Rua invalida", 30).criaClasse()

    var minhaClasse = MinhaClasse.criaClasse()  //Se comporta como uma classe estática no Java
}