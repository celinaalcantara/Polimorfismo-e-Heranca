package animal

interface Animal (val nome: String, var idade: String) {

    abstract fun som()

    fun correr() {
        println("Correr")
    }

    fun subirArvore() {
        println("Subir na árvore")
    }

}




