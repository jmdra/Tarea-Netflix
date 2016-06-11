package com.jmdra.tareanetflix;

public class Padre {
	
	private String titulo;
	private String genero;
	private String creador;
	private double duracion;
	protected boolean visto = false;
	private double visualizado;
	
	@SuppressWarnings("static-access")
	public Padre(String titulo, String genero, String creador, double duracion, boolean visto) {		//Constructor Default
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
		this.visto = visto;
	}
	
	@SuppressWarnings("static-access")
	public Padre(String titulo, String creador){
		this.titulo = titulo;
		this.creador = creador;
		this.visto = false;
	}
	
	@SuppressWarnings("static-access")
	public Padre(String titulo, String genero, String creador, double duracion) {		//Constructor Default
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.duracion = duracion;
		this.visto = false;
	}

	@Override
	public String toString() {
		return "[titulo=" + titulo + ", genero=" + genero + ", creador=" + creador + ", duracion=" + duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public boolean isVisto() {
		return visto;
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}

	public double getVisualizado() {
		return visualizado;
	}

	public void setVisualizado(double visualizado) {
		this.visualizado = visualizado;
	}
	
	
	
	
	
}
