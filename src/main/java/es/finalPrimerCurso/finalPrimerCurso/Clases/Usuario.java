package es.finalPrimerCurso.finalPrimerCurso.Clases;

public class Usuario {

	private String nombreUsuario;
	private String nombreCompleto;
	private String password;
	
	
	public Usuario(String nick, String nombreCompleto, String password) {
		this.nombreUsuario = nick;
		this.nombreCompleto = nombreCompleto;
		this.password = password;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public String getNombreCompleto() {
		return nombreCompleto;
	}


	public String getPassword() {
		return password;
	}

	
	
	
}
