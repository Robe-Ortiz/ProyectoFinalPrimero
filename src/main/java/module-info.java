module es.finalPrimerCurso.finalPrimerCurso {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.finalPrimerCurso.finalPrimerCurso to javafx.fxml;
    exports es.finalPrimerCurso.finalPrimerCurso;
}
