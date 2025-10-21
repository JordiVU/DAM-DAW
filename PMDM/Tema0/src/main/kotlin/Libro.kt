package com.dam

class Libro(autor: String, titulo: String, anyo: Int) {
    var autor: String = ""
    set(value)
    {
        field = if(value.isEmpty()) "Anonimo"
                else value
    }
    var titulo: String = ""
    set(value)
    {
        field = if(value.isEmpty()) "No indicado"
        else value
    }
    var anyo: Int = 0
    set(value)
    {
        field = if(value < 0) -1
        else value
    }

    init {
        this.autor = autor
        this.titulo = titulo
        this.anyo = anyo
    }

    override fun toString(): String {
        return "$titulo - $autor - $anyo"
    }
}