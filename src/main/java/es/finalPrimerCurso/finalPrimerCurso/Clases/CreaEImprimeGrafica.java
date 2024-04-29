package es.finalPrimerCurso.finalPrimerCurso.Clases;


import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import es.finalPrimerCurso.finalPrimerCurso.PreguntasController;

public class CreaEImprimeGrafica extends JFrame {
	
	private int indicePregunta = 0;

	public CreaEImprimeGrafica() {
		super("Gráfico de barras");
		
		DefaultCategoryDataset datos = new DefaultCategoryDataset();
		for(int i = 0; i<Preguntas.getCantidadDePreguntasOriginal() ;i++) {		
			datos.addValue(PreguntasController.getPreguntaError().get(indicePregunta), "Errores", "Pregunta "+(indicePregunta+1));
			indicePregunta++;
		}
		JFreeChart grafico = ChartFactory.createBarChart("Gráfica errores","Preguntas","Errores",datos);
		getBackground();
		grafico.getCategoryPlot().getRenderer().setSeriesPaint(0, Color.GREEN);
		grafico.getCategoryPlot().getRangeAxis().setStandardTickUnits(org.jfree.chart.axis.NumberAxis.createIntegerTickUnits());
		
		ChartPanel ventana = new ChartPanel(grafico);
		Dimension dimensionVentana = new Dimension(1920,1080);
		ventana.setPreferredSize(dimensionVentana);
		getContentPane().add(ventana);
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);        
	}
	
}
