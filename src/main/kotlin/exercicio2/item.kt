package exercicio2

class item  (var itemNumero: Int, var itemDescricao: String, var itemQuantidade: Int=0, var itemPreco: Double=0.0){
    init {
        if (itemQuantidade <0){
            itemQuantidade = 0
        }
        if (itemPreco <0) {
            itemPreco = 0.0
        }
    }
}