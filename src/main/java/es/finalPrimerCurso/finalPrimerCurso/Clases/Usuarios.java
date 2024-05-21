package es.finalPrimerCurso.finalPrimerCurso.Clases;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {

	private static List<Usuario> listaUsuarios = new ArrayList<>();
	
	
	public Usuarios() {
		listaUsuarios.add(new Usuario("robe","Roberto Ortiz","1234"));
	}


	public static List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	
	
}
