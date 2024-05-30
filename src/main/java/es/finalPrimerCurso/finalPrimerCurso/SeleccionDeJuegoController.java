package es.finalPrimerCurso.finalPrimerCurso;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class SeleccionDeJuegoController {

	
	private void avanzar(String pantalla) {
    	try {
			App.setRoot(pantalla);
		} catch (IOException e) {
		}
	}
	
    @FXML
    void capitalesMundiales(ActionEvent event) {
    	avanzar("SeleccionCantidadPreguntasCapitales");
    }

    @FXML
    void extensionPaises(ActionEvent event) {
    	avanzar("SeleccionCantidadPreguntasExtension");
    }
    
    @FXML
    void adivinaLaPalabra(ActionEvent event) {
    	avisoEnConstruccion(event);
    }

    
    private void avisoEnConstruccion(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Juego no disponible");
        alert.setContentText("Actualmente este juego no está disponible");
        alert.showAndWait();
    }

}
