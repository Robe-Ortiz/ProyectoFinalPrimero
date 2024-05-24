package es.finalPrimerCurso.finalPrimerCurso;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SeleccionDeJuegoController {

    @FXML
    void capitalesMundiales(ActionEvent event) {
    	try {
			App.setRoot("SeleccionCantidadPreguntasCapitales");
		} catch (IOException e) {
		}
    }

    @FXML
    void extensionPaises(ActionEvent event) {

    }

}
