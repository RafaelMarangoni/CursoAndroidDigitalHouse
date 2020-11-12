package Aula09

open class Curso(var nome: String, var professorResponsavel: Professor) {
    var aluno = ArrayList<Aluno>()
    var aulas = ArrayList<Aula>()

    fun adicionarAluno(vararg : Aluno){}
}