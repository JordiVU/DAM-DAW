package modules;

import java.io.Serializable;
import java.util.Date;

//Clase encargada de seralizar la informacion de las canciones.
public class Cancion implements Serializable {
	 private static final long serialVersionUID = 1L;
	 
	 private Date fechaAlta;
	 private String titulo;
	 private String artista;
	 private String album;
	 private String anio;
	 private String comentario;
	 private int genero;
	 
	 public Cancion(Date fechaAlta, String titulo, String artista, String album,
			 String anio, String comentario, int genero) {
		 this.titulo = titulo;
		 this.artista = artista;
		 this.album = album;
		 this.anio = anio;
		 this.comentario = comentario;
		 this.genero = genero;
		 this.fechaAlta = fechaAlta;

	 }
	 
	 @Override
	 public String toString() {
		 return "Fecha de alta: " + fechaAlta + "\nTitulo: " + titulo + "\nArtista: " + artista + 
				 "\nAlbum: " + album +  "\nAño: " + anio + "\nComentario: " + comentario + "\nGenero: " + genero;
	 }

}
