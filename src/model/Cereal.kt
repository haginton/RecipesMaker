package model

class Cereal(cantidad: Int) : Ingredientes(cantidad), I_Ingredientes {

    private val disponible: String = """
         1. Avena
         2. Trigo
         3. Arroz
         5. Maiz
    """.trimIndent()

    override fun cantidad(): Int {
        return cantidad
    }

    override fun lista(): String {
        return disponible
    }
}