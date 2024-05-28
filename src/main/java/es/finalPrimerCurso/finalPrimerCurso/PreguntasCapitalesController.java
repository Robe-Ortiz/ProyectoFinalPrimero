package es.finalPrimerCurso.finalPrimerCurso;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import es.finalPrimerCurso.finalPrimerCurso.Clases.Capitales;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PreguntasCapitalesController implements Initializable {

	private static int preguntasContestadas = 0;
	private static boolean modoExtremo;
	private static int errores = 0;
	private static int index = 0;
	private static Map<Integer, Integer> preguntaError = new HashMap<>();

	@FXML
	private Label pregunta;
	@FXML
	private Button respuesta1;
	@FXML
	private Button respuesta2;
	@FXML
	private Button respuesta3;
	@FXML
	private Button respuesta4;

	public static Map<Integer, Integer> getPreguntaError() {
		return new HashMap<>(preguntaError);
	}

	public static int getErrores() {
		return errores;
	}
	
	public static int getPreguntasContestadas() {
		return preguntasContestadas;
	}

	public static void restablecerPartida() {
		modoExtremo = false;
		errores = 0;
		index = 0;
		preguntaError.clear();
		preguntasContestadas = 0;
	}
	
	public static void iniciarModoExtremo() {
		modoExtremo = true;
	}

	public void initialize(URL location, ResourceBundle resources) {
		pregunta.setText(Capitales.getListaDePreguntas().get(index).getPregunta());
		respuesta1.setText(Capitales.getListaDePreguntas().get(index).getConjuntoDeRespuestas().get(0));
		respuesta2.setText(Capitales.getListaDePreguntas().get(index).getConjuntoDeRespuestas().get(1));
		respuesta3.setText(Capitales.getListaDePreguntas().get(index).getConjuntoDeRespuestas().get(2));
		respuesta4.setText(Capitales.getListaDePreguntas().get(index).getConjuntoDeRespuestas().get(3));
	}

	private void mensajeRespuestaIncorrecta(ActionEvent event) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setHeaderText(null);
		alert.setTitle("Respuesta incorrecta");
		alert.setContentText(String.format("Respuesta incorrecta, vuelve a intentarlo."));
		alert.showAndWait();
	}

	private void mensajeRespuestaIncorrectaModoExtremo(ActionEvent event) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setHeaderText(null);
		alert.setTitle("Fin de la partida");
		alert.setContentText(String.format("En el modo extremo estás eliminado si tienes un fallo.\n"
				+"Número de aciertos: "+ index));
		alert.showAndWait();
	}

	private void respuestaIncorrecta(ActionEvent event) {
		mensajeRespuestaIncorrecta(event);
		preguntaError.put(index, preguntaError.getOrDefault(index, 0) + 1);
		errores++;
	}
	
	private void respuestaIncorrectaModoExtremo(ActionEvent event) {
		mensajeRespuestaIncorrectaModoExtremo(event);
		preguntaError.put(index, preguntaError.getOrDefault(index, 0) + 1);
		try {
			App.setRoot("pantallaFinalCapitales");
		}catch (IOException e) {
		}
	}

	private void mensajeResultado(ActionEvent event) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setHeaderText(null);
		alert.setTitle("Enhorabuena por contestar todas las preguntas");
		alert.setContentText(
				"Cantidad de preguntas: " + Capitales.getCantidadDePreguntasOriginal() + "\n" + "Errores: " + +errores);
		alert.showAndWait();
	}

	private void avanzar() {
		Capitales.setCantidadDePreguntas(Capitales.getCantidadDePreguntas() - 1);

		if (Capitales.getCantidadDePreguntas() == 0) {
			try {
				mensajeResultado(null);
				App.setRoot("pantallaFinalCapitales");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				index++;
				preguntasContestadas++;
				App.setRoot("preguntasCapitales");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@FXML
	public void btnRespuesta1(ActionEvent event) {
		if(respuesta1.getText().equals(Capitales.getListaDePreguntas().get(index).getRespuestaCorrecta())) {
			avanzar();
		}else if(modoExtremo) {	
			respuestaIncorrectaModoExtremo(event);
		}else {	
			respuestaIncorrecta(event);
		}
	}

	@FXML
	public void btnRespuesta2(ActionEvent event) {
		if (respuesta2.getText().equals(Capitales.getListaDePreguntas().get(index).getRespuestaCorrecta())) {
			avanzar();
		}else if(modoExtremo) {	
			respuestaIncorrectaModoExtremo(event);
		}else {	
			respuestaIncorrecta(event);
		}
	}

	@FXML
	public void btnRespuesta3(ActionEvent event) {
		if (respuesta3.getText().equals(Capitales.getListaDePreguntas().get(index).getRespuestaCorrecta())) {
			avanzar();
		}else if(modoExtremo) {	
			respuestaIncorrectaModoExtremo(event);
		}else {	
			respuestaIncorrecta(event);
		}
	}

	@FXML
	public void btnRespuesta4(ActionEvent event) {
		if (respuesta4.getText().equals(Capitales.getListaDePreguntas().get(index).getRespuestaCorrecta())) {
			avanzar();
		}else if(modoExtremo) {	
			respuestaIncorrectaModoExtremo(event);
		}else {	
			respuestaIncorrecta(event);
		}
	}

	@FXML
	void btnReset(ActionEvent event) {
		try {
			PreguntasCapitalesController.restablecerPartida();
			Collections.shuffle(Capitales.getListaDePreguntas());
			App.setRoot("seleccionCantidadPreguntasCapitales");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
