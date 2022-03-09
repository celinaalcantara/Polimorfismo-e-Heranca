package animal

class Cavalo(
    nome: String, idade: Int,
    val somCavalo: String
    ) : Animal(nome, idade) {

    override fun som (){
        println(somCavalo)
    }

    fun correr() {
        println("Correr")
    }
}