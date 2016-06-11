package com.jmdra.tareanetflix;

import javax.swing.plaf.BorderUIResource.TitledBorderUIResource;

public class Pelicula extends Padre implements IVisualizable{

	public Pelicula(String titulo, String genero, String creador, double duracion, boolean visto) {
		super(titulo, genero, creador, duracion, visto);
		// TODO Auto-generated constructor stub
	}
	
	public Pelicula(String titulo, String creador) {
		super(titulo, creador);// TODO Auto-generated constructor stub
	}
	
	
	public Pelicula(String titulo, String genero, String creador, double duracion, int anio) {
		super(titulo, genero, creador, duracion);
		// TODO Auto-generated constructor stub
		this.anio = anio;
	}
	
	


	private int anio;

	
	
	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Pelicula "+ super.toString() + ", año=" + anio + " ]";
	}

	@Override
	public void marcarVisto() {
		// TODO Auto-generated method stub
		super.setVisto(true);
	}

	@Override
	public boolean esVisto() {
		// TODO Auto-generated method stub
		boolean vistoVerdadero = super.isVisto();
		return vistoVerdadero;
	}

	@Override 
	public double tiempoVisto(double tiempo) {
		// TODO Auto-generated method stub
		super.setVisualizado(tiempo);
		double tiempoVisto = super.getVisualizado();
		return tiempoVisto;
	}
}
