package Aula09

fun main() {
    val materia = Materia("Kotlin")
    val aula = Aula("19:30","21:45", materia)
    val aluno = Aluno("00001", "Arao", "NeverGoat")
    val professor = Professor("Jaum", "13131366699924")
    val curso = Curso("Cansei", professor)
    val turma = Turma("GOAT", curso)

    curso.aluno.add(aluno)

    aluno.assistirAula(aula)
    aluno.deverDeCasa()
    professor.darAula(materia)
    professor.fazerChamada()

}