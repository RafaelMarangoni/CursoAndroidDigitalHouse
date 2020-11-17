package Aula10

class Foto(override var nome: String, override var tipoDoc: String) :Imprimivel {
    override fun imprimir(){
        println("eu sou uma self")
    }
}
