package Aula10

class Documento(override var nome: String, override var tipoDoc: String) : Imprimivel {
    override fun imprimir(){
        println("Eu sou um documento WORD")
    }
}


