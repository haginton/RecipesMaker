package model

abstract class Ingredientes(var cantidad:Int){
    override fun toString(): String {
        return "\nCantidad: $cantidad"
    }
}