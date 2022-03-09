package abstractClasses

import animal.Animal

class Cachorro(
    nome: String, idade: Int,
    val somCachorro: String
    ) : Animal(nome, idade) {

    override fun som (){
        println(somCachorro)
    }

    override fun correr(){
        super.correr()
    }
}

