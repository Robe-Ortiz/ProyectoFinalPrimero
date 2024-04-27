package es.finalPrimerCurso.finalPrimerCurso;

import javafx.fxml.FXML;

import java.io.IOException;

import es.finalPrimerCurso.finalPrimerCurso.Clases.Preguntas;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class SeleccionCantidadPreguntasController {

	private void avanzar() {
		try {
			App.setRoot("preguntas");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Event Listener on Button.onAction
	@FXML
	public void btn3(ActionEvent event) {
		Preguntas.setCantidadDePreguntas(3);
		Preguntas.setCantidadDePreguntasOriginal(3);
		avanzar();
	}
	public void btn5(ActionEvent event) {
		Preguntas.setCantidadDePreguntas(5);
		Preguntas.setCantidadDePreguntasOriginal(5);
		avanzar();
	}
	public void btn10(ActionEvent event) {
		Preguntas.setCantidadDePreguntas(10);
		Preguntas.setCantidadDePreguntasOriginal(10);
		avanzar();
	}
}
