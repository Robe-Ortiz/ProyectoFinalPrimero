package es.finalPrimerCurso.finalPrimerCurso;

import javafx.fxml.FXML;

import java.io.IOException;

import es.finalPrimerCurso.finalPrimerCurso.Clases.Preguntas;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

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
		Preguntas.setCantidadDePreguntas(3);
		Preguntas.setCantidadDePreguntasOriginal(3);
		avanzar();
	}
	public void moderado(ActionEvent event) {
		Preguntas.setCantidadDePreguntas(5);
		Preguntas.setCantidadDePreguntasOriginal(5);
		avanzar();
	}
	public void dificil(ActionEvent event) {
		Preguntas.setCantidadDePreguntas(10);
		Preguntas.setCantidadDePreguntasOriginal(10);
		avanzar();
	}
	
	public void extremo(ActionEvent event) {
		Preguntas.setCantidadDePreguntas(Preguntas.getListaDePreguntas().size());
		Preguntas.setCantidadDePreguntasOriginal(Preguntas.getListaDePreguntas().size());
		PreguntasCapitalesController.iniciarModoExtremo();
		avanzar();
	}
	
}
