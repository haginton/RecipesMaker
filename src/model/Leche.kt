package model

class Leche(cantidad: Int): Ingredientes(cantidad), I_Ingredientes {

    private val disponible: String = """
        1. Leche
    """.trimIndent()

    override fun cantidad(): Int {
        return cantidad
    }

    override fun lista(): String {
        return disponible
    }

}