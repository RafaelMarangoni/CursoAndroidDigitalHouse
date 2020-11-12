package Aula08

class SavingsAccount( var interest : Double, balance: Double, client: Client) : Account(balance, client){

    fun collectInterest(){
        balance *= interest
        println("Seu saldo com a coleta de juros é $balance")
    }

}