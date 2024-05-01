package Clases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.finalPrimerCurso.finalPrimerCurso.Clases.Pregunta;

public class PreguntaTest {
	
	private Pregunta pregunta;

	@BeforeEach
	void setUp() {
		pregunta = new Pregunta("¿Capital de España?","Madrid","Barcelona","Sevilla","Murcia");
	}
	
	@Test
	void constructorTest() {
		assertEquals("¿Capital de España?", pregunta.getPregunta());
		assertEquals("Madrid", pregunta.getRespuestaCorrecta());
		assertEquals("Barcelona", pregunta.getRespuestaIncorrectaA());
		assertEquals("Sevilla", pregunta.getRespuestaIncorrectaB());
		assertEquals("Murcia", pregunta.getRespuestaIncorrectaC());
	}
	
	@Test
	void toStringTest() {
		String resultado = pregunta.toString();
		String esperado = String.format("Pregunta número : %d.\n"
				+ "%s\n"
				+ "Respuesta 1: %s\n"
				+ "Respuesta 2: %s\n"
				+ "Respuesta 3: %s\n"
				+ "Respuesta 4: %s\n",
				pregunta.getNumeroPregunta(),
				pregunta.getPregunta(),
				pregunta.getConjuntoDeRespuestas().get(0),
				pregunta.getConjuntoDeRespuestas().get(1),
				pregunta.getConjuntoDeRespuestas().get(2),
				pregunta.getConjuntoDeRespuestas().get(3));
		assertEquals(esperado, resultado);
	}
}
