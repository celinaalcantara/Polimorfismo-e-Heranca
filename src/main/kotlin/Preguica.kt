package abstractClasses

import Animal

class Preguica(
    nome: String, idade: Int,
    val somPreguica: String
) : Animal(nome, idade) {


    fun som (){
        println(somPreguica)
    }

    override fun subirArvore() {
        super.subirArvore()
    }

}