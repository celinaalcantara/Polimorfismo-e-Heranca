package Animal

import Animal

open class Cachorro(
    nome: String, idade: Int,
    val somCachorro: String
) : Animal(nome, idade) {

    fun som(): String{
        super.som()
    }

    override fun correr(){
        super.correr()
    }

}