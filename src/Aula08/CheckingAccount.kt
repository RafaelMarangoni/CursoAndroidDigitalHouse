package Aula08

class CheckingAccount(var overDraft: Double, balance: Double, client: Client) : Account(balance, client) {

    fun depositCash( amount : Double){
        deposit(amount)
    }

    fun depositCheck(check : Check){
        balance+= check.value
        println("Seu saldo atual com deposito do check é $balance")
    }

    override fun withDraw(amount: Double): Double {
        if(balance + overDraft >= amount) {
         balance -= amount
        }else{
         println("Saldo da conta + cheque especial insuficiente, contate a tua agencia")
        }
        return balance
    }

}