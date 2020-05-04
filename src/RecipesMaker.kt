fun main(args: Array<String>){
    var evualuar: Int
    do {
        val opciones = """
        :: Bienvenido a Recipe Maker

        
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()

        println(opciones)

        val respuesta: String? = readLine()
        evualuar = respuesta!!.toInt()

        if (evualuar.equals(1)){
            //println("Escogiste la opcion: $respuesta Hacer una receta")
            makeRecipe()
        }else if (evualuar.equals(2)){
            //println("Escogiste la opcion: $respuesta Ver mis recetas")
            viewRecipe()
        }else if (evualuar < 1 || evualuar > 3){
            println("Escoge una opcion entre el 1 al 3")
        }

    }while (!evualuar.equals(3))

    println("Saliste del programa, Escogiste la opcion $evualuar")

}

fun makeRecipe(){
    val categoria = """
        
        Hacer receta
        Seleciona por categoría el ingrediente que buscas
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceites
        
    """.trimIndent()
    println(categoria)
}

fun viewRecipe(){

    val recetas = """
        
        Ver mis recetas
        
    """.trimIndent()

    println(recetas)

}