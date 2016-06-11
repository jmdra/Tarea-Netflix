package com.jmdra.tareanetflix;

import java.util.ArrayList;

public class Ejecutable {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Declarando y LLenando Datos del Array List de Peliculas
		ArrayList<Pelicula> movie = new ArrayList<Pelicula>();
		movie.add(new Pelicula("Gladiador", "Accion", "Matt Gilbert", 168.30, true));
		movie.add(new Pelicula("Piratas de Sillicon Valley", "John Who Knows"));
		movie.add(new Pelicula("XMen", "Heroes", "Charles Xavier", 160.60, 2015));
		movie.add(new Pelicula("Marvel Vs Capcom", "Fighting", "Kojima", 90, 2016));
		movie.add(new Pelicula("Need For Speed", "Sports", "EA", 250, 2011));
		
		Pelicula arrayPeli[] = movie.toArray(new Pelicula[movie.size()]);
		
		double totMinPeliculas = 0;
		double totMinSeries = 0;
		int mayorTemporada = 0;
		String mayorTempCompa = null;
		int peliculaReciente = 0;
		String peliculaRecienteCompa = null;
		
		/*Llenando Datos del Array de Pelicula
		arrayPeli[0] = new Pelicula("Gladiador", "Accion", "Matt Gilbert", 168.30, true);
		arrayPeli[1] = new Pelicula("Piratas de Sillicon Valley", "John Who Knows");
		arrayPeli[2] = new Pelicula("XMen", "Heroes", "Charles Xavier", 160.60, 2015);
		arrayPeli[3] = new Pelicula("Marvel Vs Capcom", "Fighting", "Kojima", 90, 2016);
		arrayPeli[4] = new Pelicula("Need For Speed", "Sports", "EA", 250, 2011);*/
		
		//Usando Metodos para Cambiar estado de Peliculas Visualizadas y sus minutos
		arrayPeli[0].tiempoVisto(30.5);
		arrayPeli[2].marcarVisto();
		arrayPeli[2].tiempoVisto(150.5);
		arrayPeli[4].marcarVisto();
		arrayPeli[4].tiempoVisto(120.00);
		
		//Declarando y LLenando Datos del Array List de Serie
		ArrayList<Serie> serie = new ArrayList<Serie>();
		serie.add(new Serie("HOW I MET YOUR MOTHER", "Sit Com", "Josh Radnor", 30, 9));
		serie.add(new Serie("The big bang Theory", "Comedia", "Jim Parson", 30, 8));
		serie.add(new Serie("Sillicon Valley", "Geek", "Patinski", 45, 2));
		serie.add(new Serie("Breaking Bad", "Dealer", "Walter White", 40, 7));
		serie.add(new Serie("Dragon Ball", "Anime", "Akira Toriyama", 25, 20));
		
		Serie arraySerie[] = serie.toArray(new Serie[serie.size()]);
		
		/*Llenando Datos del Array de Serie
		arraySerie[0] = new Serie("HOW I MET YOUR MOTHER", "Sit Com", "Josh Radnor", 30, 9);
		arraySerie[1] = new Serie("The big bang Theory", "Comedia", "Jim Parson", 30, 8);
		arraySerie[2] = new Serie("Sillicon Valley", "Geek", "Patinski", 45, 2);
		arraySerie[3] = new Serie("Breaking Bad", "Dealer", "Walter White", 40, 7);
		arraySerie[4] = new Serie("Dragon Ball", "Anime", "Akira Toriyama", 25, 20);*/
		
		//Usando Metodos para Cambiar estado de Series Visualizadas y sus minutos
		arraySerie[0].marcarVisto();
		arraySerie[0].tiempoVisto(400.3);
		arraySerie[4].marcarVisto();
		arraySerie[4].tiempoVisto(1000.3);
		
		System.out.println("----------------------------------------------");
		System.out.println("Lista de Peliculas Vistas y minutos visualizados: ");
		
		try {
			for (int i = 0; i < arrayPeli.length; i++) {
				if(peliculaReciente == 0){
					peliculaReciente = arrayPeli[i].getAnio();
					peliculaRecienteCompa = arrayPeli[i].toString();
				} else if(peliculaReciente <= arrayPeli[i].getAnio()){
					peliculaRecienteCompa = arrayPeli[i].toString();
				}
				
				if(arrayPeli[i].esVisto() == true){
					System.out.println(arrayPeli[i].getTitulo() + " - Vista - Minutos Vistos: " + arrayPeli[i].getVisualizado());
					totMinPeliculas += arrayPeli[i].getVisualizado();
				}
			
			}
		} catch (Exception e) {
			System.out.println("Ocurrió este error: ");
			e.printStackTrace();
		} finally {
			System.out.println("Minutos totales de Peliculas Vistos: " + totMinPeliculas);
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("Lista de Series Vistas y minutos visualizados: ");
		
		try {
			for (int i = 0; i < arraySerie.length; i++) {
				
				if(mayorTemporada == 0){
					mayorTemporada = arraySerie[i].getNumTemporadas();
					mayorTempCompa = arraySerie[i].toString();
				} else if(mayorTemporada <= arraySerie[i].getNumTemporadas() ){
					mayorTempCompa = arraySerie[i].toString();
				}
				
				
				if(arraySerie[i].esVisto() == true){
					System.out.println(arraySerie[i].getTitulo() + " Vista");
					totMinSeries += arraySerie[i].getVisualizado();
				}
			
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Ocurrió este error: ");
			e.printStackTrace();
		} finally {
			System.out.println("Minutos totales de Series Vistos: " + totMinSeries);
			System.out.println("----------------------------------------------");
			System.out.println("Serie con mas Temporadas:");
			System.out.println(mayorTempCompa);
			System.out.println("----------------------------------------------");
			System.out.println("Pelicula mas Reciente:");
			System.out.println(peliculaRecienteCompa);
		}	
	}

}
