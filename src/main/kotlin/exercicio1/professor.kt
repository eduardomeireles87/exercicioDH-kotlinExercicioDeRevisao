package exercicio1

class professor (
    val nome: String ,
    val registroDoc: Int) {

    fun validaProfessor (confChamada: Boolean, confPresenca: Boolean){
        if (confChamada && confPresenca){
            println ("Professor presente e chamada realizada.")
        } else {
            println ("Professor ausente.")
        }
    }
}