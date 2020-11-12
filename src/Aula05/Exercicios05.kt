package Aula05

//fun main() {
//    print(retornaSomaPres(listOf(1,2,3,4,5,6,7)))
//}

fun retornaSomaPres(valores: List<Int>): Int {
    var soma = 0

    for (elemento in valores) {
        if (elemento % 2 == 0) {
            soma += elemento
        }
    }
    return soma
}