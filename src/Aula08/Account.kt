package Aula08

open class Account (var balance: Double, val client: Client){

    fun deposit(anount: Double): Double{
        balance += anount
        return balance
    }

    open fun withDraw(anount: Double):Double {
        if(balance <= anount){
            print("saldo insuficiente")
        }else{
            balance -= anount
        }
        print("Seu saldo atual é $balance")
        return balance
    }

    fun checkBalance():Double{
        return balance
    }


}