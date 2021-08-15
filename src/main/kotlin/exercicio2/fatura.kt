package exercicio2

class fatura (var faturaListaDeitens:MutableList<item>) {
    var faturaValor: Double = 0.0

    fun totalDaFatura(){
        faturaListaDeitens.forEach(){faturaValor = ((faturaValor+it.itemPreco)*it.itemQuantidade)}
    println ("Valor da fatura: $faturaValor")
    }
}