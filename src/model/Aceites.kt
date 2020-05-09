package model

class Aceites(cantidad: Int) : Ingredientes(cantidad), I_Ingredientes {

    private val disponible: String = """
         1. Aceite de Oliva
    """.trimIndent()

    override fun cantidad(): Int {
        return cantidad
    }

    override fun lista(): String {
        return disponible
    }
}