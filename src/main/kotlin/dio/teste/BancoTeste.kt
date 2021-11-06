package dio.teste

import dio.Banco

fun main(){
    val meuBanco = Banco(nome = "fulano", numero = 11)
    val banco2 = meuBanco.copy(nome = "banco2")

    println(meuBanco.info())
    println(banco2.info())
}