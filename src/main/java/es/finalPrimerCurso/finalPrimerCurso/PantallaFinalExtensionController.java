package es.finalPrimerCurso.finalPrimerCurso;

import java.io.IOException;
import javax.swing.SwingUtilities;
import es.finalPrimerCurso.finalPrimerCurso.Clases.CreaEImprimeGraficaExtension;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PantallaFinalExtensionController {
	
    @FXML
    void btnGrafica(ActionEvent event) {
        SwingUtilities.invokeLater(() -> {
            CreaEImprimeGraficaExtension example = new CreaEImprimeGraficaExtension();
            example.setVisible(true);
            });
    }

    @FXML
    void btnCerrarSesion(ActionEvent event) {
		try {
			PreguntasExtensionController.restablecerPartida();
			App.setRoot("primeraEscena");
		} catch (IOException e) {
		}
    }

    @FXML
    void elegirJuego(ActionEvent event) {
		try {
			PreguntasExtensionController.restablecerPartida();
			App.setRoot("SeleccionDeJuego");
		} catch (IOException e) {
		}
    }


    @FXML
    void volverInicio(ActionEvent event) {
		try {
			PreguntasExtensionController.restablecerPartida();
			App.setRoot("seleccionCantidadPreguntasExtension");
		} catch (IOException e) {
		}
    }
    
    @FXML
    void salirSimple(ActionEvent event) {
    	System.exit(0);
    }


}
