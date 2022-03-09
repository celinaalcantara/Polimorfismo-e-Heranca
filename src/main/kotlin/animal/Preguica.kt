package animal

class Preguica(
    nome: String, idade: Int,
    val somPreguica: String
    ) : Animal(nome, idade) {

    override fun som (){
        println(somPreguica)
    }

    fun subirArvore() {
        println("Subir na árvore.")
    }
}