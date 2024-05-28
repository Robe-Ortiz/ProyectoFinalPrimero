package es.finalPrimerCurso.finalPrimerCurso.Clases;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.*;

import es.finalPrimerCurso.finalPrimerCurso.PantallaFinalCapitalesController;
import es.finalPrimerCurso.finalPrimerCurso.PreguntasCapitalesController;

public class CrearEImprimirWord {

    private void agregarParrafo(XWPFDocument documento, String texto) {
        XWPFParagraph parrafo = documento.createParagraph();
        XWPFRun run = parrafo.createRun();
        run.setText(texto);
    }

	
	private void incluirPreguntasYRespuestas(XWPFDocument documento) {
        for(int i = 0; i <PreguntasCapitalesController.getPreguntasContestadas()+1 ;i++) {
        	agregarParrafo(documento, Capitales.getListaDePreguntas().get(i).getPregunta());
        	agregarParrafo(documento, "A) "+Capitales.getListaDePreguntas().get(i).getRespuestaCorrecta());
        	agregarParrafo(documento, "B) "+Capitales.getListaDePreguntas().get(i).getRespuestaIncorrectaA());
        	agregarParrafo(documento, "C) "+Capitales.getListaDePreguntas().get(i).getRespuestaIncorrectaB());
        	agregarParrafo(documento, "D) "+Capitales.getListaDePreguntas().get(i).getRespuestaIncorrectaC());   
        	documento.createParagraph().createRun().addCarriageReturn();
        }
	}
	
	
    public CrearEImprimirWord() {
        try {
            XWPFDocument documento = new XWPFDocument();
            XWPFParagraph titulo = documento.createParagraph();
            XWPFRun tituloRun = titulo.createRun();
            tituloRun.setText("¡Hola jugador!");
            tituloRun.setBold(true);
            tituloRun.setFontSize(50);
            documento.createParagraph().createRun().addCarriageReturn();
            agregarParrafo(documento, "Aquí tienes una recopilación de las preguntas que has contestado. El orden de las respuestas es distinto al");
            agregarParrafo(documento, "que te han aparecido. Ahora, la primera respuesta siempre será correcta.");
            documento.createParagraph().createRun().addCarriageReturn();
            
            incluirPreguntasYRespuestas(documento);


            String rutaParaGuardarWord = System.getProperty("user.home") + File.separator + "Desktop";
			if (PantallaFinalCapitalesController.getVecesDescargadoWord() == 0) {
				rutaParaGuardarWord += File.separator + "preguntas.docx";
				PantallaFinalCapitalesController.aumentarVecesDescargadoWord();
			} else {				
				rutaParaGuardarWord += File.separator + "preguntas" + "("
						+ PantallaFinalCapitalesController.getVecesDescargadoWord() + ")"+".docx";							
				PantallaFinalCapitalesController.aumentarVecesDescargadoWord();
			}
			
            FileOutputStream out = new FileOutputStream(rutaParaGuardarWord);
            documento.write(out);
            out.close();
            documento.close();

            System.out.println("¡Documento de Word generado con éxito!");

        } catch (Exception e) {
            System.out.println("Error al generar el documento de Word: " + e.getMessage());
            e.printStackTrace();
        }
    }
}