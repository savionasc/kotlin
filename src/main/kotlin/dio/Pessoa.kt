package dio

class Pessoa {
    var nome: String = "Top"
    var cpf: String = "210.441.393-15"

    private set

    fun informacoes() = "$nome + $cpf"

    inner class Endereco {
        var rua: String = "Maria Baviera"
    }
}

fun main(){
    val fulano = Pessoa()

    println(fulano.nome)
    println(fulano.cpf)
    println(fulano.Endereco().rua)
    println(fulano.informacoes())
}