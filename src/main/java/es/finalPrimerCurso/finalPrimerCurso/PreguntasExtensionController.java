package es.finalPrimerCurso.finalPrimerCurso;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
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
    
    private static Random random = new Random(); 
    private static String modoDeJuego;
    private Map<String,Double> mapaDeLaPartida = mapaParaJugar(); 
    private static int cantidadDePreguntas = 0;

    private static Map<Integer, Integer> preguntaError = new HashMap<>();
    private static int preguntasContestadas = 0;
    private static int index = 0;
    private static int errores = 0;
    
    private static boolean modoExtremo;
    
  
	public static Map<Integer, Integer> getPreguntaError() {		
		return new HashMap<>(preguntaError);
	}    
	
   
    public static int getPreguntasContestadas() {
		return preguntasContestadas;
	}


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
    	cantidadDePreguntas--;
    	preguntasContestadas++;
        index++;        
    	if(cantidadDePreguntas <= 0) {
    		if(modoExtremo) {
    			mensajeRespuestaIncorrectaModoExtremo(event);
    		}else {
        		mensajeResultado(event);
    		}
    		try {
    			App.setRoot("PantallaFinalExtension");
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    	}else {
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
		alert.setContentText(String.format("%s: %.5f millones de km²\n"
										+ "%s: %.5f millones de km²", pais1.getText(), mapaDeLaPartida.get(pais1.getText()),
										pais2.getText(),mapaDeLaPartida.get(pais2.getText())));
		alert.showAndWait();
	}
	
	private void mensajeRespuestaIncorrectaModoExtremo(ActionEvent event) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setHeaderText(null);
		alert.setTitle("Fin de la partida");
		alert.setContentText(String.format("En el modo extremo estás eliminado si tienes un fallo.\n"
				+"Número de aciertos: "+ (index-1)));
		alert.showAndWait();
	}

	
	public static void restablecerPartida() {
		preguntaError.clear();
		errores = 0;
		index = 0;
		cantidadDePreguntas = 0;
		preguntasContestadas = 0;
		modoExtremo = false;
	}
	
	public static void iniciarModoExtremo() {
		modoExtremo = true;
	}
	
	@FXML
    void btnReset(ActionEvent event) {
		restablecerPartida();
		try {
			App.setRoot("SeleccionCantidadPreguntasExtension");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    @FXML   
    void btnpais1(ActionEvent event) {
        if (mapaDeLaPartida.get(pais1.getText()) > mapaDeLaPartida.get(pais2.getText())) {
        } else {  
       	mensajeError(event);
    		preguntaError.put(index, preguntaError.getOrDefault(index, 0) + 1);
            errores++;
            if(modoExtremo)	cantidadDePreguntas = 0;           
        }
        avanzar(event);
    }

    @FXML
    void btnpais2(ActionEvent event) {
    	if(mapaDeLaPartida.get(pais1.getText()) < mapaDeLaPartida.get(pais2.getText())){
    	}else {
    		mensajeError(event);
    		preguntaError.put(index, preguntaError.getOrDefault(index, 0) + 1);
    		errores++;
            if(modoExtremo)	cantidadDePreguntas = 0;           
    	}
    	avanzar(event);
    }
    
    
    private Map<String,Double> mapaParaJugar(){    	
    	if(modoDeJuego.equals("europa")) return ExtensionPaises.getMapaEuropa();
    	if(modoDeJuego.equals("america")) return ExtensionPaises.getMapaAmerica();
    	if(modoDeJuego.equals("extremo") && modoExtremo) return ExtensionPaises.getMapaMundo();   	
    	return ExtensionPaises.getMapaMundo();
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
