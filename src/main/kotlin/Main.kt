import animal.Cachorro
import animal.Cavalo
import animal.Preguica

fun main() {

    val cachorro = Cachorro("Gracinha", 7, "Au-au")
    val cavalo = Cavalo("Jairo", 16, "Hinn in in")
    val preguica = Preguica("Edd", 3, "Aaaaah")

    cachorro.som()

    cavalo.som()

    preguica.som()

}

