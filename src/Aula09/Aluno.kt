package Aula09

open class Aluno(var RA: String,var nome: String,var sobreNome: String ) {

    open fun assistirAula(aula : Aula){
        println("O aluno $nome esta Presente na aula de ${aula.materia.nome} ")
    }

    open fun deverDeCasa(){
        println("O $nome esta estudando")
    }


}