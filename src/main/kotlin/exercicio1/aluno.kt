package exercicio1

class aluno (
    val nome: String ="",
    val sobrenome: String = "",
    val ra: Int = 0) {

    fun assistirAula(): String{
        return "Alino $nome presente."
    }
    fun licaoDeCasa(): String{
        return "Aluno $nome realizou a lição."
    }
}