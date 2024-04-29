  package es.finalPrimerCurso.finalPrimerCurso;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import es.finalPrimerCurso.finalPrimerCurso.Clases.Preguntas;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;



public class PreguntasController implements Initializable{
	
	private static int errores = 0;
	private static int index = 0;
	private static Map<Integer,Integer> preguntaError = new HashMap<>();

	
	
	@FXML
	private Label pregunta;
	@FXML
	private Label respuesta1;
	@FXML
	private Label respuesta2;
	@FXML
	private Label respuesta3;
	@FXML
	private Label respuesta4;
	
	
	

	public static Map<Integer, Integer> getPreguntaError() {
		Map<Integer,Integer> preguntaErrorEspejo = preguntaError;
		
		return preguntaErrorEspejo;
	}

	public static int getErrores() {
		return errores;
	}

	public static void restablecerPartida() {
		errores = 0;
		index = 0;
		preguntaError.clear();
	}
	

	public void initialize(URL location, ResourceBundle resources) {
        pregunta.setText(Preguntas.getListaDePreguntas().get(index).getPregunta());
        respuesta1.setText(Preguntas.getListaDePreguntas().get(index).getConjuntoDeRespuestas().get(0));
        respuesta2.setText(Preguntas.getListaDePreguntas().get(index).getConjuntoDeRespuestas().get(1));
        respuesta3.setText(Preguntas.getListaDePreguntas().get(index).getConjuntoDeRespuestas().get(2));
        respuesta4.setText(Preguntas.getListaDePreguntas().get(index).getConjuntoDeRespuestas().get(3));       
    }
    
  
    private void mensajeRespuestaIncorrecta(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Respuesta incorrecta");
        alert.setContentText(String.format("Respuesta incorrecta, vuelve a intentarlo."));
        alert.showAndWait();
    }
    
    private void respuestaIncorrecta(ActionEvent event) {
		mensajeRespuestaIncorrecta(event);
		preguntaError.put(index,preguntaError.getOrDefault(index, 0)+1);
		errores++;
    }
  
    
    private void mensajeResultado(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Enhorabuena por contestar todas las preguntas");
        alert.setContentText("Cantidad de preguntas: "  + Preguntas.getCantidadDePreguntasOriginal()+ "\n"
        					+"Errores: "+ +errores
        		);
        alert.showAndWait();
    }
      
    private void avanzar() {
    	Preguntas.setCantidadDePreguntas(Preguntas.getCantidadDePreguntas()-1);
    	
		 if(Preguntas.getCantidadDePreguntas() == 0) {
			 try {
				 mensajeResultado(null);
				 preguntaError.forEach((indice,valor) -> System.out.printf("Pregunta: %d  errores: %d\n",indice+1,valor));
				 
				 App.setRoot("pantallaFinal");
			 }catch (IOException e) {
				e.printStackTrace();
			}
		 }else {	
			 try {
				index++;
				App.setRoot("preguntas");
			} catch (IOException e) {
				e.printStackTrace();
			} 
		 }
	}
    

        
	@FXML
	public void btnRespuesta1(ActionEvent event){
		if(respuesta1.getText().equals(Preguntas.getListaDePreguntas().get(index).getRespuestaCorrecta())){
			avanzar();	
		}else {
			respuestaIncorrecta(event);
		}
	}


	@FXML
	public void btnRespuesta2(ActionEvent event){
		if(respuesta2.getText().equals(Preguntas.getListaDePreguntas().get(index).getRespuestaCorrecta())){
			avanzar();
		}else {
			respuestaIncorrecta(event);
		}		
	}

	@FXML
	public void btnRespuesta3(ActionEvent event) {
		if(respuesta3.getText().equals(Preguntas.getListaDePreguntas().get(index).getRespuestaCorrecta())){
			avanzar();
		}else {
			respuestaIncorrecta(event);
		}		
	}

	@FXML
	public void btnRespuesta4(ActionEvent event) {
		if(respuesta4.getText().equals(Preguntas.getListaDePreguntas().get(index).getRespuestaCorrecta())){
			avanzar();
		}else {
			respuestaIncorrecta(event);
		}		
	}
}
