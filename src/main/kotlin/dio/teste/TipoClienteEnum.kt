package dio.teste

import dio.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elem ->
        println("${elem.name} : ${elem}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} : ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println(pf.descricao)

    val pj = ClienteTipo.PJ
    println(pj.name)
}