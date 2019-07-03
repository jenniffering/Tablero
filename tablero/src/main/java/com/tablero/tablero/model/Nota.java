package com.tablero.tablero.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Nota")

public class Nota {
	@Id
	private String idNota;
	private String nombreNota;
	private String titulo;
	private String contenido;
	private String autor;

	public Nota(String idNota, String nombreNota, String titulo, String contenido, String autor) {
		this.idNota = idNota;
		this.nombreNota = nombreNota;
		this.titulo = titulo;
		this.contenido = contenido;
		this.autor = autor;
	}
	
	public Nota() {}
	
	

	public String getIdNota() {
		return idNota;
	}



	public void setIdNota(String idNota) {
		this.idNota = idNota;
	}



	public String getNombreNota() {
		return nombreNota;
	}

	public void setNombreNota(String nombreNota) {
		this.nombreNota = nombreNota;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
