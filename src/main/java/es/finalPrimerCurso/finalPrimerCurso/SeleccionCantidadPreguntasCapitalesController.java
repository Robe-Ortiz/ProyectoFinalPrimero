package es.finalPrimerCurso.finalPrimerCurso;

import javafx.fxml.FXML;

import java.io.IOException;

import es.finalPrimerCurso.finalPrimerCurso.Clases.Capitales;
import javafx.event.ActionEvent;

public class SeleccionCantidadPreguntasCapitalesController {

	private void avanzar() {
		try {
			App.setRoot("preguntasCapitales");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Event Listener on Button.onAction
	@FXML
	public void facil(ActionEvent event) {
		Capitales.setCantidadDePreguntas(3);
		Capitales.setCantidadDePreguntasOriginal(3);
		avanzar();
	}
	public void moderado(ActionEvent event) {
		Capitales.setCantidadDePreguntas(5);
		Capitales.setCantidadDePreguntasOriginal(5);
		avanzar();
	}
	public void dificil(ActionEvent event) {
		Capitales.setCantidadDePreguntas(10);
		Capitales.setCantidadDePreguntasOriginal(10);
		avanzar();
	}
	
	public void extremo(ActionEvent event) {
		Capitales.setCantidadDePreguntas(Capitales.getListaDePreguntas().size());
		Capitales.setCantidadDePreguntasOriginal(Capitales.getListaDePreguntas().size());
		PreguntasCapitalesController.iniciarModoExtremo();
		avanzar();
	}
	
}
