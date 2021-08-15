package exercicio3

fun main(){
    var tablet = estoque("Tablet", 2, 8)

    println(tablet.mostrar())
    tablet.mudarNome("Tablet Samsung")
    tablet.mudarQtdMinima(5)
    println("Precisa repor? ${tablet.precisaRepor()}")
    tablet.darBaixa(1)
    tablet.repor(10)
    println("Precisa repor? ${tablet.precisaRepor()}")
    println(tablet.mostrar())
}