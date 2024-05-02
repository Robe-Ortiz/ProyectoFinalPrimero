module es.finalPrimerCurso.finalPrimerCurso {
    requires javafx.controls;
    requires javafx.fxml;
	requires org.apache.pdfbox;
	requires java.base;
	requires poi.ooxml;
	requires java.desktop;
	requires org.jfree.jfreechart;




    opens es.finalPrimerCurso.finalPrimerCurso to javafx.fxml;
    exports es.finalPrimerCurso.finalPrimerCurso;
}
