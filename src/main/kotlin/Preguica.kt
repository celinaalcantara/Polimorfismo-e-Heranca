package abstractClasses

import Animal

class Preguica(
    nome: String, idade: Int,
    somPreguica: String
) : Animal(nome, idade) {


    override fun subirArvore() {
        super.subirArvore()
    }

}