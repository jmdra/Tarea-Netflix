package com.jmdra.tareanetflix;

public class Serie extends Padre implements IVisualizable{

	public Serie(String titulo, String genero, String creador, double duracion, boolean visto) {
		super(titulo, genero, creador, duracion, visto);
		// TODO Auto-generated constructor stub
	}

	public Serie(String titulo, String genero, String creador, double duracion, int numTemporadas) {
		super(titulo, genero, creador, duracion);
		// TODO Auto-generated constructor stub
		this.numTemporadas = numTemporadas;
	}

	public Serie(String titulo, String creador) {
		super(titulo, creador);
		// TODO Auto-generated constructor stub
	}
	
	private int numTemporadas = 1;

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	
	@Override
	public String toString() {
		return "Serie "+ super.toString() + ", numTemporadas=" + numTemporadas + " ]";
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
