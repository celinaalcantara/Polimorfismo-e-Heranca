package animal

class Cachorro(
    nome: String, idade: Int,
    val somCachorro: String
    ) : Animal(nome, idade) {

    override fun som (){
        println(somCachorro)
    }

    fun correr() {
        println("Correr")
    }
}

