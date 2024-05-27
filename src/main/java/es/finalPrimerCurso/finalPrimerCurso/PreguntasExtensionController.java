package es.finalPrimerCurso.finalPrimerCurso;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.ResourceBundle;
import es.finalPrimerCurso.finalPrimerCurso.Clases.ExtensionPaises;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;


public class PreguntasExtensionController implements Initializable{

    @FXML
    private Button pais1;

    @FXML
    private Button pais2;

    private static String modoDeJuego;
    private Map<String,Double> mapaDeLaPartida = mapaParaJugar();
    private static Random random = new Random();  
    private static int errores = 0;
    private static int cantidadDePreguntas = 0;
  
    
   
    public static void setModoDeJuego(String modoDeJuego) {
		PreguntasExtensionController.modoDeJuego = modoDeJuego;
	}


	public static void setCantidadDePreguntas(int cantidadDePreguntas) {
		PreguntasExtensionController.cantidadDePreguntas = cantidadDePreguntas;
	}
    
    
	private void mensajeResultado(ActionEvent event) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setHeaderText(null);
		alert.setTitle("Enhorabuena por contestar todas las preguntas");
		alert.setContentText(
				"Cantidad de preguntas: 10\n" + "Errores: " + errores);
		alert.showAndWait();
	}
    
    private void avanzar(ActionEvent event) {
    	
    	if(cantidadDePreguntas == 0) {
    		mensajeResultado(event);
    		try {
    			App.setRoot("SeleccionDeJuego");
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}else {
    		cantidadDePreguntas--;
    		try {
    			App.setRoot("preguntasExtension");
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}
    }
    
	private void mensajeError(ActionEvent event) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setHeaderText(null);
		alert.setTitle("Ups, parece que te has equivocado");
		alert.setContentText(String.format("%s: %.4f millones de km²\n"
										+ "%s: %.4f millones de km²", pais1.getText(), mapaDeLaPartida.get(pais1.getText()),
										pais2.getText(),mapaDeLaPartida.get(pais2.getText())));
		alert.showAndWait();
	}

	@FXML
    void btnReset(ActionEvent event) {
		errores = 0;
		cantidadDePreguntas = 10;
    }

    @FXML   
    void btnpais1(ActionEvent event) {
        if (mapaDeLaPartida.get(pais1.getText()) > mapaDeLaPartida.get(pais2.getText())) {
        
        } else {
        	mensajeError(event);
            errores++;
        }
        avanzar(event);
    }

    @FXML
    void btnpais2(ActionEvent event) {
    	if(mapaDeLaPartida.get(pais1.getText()) < mapaDeLaPartida.get(pais2.getText())){
    	
    	}else {
    		mensajeError(event);
    		errores++;
    	}
    	avanzar(event);
    }
    
    
    private Map<String,Double> mapaParaJugar(){    	
    	if(modoDeJuego.equals("europa")) return ExtensionPaises.getMapaEuropa();
    	if(modoDeJuego.equals("america")) return ExtensionPaises.getMapaAmerica();
    	
    	return null;
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		List<String> clavesDelMapa = new ArrayList<>(mapaDeLaPartida.keySet());
		
		pais1.setText(clavesDelMapa.get(random.nextInt(clavesDelMapa.size())));
		
		do {
			pais2.setText(clavesDelMapa.get(random.nextInt(clavesDelMapa.size())));
		}while(pais1.getText().equals(pais2.getText()) || 
				mapaDeLaPartida.get(pais1.getText()).equals(mapaDeLaPartida.get(pais2.getText())));
		
				
	}

}
