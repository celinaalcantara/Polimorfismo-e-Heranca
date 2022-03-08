package abstractClasses

import Animal

open class Cachorro(
    nome: String, idade: Int,
    val somCachorro: String
) : Animal(nome, idade) {


    override fun correr(){
        super.correr()
    }

}