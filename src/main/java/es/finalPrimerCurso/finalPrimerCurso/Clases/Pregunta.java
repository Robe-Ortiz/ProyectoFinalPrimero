package es.finalPrimerCurso.finalPrimerCurso.Clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Pregunta {
	
	private int numeroPregunta;
	private static int nextNumeroPregunta = 1;

	private String pregunta;
	private String respuestaCorrecta;
	private String respuestaIncorrectaA;
	private String respuestaIncorrectaB;
	private String respuestaIncorrectaC;
	private List<String> conjuntoDeRespuestas = new ArrayList<>();
	
	
	public Pregunta(String pregunta, String respuestaCorrecta, String respuestaIncorrectaA,
			String respuestaIncorrectaB, String respuestaIncorrectaC) {
		
		this.numeroPregunta = nextNumeroPregunta++;
		this.pregunta = pregunta;
		this.respuestaCorrecta = respuestaCorrecta;
		this.respuestaIncorrectaA = respuestaIncorrectaA;
		this.respuestaIncorrectaB = respuestaIncorrectaB;
		this.respuestaIncorrectaC = respuestaIncorrectaC;
		
		conjuntoDeRespuestas.add(this.respuestaCorrecta);
		conjuntoDeRespuestas.add(this.respuestaIncorrectaA);
		conjuntoDeRespuestas.add(this.respuestaIncorrectaB);
		conjuntoDeRespuestas.add(this.respuestaIncorrectaC);
		Collections.shuffle(conjuntoDeRespuestas);
	}
	
	
	
	public String getPregunta() {
		return pregunta;
	}

	public int getNumeroPregunta() {
		return numeroPregunta;
	}

	public String getRespuestaCorrecta() {
		return respuestaCorrecta;
	}

	public String getRespuestaIncorrectaA() {
		return respuestaIncorrectaA;
	}

	public String getRespuestaIncorrectaB() {
		return respuestaIncorrectaB;
	}

	public String getRespuestaIncorrectaC() {
		return respuestaIncorrectaC;
	}

	public List<String> getConjuntoDeRespuestas() {
		return conjuntoDeRespuestas;
	}



	@Override
	public String toString() {
		return String.format("Pregunta número : %d.\n"
				+ "%s\n"
				+ "Respuesta 1: %s\n"
				+ "Respuesta 2: %s\n"
				+ "Respuesta 3: %s\n"
				+ "Respuesta 4: %s\n"
				,numeroPregunta,
				pregunta,
				conjuntoDeRespuestas.get(0),
				conjuntoDeRespuestas.get(1),
				conjuntoDeRespuestas.get(2),
				conjuntoDeRespuestas.get(3));
	}
	
}
