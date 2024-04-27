package es.finalPrimerCurso.finalPrimerCurso.Clases;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.text.PDFTextStripper;

import es.finalPrimerCurso.finalPrimerCurso.PantallaFinalController;



public class CrearEImprimirPDF {
	
	private float alturaTitulo = PDRectangle.A4.getHeight() - 80;
	private float alturaPrimeraPregunta = alturaTitulo - 150;

	
	private PDPageContentStream incluirPreguntasYRespuestas(PDDocument pdfFinal, PDPageContentStream contenidoPDF) throws IOException {
		for (int i=0; i < Preguntas.getCantidadDePreguntasOriginal() ;i++ ) {	
			if(alturaPrimeraPregunta < 65.0) {
				contenidoPDF.close();
				PDPage paginaExtra = new PDPage(PDRectangle.A4);
				pdfFinal.addPage(paginaExtra);
				contenidoPDF = new PDPageContentStream(pdfFinal, paginaExtra);
				contenidoPDF.setFont(PDType1Font.TIMES_BOLD, 12);
				alturaPrimeraPregunta = alturaTitulo - 30;
			}
				contenidoPDF.beginText();
			    contenidoPDF.newLineAtOffset(40,alturaPrimeraPregunta);;
			    contenidoPDF.showText(Preguntas.getListaDePreguntas().get(i).getPregunta());
			    contenidoPDF.newLine(); 
			    alturaPrimeraPregunta -= 20; 
			    contenidoPDF.endText();
			    
				contenidoPDF.beginText();
			    contenidoPDF.newLineAtOffset(40, alturaPrimeraPregunta);
			    contenidoPDF.showText("A) "+Preguntas.getListaDePreguntas().get(i).getRespuestaCorrecta());
			    contenidoPDF.newLine(); 
			    alturaPrimeraPregunta -= 20; 
			    contenidoPDF.endText();
			    
				contenidoPDF.beginText();
			    contenidoPDF.newLineAtOffset(40, alturaPrimeraPregunta);
			    contenidoPDF.showText("B) "+Preguntas.getListaDePreguntas().get(i).getRespuestaIncorrectaA());
			    contenidoPDF.newLine(); 
			    alturaPrimeraPregunta -= 20; 
			    contenidoPDF.endText();
			    
				contenidoPDF.beginText();
			    contenidoPDF.newLineAtOffset(40, alturaPrimeraPregunta);
			    contenidoPDF.showText("C) "+Preguntas.getListaDePreguntas().get(i).getRespuestaIncorrectaB());
			    contenidoPDF.newLine(); 
			    alturaPrimeraPregunta -= 20; 
			    contenidoPDF.endText();
			    
				contenidoPDF.beginText();
			    contenidoPDF.newLineAtOffset(40, alturaPrimeraPregunta);
			    contenidoPDF.showText("D) "+Preguntas.getListaDePreguntas().get(i).getRespuestaIncorrectaC());
			    contenidoPDF.newLine(); 
			    alturaPrimeraPregunta -= 40; 
			    contenidoPDF.endText();
			
		}
		
		return contenidoPDF;
	}
	
	
	
	public CrearEImprimirPDF() {
		PDDocument pdfFinal = new PDDocument();
		try {
			PDPage paginaUno = new PDPage(PDRectangle.A4);
			pdfFinal.addPage(paginaUno);
			PDPageContentStream contenidoPDF = new PDPageContentStream(pdfFinal, paginaUno);

			contenidoPDF.beginText();
			contenidoPDF.setFont(PDType1Font.TIMES_BOLD, 50);
			contenidoPDF.newLineAtOffset(130, alturaTitulo);
			contenidoPDF.showText("¡ Hola jugador !");
			contenidoPDF.endText();

			contenidoPDF.beginText();
			contenidoPDF.setFont(PDType1Font.TIMES_BOLD, 12);
			contenidoPDF.newLineAtOffset(20, alturaTitulo - 80);
			contenidoPDF.showText(
					"Aquí tienes una recopilación de las preguntas que has contestado. El orden de las respuestas es distinto al");
			contenidoPDF.endText();

			contenidoPDF.beginText();
			contenidoPDF.newLineAtOffset(20, alturaTitulo - 100);
			contenidoPDF.showText("que te han aparecido. Ahora, la primera respuesta siempre será correcta.");
			contenidoPDF.endText();
			
			contenidoPDF = incluirPreguntasYRespuestas(pdfFinal, contenidoPDF);		
			
			contenidoPDF.close();

			
			String rutaParaGuardarPDF = System.getProperty("user.home") + File.separator + "Desktop";
			if (PantallaFinalController.getVecesDescargadoPDF() == 0) {
				pdfFinal.save(rutaParaGuardarPDF + File.separator + "preguntas.pdf");
				PantallaFinalController.aumentarVecesDescargadoPDF();
			} else {
				pdfFinal.save(rutaParaGuardarPDF + File.separator + "preguntas" + "("
						+ PantallaFinalController.getVecesDescargadoPDF() + ")" + ".pdf");
				PantallaFinalController.aumentarVecesDescargadoPDF();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pdfFinal != null) {
				try {
					pdfFinal.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}



}
