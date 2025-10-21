package Exercice7;

import java.io.Serializable;

public class Movie implements Serializable {
    private String titulo;
    private String genero;

    public Movie(String titulo, String genero)
    {
        this.titulo = titulo;
        this.genero = genero;
    }
}
