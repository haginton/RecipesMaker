import model.*

fun main(args: Array<String>){
    var evualuar: Int
    var resulRece: Receta = Receta()
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

        var receta = Receta()

        if (evualuar.equals(1)){
            //println("Escogiste la opcion: $respuesta Hacer una receta")
            resulRece = makeRecipe(receta)
        }else if (evualuar.equals(2)){
            //println("Escogiste la opcion: $respuesta Ver mis recetas")
            viewRecipe(resulRece)
        }else if (evualuar < 1 || evualuar > 3){
            println("Escoge una opcion entre el 1 al 3")
        }

    }while (!evualuar.equals(3))

    println("Saliste del programa, Escogiste la opcion $evualuar")

}

fun makeRecipe(receta: Receta) : Receta{

    var evaluar: Int
    var opcionIngrediente: Int
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

        //-------------AGUA-------------------
        if (evaluar.equals(1)){
            var agua = Agua(1)
            println("\n${agua.lista()}\n")

            var listaIngrediente: String? = readLine()
            opcionIngrediente = listaIngrediente!!.toInt()

            if (opcionIngrediente.equals(1)){
                receta.añadirIngrediente("Agua")
            }

        //-------------LECHE------------------
        }else if (evaluar.equals(2)){
            var leche = Leche(2)
            println("\n${leche.lista()}\n")

            var listaIngrediente: String? = readLine()
            opcionIngrediente = listaIngrediente!!.toInt()

            if (opcionIngrediente.equals(1)){
                receta.añadirIngrediente("Leche")
            }

        //-------------CARNE------------------
        }else if (evaluar.equals(3)){
            var carne = Carne(2)
            println("\n${carne.lista()}\n")

            var listaIngrediente: String? = readLine()
            opcionIngrediente = listaIngrediente!!.toInt()

            if (opcionIngrediente.equals(1)){
                receta.añadirIngrediente("Carne")
            }

        //-------------VERDURAS----------------
        }else if (evaluar.equals(4)){
            var verduras = Verduras(2)
            println("\n${verduras.lista()}\n")

            var listaIngrediente: String? = readLine()
            opcionIngrediente = listaIngrediente!!.toInt()

            if (opcionIngrediente.equals(1)){
                receta.añadirIngrediente("Zanahoria")
            }else if (opcionIngrediente.equals(2)){
                receta.añadirIngrediente("Pimenton")
            }else if (opcionIngrediente.equals(3)){
                receta.añadirIngrediente("Cebolla")
            }else if (opcionIngrediente.equals(4)){
                receta.añadirIngrediente("Espinaca")
            }else if (opcionIngrediente.equals(5)){
                receta.añadirIngrediente("Coliflor")
            }else if (opcionIngrediente.equals(6)){
                receta.añadirIngrediente("Tomate")
            }

        //-------------FRUTAS----------------
        }else if (evaluar.equals(5)){
            var frutas = Frutas(2)
            println("\n${frutas.lista()}\n")

            var listaIngrediente: String? = readLine()
            opcionIngrediente = listaIngrediente!!.toInt()

            if (opcionIngrediente.equals(1)){
                receta.añadirIngrediente("Fresa")
            }else if (opcionIngrediente.equals(2)){
                receta.añadirIngrediente("Plátano")
            }else if (opcionIngrediente.equals(3)){
                receta.añadirIngrediente("Uvas")
            }else if (opcionIngrediente.equals(4)){
                receta.añadirIngrediente("Manzana")
            }else if (opcionIngrediente.equals(5)){
                receta.añadirIngrediente("Naranja")
            }else if (opcionIngrediente.equals(6)){
                receta.añadirIngrediente("Pera")
            }else if (opcionIngrediente.equals(7)){
                receta.añadirIngrediente("Cereza")
            }

        //-------------CEREAL----------------
        }else if (evaluar.equals(6)){
            var cereal = Cereal(2)
            println("\n${cereal.lista()}\n")

            var listaIngrediente: String? = readLine()
            opcionIngrediente = listaIngrediente!!.toInt()

            if (opcionIngrediente.equals(1)){
                receta.añadirIngrediente("Avena")
            }else if (opcionIngrediente.equals(2)){
                receta.añadirIngrediente("Trigo")
            }else if (opcionIngrediente.equals(3)){
                receta.añadirIngrediente("Arroz")
            }else if (opcionIngrediente.equals(4)){
                receta.añadirIngrediente("Maiz")
            }

        //-------------HUEVOS----------------
        }else if (evaluar.equals(7)){
            var huevos = Huevos(2)
            println("\n${huevos.lista()}\n")

            var listaIngrediente: String? = readLine()
            opcionIngrediente = listaIngrediente!!.toInt()

            if (opcionIngrediente.equals(1)){
                receta.añadirIngrediente("Huevos")
            }

        //-------------ACEITES----------------
        }else if (evaluar.equals(8)){
            var aceites = Aceites(2)
            println("\n${aceites.lista()}\n")

            var listaIngrediente: String? = readLine()
            opcionIngrediente = listaIngrediente!!.toInt()

            if (opcionIngrediente.equals(1)){
                receta.añadirIngrediente("Aceite de Oliva")
            }
        }
    }while (!evaluar.equals(9))

    return receta
}

fun viewRecipe(receta: Receta){

    val recetas = """
        
        Ver mis recetas:
        
    """.trimIndent()

    println("$recetas")

    receta.mostrarReceta()

    println("\n")

}