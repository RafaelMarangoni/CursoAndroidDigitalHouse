import Aula10.Contrato
import Aula10.Documento
import Aula10.Foto
import Aula10.Impressora

fun main() {

    var foto = Foto("Selfie", "Foto")
    var contrato = Contrato("15k", "contrato rulez")
    var documento = Documento("Doc", "pdf")
    var impressora = Impressora()

    impressora.adicionaImpressao(foto)
    impressora.adicionaImpressao(contrato)
    impressora.adicionaImpressao(documento)

    impressora.imprimirLista()
}