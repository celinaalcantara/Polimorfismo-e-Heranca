package animal

interface Animal constructor (val nome: String, var idade: Int) {

    abstract fun som()

    fun correr() {
        println("Correr")
    }

    fun subirArvore() {
        println("Subir na árvore.")
    }

}




