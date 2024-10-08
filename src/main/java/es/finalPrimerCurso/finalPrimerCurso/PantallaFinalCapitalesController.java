package es.finalPrimerCurso.finalPrimerCurso;

import javafx.fxml.FXML;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;

import javax.swing.SwingUtilities;

import es.finalPrimerCurso.finalPrimerCurso.Clases.CreaEImprimeGraficaCapitales;
import es.finalPrimerCurso.finalPrimerCurso.Clases.CrearEImprimirPDF;
import es.finalPrimerCurso.finalPrimerCurso.Clases.CrearEImprimirWord;
import es.finalPrimerCurso.finalPrimerCurso.Clases.Capitales;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

public class PantallaFinalCapitalesController {
	@FXML
	private Label textoFinal;
	private static int vecesDescargadoPDF = 0;
	private static int vecesDescargadoWord = 0;
	
	

	public static int getVecesDescargadoWord() {
		return vecesDescargadoWord;
	}

	public static int getVecesDescargadoPDF() {
		return vecesDescargadoPDF;
	}
	
	public static void aumentarVecesDescargadoPDF() {
		vecesDescargadoPDF++;
	}
	
	public static void aumentarVecesDescargadoWord() {
		vecesDescargadoWord++;
	}


	public void initialize(URL location, ResourceBundle resources) {
        textoFinal.setText("");
     
    }
	
   @FXML
    void btnGrafica(ActionEvent event) {
       SwingUtilities.invokeLater(() -> {
           CreaEImprimeGraficaCapitales example = new CreaEImprimeGraficaCapitales();
           example.setVisible(true);
           });
    }
    
    private void avisoDescargaPDF(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Información de descarga");
        alert.setContentText("El archivo pdf se ha descargado correctamente en el escritorio");
        alert.showAndWait();
    }
	
    private void avisoDescargaWord(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Información de descarga");
        alert.setContentText("El archivo word se ha descargado correctamente en el escritorio");
        alert.showAndWait();
    }
	

	// Event Listener on Button.onAction
	@FXML
	public void btnDescargarPDF(ActionEvent event) {
		CrearEImprimirPDF preguntasPDF = new CrearEImprimirPDF();
		avisoDescargaPDF(event);
	}

	// Event Listener on Button.onAction
	@FXML
	public void btnDescargarWord(ActionEvent event) {	
		CrearEImprimirWord preguntasWord = new CrearEImprimirWord();
		avisoDescargaWord(event);
			
	}

	// Event Listener on Button.onAction
	@FXML
	public void volverInicio(ActionEvent event) {
		try {
			PreguntasCapitalesController.restablecerPartida();
			Collections.shuffle(Capitales.getListaDePreguntas());
			App.setRoot("seleccionCantidadPreguntasCapitales");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

    @FXML
    void btnCerrarSesion(ActionEvent event) {
		try {
			PreguntasCapitalesController.restablecerPartida();
			Collections.shuffle(Capitales.getListaDePreguntas());
			App.setRoot("primeraEscena");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    @FXML
    void elegirJuego(ActionEvent event) {
		try {
			PreguntasCapitalesController.restablecerPartida();
			Collections.shuffle(Capitales.getListaDePreguntas());
			App.setRoot("SeleccionDeJuego");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
	

	// Event Listener on Button.onAction
	@FXML
	public void salirSimple(ActionEvent event) {
		System.exit(0);
	}
}
