package Aula10

class Contrato(override var nome: String, override var tipoDoc: String )  : Imprimivel {

    override fun imprimir() {
        println("“Sou um contrato muito legal")
    }
}