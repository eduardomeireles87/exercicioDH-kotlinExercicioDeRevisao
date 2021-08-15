package exercicio3

class estoque (var nomeProduto: String, var qtdeAtual: Int, var qtdeMinima: Int) {
    init {
        if (qtdeAtual < 0) qtdeAtual = 0
        if (qtdeMinima < 0) qtdeMinima = 0
    }

    fun mudarNome(nome: String): Unit{
        nomeProduto = nome
    }

    fun mudarQtdMinima(qtde: Int): Unit{
        qtdeMinima = qtde
    }

    fun repor(qtde: Int): Unit{
        qtdeAtual += qtde
    }

    fun darBaixa(qtde: Int): Unit{
        qtdeAtual -= qtde
    }

    fun mostrar(): String{
        return "Produto: ${nomeProduto} :: Qtde Mínima: ${qtdeMinima} :: Qtde Atual: ${qtdeAtual}"
    }

    fun precisaRepor(): Boolean{
        return qtdeAtual <= qtdeMinima
    }
}