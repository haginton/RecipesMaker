import model.*

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

    var evaluar: Int
    do {
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
        9. Salir
        
    """.trimIndent()
        println(categoria)

        var listaCategoria: String? = readLine()
        evaluar = listaCategoria!!.toInt()

        if (evaluar.equals(1)){
            var agua = Agua(1)
            println("\n${agua.lista()}\n")
        }else if (evaluar.equals(2)){
            var leche = Leche(2)
            println("\n${leche.lista()}\n")
        }else if (evaluar.equals(3)){
            var carne = Carne(2)
            println("\n${carne.lista()}\n")
        }else if (evaluar.equals(4)){
            var verduras = Verduras(2)
            println("\n${verduras.lista()}\n")
        }else if (evaluar.equals(5)){
            var frutas = Frutas(2)
            println("\n${frutas.lista()}\n")
        }else if (evaluar.equals(6)){
            var cereal = Cereal(2)
            println("\n${cereal.lista()}\n")
        }else if (evaluar.equals(7)){
            var huevos = Huevos(2)
            println("\n${huevos.lista()}\n")
        }else if (evaluar.equals(8)){
            var aceites = Aceites(2)
            println("\n${aceites.lista()}\n")
        }
    }while (!evaluar.equals(9))

}

fun viewRecipe(){

    val recetas = """
        
        Ver mis recetas
        
    """.trimIndent()

    println(recetas)

}