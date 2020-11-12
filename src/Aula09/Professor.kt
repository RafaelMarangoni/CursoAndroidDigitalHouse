package Aula09

open class Professor(var nome: String, var RD: String) {

    fun darAula(aula: Materia){
        println("O professor $nome esta dando aula ${aula.nome}")
    }

    fun fazerChamada(){
        println("O professor $nome está fazendo a chamada")
    }
}