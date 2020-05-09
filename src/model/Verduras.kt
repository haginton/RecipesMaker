package model

class Verduras(cantidad: Int) : Ingredientes(cantidad), I_Ingredientes {

    private val disponible: String = """
        1. Zanahoria
        2. Pimenton
        3. Cebolla
        4. Espinaca
        5. Coliflor
        6. Tomate
    """.trimIndent()

    override fun cantidad(): Int {
        return cantidad
    }

    override fun lista(): String {
        return disponible
    }

}