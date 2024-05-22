package es.finalPrimerCurso.finalPrimerCurso;

import java.io.IOException;
import java.util.Optional;

import es.finalPrimerCurso.finalPrimerCurso.Clases.Usuario;
import es.finalPrimerCurso.finalPrimerCurso.Clases.Usuarios;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimeraEscenaController {

    @FXML
    private TextField nombreUsuario;
    @FXML
    private PasswordField password;
    private int salir = 0;
    
    private  boolean comprobarUsuario(ActionEvent event ,String nombreUsuario) {
    Optional<Usuario> opUsuario =	Usuarios.getListaUsuarios().stream()
			    											.filter(u->u.getNombreUsuario().equals(nombreUsuario))
			    											.findFirst();
    if(opUsuario.isEmpty()) {
    	mostrarUsuarioNoEncontrado(event);
    	return false;
    }else {
    	System.out.println("usuario " + nombreUsuario + " ha sido encontrado.");
       	if(opUsuario.get().getPassword().equals(password.getText())) {
       		return true;
       	}else {
			mostrarpasswordIncorrecta(event);
       		return false;
       	}
    }     
    }
    

    
    
    @FXML
    private void btnContinuar(ActionEvent event) throws IOException {
    	if(comprobarUsuario(event, nombreUsuario.getText())) {
	    	System.out.println(nombreUsuario.getText());
	    	mensajeContinuar(event,nombreUsuario.getText());
	    	App.setRoot("SeleccionCantidadPreguntas");
    	}
    }
    
    private void mensajeContinuar(ActionEvent event, String nombreUsuario) {
    	String nombreCompleto = Usuarios.getListaUsuarios().stream()
    						.filter(u->u.getNombreUsuario().equals(nombreUsuario)).map(Usuario::getNombreCompleto).findFirst().orElse("Usuario no encontrado");
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Bienvenido");
        
        alert.setContentText(String.format("Bienvenido a nuestro juego %s", nombreCompleto ));
        alert.showAndWait();
    }

    @FXML
    void btnSalir(ActionEvent event) {
    	switch (salir) {
		case 0:
    		mostrarErrorSalir1(event);
    		salir++;
			break;
		case 1:
			mostrarErrorSalir2(event);
			salir++;
			break;
		default:
			mostrarErrorSalir3(event);
    	System.exit(0);
		}    	
    }
    
    @FXML
    private void mostrarErrorSalir1(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText(null);
        alert.setTitle("1/3");
        alert.setContentText("Supongo que has clickeado por error, no te preocupes que te dejo dentro.");
        alert.showAndWait();
    }
    @FXML
    private void mostrarErrorSalir2(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText(null);
        alert.setTitle("2/3");
        alert.setContentText("Empiezo a pensar que no te has equivocado y que quieres salir.");
        alert.showAndWait();
    }
    
    @FXML
    private void mostrarErrorSalir3(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("3/3");
        alert.setContentText("¡¡ ADIOS NO VUELVAS !!");
        alert.showAndWait();
    }

    @FXML
    private void mostrarUsuarioNoEncontrado(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText(null);
        alert.setTitle("Usuario no encontrado.");
        alert.setContentText("El nombre " + nombreUsuario.getText() + " de usuario no se ha encontrado");
        alert.showAndWait();
    }

    @FXML
    private void mostrarpasswordIncorrecta(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText(null);
        alert.setTitle("Contraseña incorrecta.");
        alert.setContentText("La contraseña no es correcta");
        alert.showAndWait();
    }
}
