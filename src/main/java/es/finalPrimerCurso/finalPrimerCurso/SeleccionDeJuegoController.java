package es.finalPrimerCurso.finalPrimerCurso;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

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

    }


}
