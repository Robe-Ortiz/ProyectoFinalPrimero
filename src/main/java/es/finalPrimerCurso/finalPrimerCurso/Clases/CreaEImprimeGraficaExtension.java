package es.finalPrimerCurso.finalPrimerCurso.Clases;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import es.finalPrimerCurso.finalPrimerCurso.PreguntasCapitalesController;
import es.finalPrimerCurso.finalPrimerCurso.PreguntasExtensionController;

public class CreaEImprimeGraficaExtension extends JFrame {
	
	private int indicePregunta = 0;

	public CreaEImprimeGraficaExtension() {
		super("Gráfico de barras");		
		DefaultCategoryDataset datos = new DefaultCategoryDataset();
		for(int i = 0; i<PreguntasExtensionController.getPreguntasContestadas();i++) {		
			datos.addValue(PreguntasExtensionController.getPreguntaError().get(indicePregunta), "Errores", ""+(indicePregunta+1));
			indicePregunta++;
		}
		JFreeChart grafico = ChartFactory.createBarChart("Gráfica errores","Preguntas","Errores",datos);
		grafico.getCategoryPlot().getRenderer().setSeriesPaint(0, Color.CYAN);
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
