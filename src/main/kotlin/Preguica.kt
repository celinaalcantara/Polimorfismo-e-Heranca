package abstractClasses

import animal.Animal

class Preguica(
    nome: String, idade: Int,
    val somPreguica: String
    ) : Animal(nome, idade) {

    override fun som (){
        println(somPreguica)
    }

    override fun subirArvore() {
        super.subirArvore()
    }
}