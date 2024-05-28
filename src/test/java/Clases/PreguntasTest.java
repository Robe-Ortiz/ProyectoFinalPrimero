package Clases;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.finalPrimerCurso.finalPrimerCurso.Clases.Capitales;

public class PreguntasTest {

	private Capitales preguntas;
	
	@BeforeEach
	void setUp() {
		preguntas = new Capitales();
	}
	
	@Test
	void cantidadPaisesYGetListaDePreguntas() {		
		assertEquals(204, Capitales.getListaDePreguntas().size());
		assertFalse(Capitales.getListaDePreguntas().isEmpty());
	}
	
	@Test
	void setYGetCantidadPreguntasOriginales() {
		Capitales.setCantidadDePreguntasOriginal(1);
		assertEquals(1, Capitales.getCantidadDePreguntasOriginal());		
	}
	
	@Test
	void setYGetCantidadPreguntas() {
		Capitales.setCantidadDePreguntas(10);
		assertEquals(10, Capitales.getCantidadDePreguntas());
	}
		
}
