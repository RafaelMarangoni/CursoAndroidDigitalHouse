package Aula09

open class Turma(var nome: String, var curso: Curso) {

    fun turma(){
        println("A turma $nome, está com o curso ${curso.nome}")
    }
}