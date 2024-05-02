package Clases;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.finalPrimerCurso.finalPrimerCurso.Clases.Preguntas;

public class PreguntasTest {

	private Preguntas preguntas;
	
	@BeforeEach
	void setUp() {
		preguntas = new Preguntas();
	}
	
	@Test
	void cantidadPaisesYGetListaDePreguntas() {		
		assertEquals(204, Preguntas.getListaDePreguntas().size());
		assertFalse(Preguntas.getListaDePreguntas().isEmpty());
	}
	
	@Test
	void setYGetCantidadPreguntasOriginales() {
		Preguntas.setCantidadDePreguntasOriginal(1);
		assertEquals(1, Preguntas.getCantidadDePreguntasOriginal());		
	}
	
	@Test
	void setYGetCantidadPreguntas() {
		Preguntas.setCantidadDePreguntas(10);
		assertEquals(10, Preguntas.getCantidadDePreguntas());
	}
		
}
