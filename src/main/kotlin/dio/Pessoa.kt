package dio

class Pessoa {
    var nome: String = "Top"
    var cpf: String = "210.441.393-15"
}

fun main(){
    val fulano = Pessoa()

    println(fulano.nome)
    println(fulano.cpf)
}