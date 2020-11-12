package Aula08

class Cachorro(raca: String, peso: Double, altura: Int) : Animal(raca, peso, altura) {

    fun andar(){
        print("o cachorro está andando")
    }
}