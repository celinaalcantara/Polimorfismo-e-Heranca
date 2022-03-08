package abstractClasses

import Animal

class Cavalo(
    nome: String, idade: Int,
    val somCavalo: String
) : Animal(nome, idade.toString()) {

    fun som (){
        println(somCavalo)
    }
    override fun correr(){
        super.correr()
    }

}