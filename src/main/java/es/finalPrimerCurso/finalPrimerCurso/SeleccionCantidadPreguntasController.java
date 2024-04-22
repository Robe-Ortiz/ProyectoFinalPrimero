package es.finalPrimerCurso.finalPrimerCurso;

import javafx.fxml.FXML;

import java.io.IOException;

import es.finalPrimerCurso.finalPrimerCurso.Clases.Preguntas;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

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
		avanzar();
	}
	public void btn5(ActionEvent event) {
		Preguntas.setCantidadDePreguntas(5);
		avanzar();
	}
	public void btn10(ActionEvent event) {
		Preguntas.setCantidadDePreguntas(10);
		avanzar();
	}
	
	int salir = 0;
    @FXML
    void btnSalir(ActionEvent event) {
    	switch (salir) {
		case 0:
    		mostrarErrorSalir1(event);
    		salir++;
			break;
		case 1:
			mostrarErrorSalir2(event);
			salir++;
			break;
		default:
			mostrarErrorSalir3(event);
    	System.exit(0);
		}
    }
    
    @FXML
    private void mostrarErrorSalir1(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText(null);
        alert.setTitle("1/3");
        alert.setContentText("Supongo que has clickeado por error, no te preocupes que te dejo dentro.");
        alert.showAndWait();
    }
    @FXML
    private void mostrarErrorSalir2(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText(null);
        alert.setTitle("2/3");
        alert.setContentText("Empiezo a pensar que no te has equivocado y que quieres salir.");
        alert.showAndWait();
    }
    
    @FXML
    private void mostrarErrorSalir3(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("3/3");
        alert.setContentText("¡¡ ADIOS NO VUELVAS !!");
        alert.showAndWait();
    }
	
	
}
