package

interface Animal (val nome: String, var idade: String){

    val somCachorro: String
    val somCavalo: String
    val somPreguica: String

        fun correr (){
            println("Correr")
        }

        fun subirArvore (){
            println("Subir na árvore")
        }

        fun som (){
            println(somCachorro)
        }
        fun som (){
            println(somCavalo)
        }
        fun som (){
            println(somPreguica)
        }

    }
