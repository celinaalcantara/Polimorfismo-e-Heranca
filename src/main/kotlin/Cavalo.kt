package abstractClasses

import animal.Animal

class Cavalo(
    nome: String, idade: Int,
    val somCavalo: String
    ) : Animal(nome, idade) {

    override fun som (){
        println(somCavalo)
    }

    override fun correr(){
        super.correr()
    }
}