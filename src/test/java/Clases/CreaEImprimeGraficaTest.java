package Clases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.finalPrimerCurso.finalPrimerCurso.PreguntasCapitalesController;
import es.finalPrimerCurso.finalPrimerCurso.Clases.CreaEImprimeGrafica;

public class CreaEImprimeGraficaTest {

    private CreaEImprimeGrafica creaEImprimeGrafica;
    private PreguntasCapitalesController preguntasController;
    private Map<Integer,Integer> mapaDeErrores = new HashMap<>();

    @BeforeEach
    public void setUp() {
        preguntasController = mock(PreguntasCapitalesController.class);
        creaEImprimeGrafica = new CreaEImprimeGrafica();
        mapaDeErrores.put(1, 2);
        mapaDeErrores.put(2, 1);
        mapaDeErrores.put(3, 1); 
         
    }

    @Test
    public void testCreacionGrafica() {
    	
        when(preguntasController.getPreguntaError()).thenReturn(mapaDeErrores); 

        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        datos.addValue(0, null, null);
       

        // Verificación
        ChartPanel chartPanel = (ChartPanel) creaEImprimeGrafica.getContentPane().getComponent(0);
        JFreeChart chart = chartPanel.getChart();
        DefaultCategoryDataset dataset = (DefaultCategoryDataset) chart.getCategoryPlot().getDataset();
        assertEquals(3, dataset.getRowCount()); // Verifica que se hayan agregado los datos correctamente
    }
	
}
