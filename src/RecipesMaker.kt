fun main(){
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
            println("Escogiste la opcion: $respuesta Hacer una receta")
        }else if (evualuar.equals(2)){
            println("Escogiste la opcion: $respuesta Ver mis recetas")
        }else if (evualuar < 1 || evualuar > 3){
            println("Escoge una opcion entre el 1 al 3")
        }

    }while (!evualuar.equals(3))

    println("Saliste del programa, Escogiste la opcion $evualuar")

}