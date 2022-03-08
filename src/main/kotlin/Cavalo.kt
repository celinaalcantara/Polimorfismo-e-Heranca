package abstractClasses

import Animal

class Cavalo(
    nome: String, idade: Int,
    somCavalo: String
) : Animal(nome, idade.toString()) {


    override fun correr(){
        super.correr()
    }

}