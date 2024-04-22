package es.finalPrimerCurso.finalPrimerCurso;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import es.finalPrimerCurso.finalPrimerCurso.Clases.Preguntas;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;



public class preguntasController implements Initializable{
	
	private static int acierto = 0;
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
	
	
    public void initialize(URL location, ResourceBundle resources) {
        pregunta.setText(Preguntas.getListaDePreguntas().get(index).getPregunta());
        respuesta1.setText(Preguntas.getListaDePreguntas().get(index).getConjuntoDeRespuestas().get(0));
        respuesta2.setText(Preguntas.getListaDePreguntas().get(index).getConjuntoDeRespuestas().get(1));
        respuesta3.setText(Preguntas.getListaDePreguntas().get(index).getConjuntoDeRespuestas().get(2));
        respuesta4.setText(Preguntas.getListaDePreguntas().get(index).getConjuntoDeRespuestas().get(3));       
    }
    
  
    private void avanzar() {
    	Preguntas.setCantidadDePreguntas(Preguntas.getCantidadDePreguntas()-1);
    	
		 if(Preguntas.getCantidadDePreguntas() == 0) {
			 System.out.printf("Has acertado %d/%d",acierto,index+1);
			 System.exit(0);
		 }	
		 try {
			index++;
			App.setRoot("preguntas");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
    
	@FXML
	public void btnRespuesta1(ActionEvent event){
		if(respuesta1.getText().equals(Preguntas.getListaDePreguntas().get(index).getRespuestaCorrecta())){
			acierto++;	
		}
		avanzar();
	}


	@FXML
	public void btnRespuesta2(ActionEvent event){
		if(respuesta2.getText().equals(Preguntas.getListaDePreguntas().get(index).getRespuestaCorrecta())){
			acierto++;
		}
		avanzar();
	}

	@FXML
	public void btnRespuesta3(ActionEvent event) {
		if(respuesta3.getText().equals(Preguntas.getListaDePreguntas().get(index).getRespuestaCorrecta())){
			acierto++;
		}		
		avanzar();
		
	}

	@FXML
	public void btnRespuesta4(ActionEvent event) {
		if(respuesta4.getText().equals(Preguntas.getListaDePreguntas().get(index).getRespuestaCorrecta())){
			acierto++;
		}
		avanzar();
		
	}
}
