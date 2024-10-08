package es.finalPrimerCurso.finalPrimerCurso;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import es.finalPrimerCurso.finalPrimerCurso.Clases.ExtensionPaises;
import es.finalPrimerCurso.finalPrimerCurso.Clases.Capitales;
import es.finalPrimerCurso.finalPrimerCurso.Clases.Usuarios;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage escenarioCantidadPreguntas) throws IOException {
        scene = new Scene(loadFXML("primeraEscena"), 640, 480);
        escenarioCantidadPreguntas.setTitle("Seleccion del número de preguntas");
        escenarioCantidadPreguntas.setScene(scene);
        escenarioCantidadPreguntas.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
    	Usuarios usuarios = new Usuarios();
    	Capitales preguntas = new Capitales(); 
    	ExtensionPaises extensiones = new ExtensionPaises();
        launch();
    }

}