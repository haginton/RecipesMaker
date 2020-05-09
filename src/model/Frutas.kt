package model

class Frutas(cantidad: Int) : Ingredientes(cantidad), I_Ingredientes {

    private val disponible: String = """
         1. Fresa
         2. Plátano
         3. Uvas
         4. Manzana
         5. Naranja
         6. Pera
         7. Cereza
    """.trimIndent()

    override fun cantidad(): Int {
        return cantidad
    }

    override fun lista(): String {
        return disponible
    }
}