package Aula06

class Pessoa(var nome: String, var idade: Int, var altura: Double, var peso: Double ) {

    init {
        print("Meu nome é $nome e minha idade é $idade")
    }

//    constructor ( nome: String, idade: Int, altura: Double){
//        this.nome = nome
//        this.idade = idade
//        this.altura = altura
//    }
}