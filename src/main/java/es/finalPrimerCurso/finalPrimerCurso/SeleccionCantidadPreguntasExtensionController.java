package es.finalPrimerCurso.finalPrimerCurso;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SeleccionCantidadPreguntasExtensionController {

	private void avanzar() {
		try {
			App.setRoot("preguntasExtension");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    @FXML
    void america(ActionEvent event) {
    	PreguntasExtensionController.setCantidadDePreguntas(10);
    	//PreguntasExtensionController.iniciarModoDeJuego("america");
    	avanzar();
    }

    @FXML
    void europa(ActionEvent event) {
    	PreguntasExtensionController.setCantidadDePreguntas(10);
    	PreguntasExtensionController.setModoDeJuego("europa");
    	avanzar();
    }
    
    @FXML
    void mundo(ActionEvent event) {
    	PreguntasExtensionController.setCantidadDePreguntas(10);
    	//PreguntasExtensionController.iniciarModoDeJuego("mundo");
    	avanzar();
    }

    @FXML
    void extremo(ActionEvent event) {
    	//PreguntasExtensionController.iniciarModoDeJuego("extremo");
    	avanzar();
    }

    
    

}
