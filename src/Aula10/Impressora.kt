package Aula10

class Impressora {
    var list =  mutableListOf<Imprimivel>()

    fun adicionaImpressao( item : Imprimivel){
        list.add(item)
    }

    fun imprimirLista(){
        for (item in list){
            println(item.nome)
        }
    }


}


