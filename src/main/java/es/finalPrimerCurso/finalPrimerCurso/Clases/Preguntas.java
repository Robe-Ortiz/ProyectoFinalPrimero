package es.finalPrimerCurso.finalPrimerCurso.Clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Preguntas {

	private static List<Pregunta> listaDePreguntas = new ArrayList<>();
	private static int cantidadDePreguntasOriginal = 0;
	private static int cantidadDePreguntas = 0;
	
	
	public Preguntas() {
		listaDePreguntas.add(new Pregunta("¿Cuanto mido?","189cm.","187cm.","185cm.","191cm."));				
		listaDePreguntas.add(new Pregunta("¿Cómo me llamo?","Roberto","Raúl","René","Agustín"));		
		listaDePreguntas.add(new Pregunta("¿Cuántos años tengo?","30","20","10","40"));		
		listaDePreguntas.add(new Pregunta("¿Cuántos hijos tengo?","2","1","0","3"));		
		listaDePreguntas.add(new Pregunta("¿País orígen?","España","Francia","Congo","Rusia"));		
		listaDePreguntas.add(new Pregunta("¿Comida favorita?","Pizza","Pasta","Carne","Pescado"));		
		listaDePreguntas.add(new Pregunta("¿Mes de cumpleaños?","Mayo","Enero","Septiembre","Junio"));		
		listaDePreguntas.add(new Pregunta("¿Qué mascota tengo?","Tortuga","Perro","Gato","Pez"));		
		listaDePreguntas.add(new Pregunta("¿Marca de bicileta?","Canyon","Orbea","LaPierre","BH"));		
		listaDePreguntas.add(new Pregunta("¿Asignatura favorita?","Programación","Lenguaje de Marcas","Base de datos","Sistemas"));	
		Collections.shuffle(listaDePreguntas);
	}

	public static List<Pregunta> getListaDePreguntas() {
		return listaDePreguntas;
	}

	public static int getCantidadDePreguntas() {
		return cantidadDePreguntas;
	}

	public static int getCantidadDePreguntasOriginal() {
		return cantidadDePreguntasOriginal;
	}

	public static void setCantidadDePreguntas(int cantidadDePreguntas) {
		Preguntas.cantidadDePreguntas = cantidadDePreguntas;
	}

	public static void setCantidadDePreguntasOriginal(int cantidadDePreguntasOriginal) {
		Preguntas.cantidadDePreguntasOriginal = cantidadDePreguntasOriginal;
	}
	
	

	
	
	
	
}
