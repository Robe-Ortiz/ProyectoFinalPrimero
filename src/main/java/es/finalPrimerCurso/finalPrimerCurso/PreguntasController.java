  package es.finalPrimerCurso.finalPrimerCurso;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import es.finalPrimerCurso.finalPrimerCurso.Clases.Preguntas;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;



public class PreguntasController implements Initializable{
	
	private static int errores = 0;
	private static int index = 0;

	
	
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
	
	
	
	
	
    public static int getErrores() {
		return errores;
	}

	public static void restablecerErrores() {
		errores = 0;
	}

	public static void restablecerIndiceDePreguntas() {
		index = 0;
	}

	public void initialize(URL location, ResourceBundle resources) {
        pregunta.setText(Preguntas.getListaDePreguntas().get(index).getPregunta());
        respuesta1.setText(Preguntas.getListaDePreguntas().get(index).getConjuntoDeRespuestas().get(0));
        respuesta2.setText(Preguntas.getListaDePreguntas().get(index).getConjuntoDeRespuestas().get(1));
        respuesta3.setText(Preguntas.getListaDePreguntas().get(index).getConjuntoDeRespuestas().get(2));
        respuesta4.setText(Preguntas.getListaDePreguntas().get(index).getConjuntoDeRespuestas().get(3));       
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
				 System.out.printf("Has acertado %d/%d\n",errores,Preguntas.getCantidadDePreguntasOriginal());
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
    
    private void mensajeRespuestaIncorrecta(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Respuesta incorrecta");
        alert.setContentText(String.format("Respuesta incorrecta, vuelve a intentarlo."));
        alert.showAndWait();
    }
        
	@FXML
	public void btnRespuesta1(ActionEvent event){
		if(respuesta1.getText().equals(Preguntas.getListaDePreguntas().get(index).getRespuestaCorrecta())){
			avanzar();	
		}else {
			mensajeRespuestaIncorrecta(event);
			errores++;
		}
	}


	@FXML
	public void btnRespuesta2(ActionEvent event){
		if(respuesta2.getText().equals(Preguntas.getListaDePreguntas().get(index).getRespuestaCorrecta())){
			avanzar();
		}else {
			mensajeRespuestaIncorrecta(event);
			errores++;
		}		
	}

	@FXML
	public void btnRespuesta3(ActionEvent event) {
		if(respuesta3.getText().equals(Preguntas.getListaDePreguntas().get(index).getRespuestaCorrecta())){
			avanzar();
		}else {
			mensajeRespuestaIncorrecta(event);
			errores++;
		}		
	}

	@FXML
	public void btnRespuesta4(ActionEvent event) {
		if(respuesta4.getText().equals(Preguntas.getListaDePreguntas().get(index).getRespuestaCorrecta())){
			avanzar();
		}else {
			mensajeRespuestaIncorrecta(event);
			errores++;
		}		
	}
}
