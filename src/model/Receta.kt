package model

class Receta() {
    //private var receta = ArrayList<String>()
    private var receta = mutableListOf<String>()

    fun añadirIngrediente(ingrediente: String){
        receta.add(ingrediente)
    }

    fun mostrarReceta(){
        var consecutivo: Int = 1
        for (listar in receta){
            println("$consecutivo - $listar")
            consecutivo++
        }
    }

    /*fun setReceta(receta: ArrayList<String>){
        this.receta = receta
    }

    fun getReceta():ArrayList<String>{
        return this.receta
    }*/
}