package exercicio2

fun main (){
    //criando itens no pedido
    var item1 = item(1, "monitor aoc", 5, 100.0)
    var item2 = item(2, "mouse", -3, 50.0)
    var item3 = item(3, "teclado", -1, 10.0)

    //criando lista de pedido
    var listaItem:MutableList<item> = arrayListOf()

    //adicionando itens no pedido
    listaItem.add(item1)
    listaItem.add(item2)
    listaItem.add(item3)

    //criando uma fatura do pedido
    var fatura1 = fatura (listaItem)

    //cálculo valor da fatura do pedido
    fatura1.totalDaFatura()
    println (listaItem.get(0).itemQuantidade)
}