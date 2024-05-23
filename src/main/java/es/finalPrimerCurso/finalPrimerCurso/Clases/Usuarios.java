package es.finalPrimerCurso.finalPrimerCurso.Clases;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {

	private static List<Usuario> listaUsuarios = new ArrayList<>();
	
	
	public Usuarios() {
		listaUsuarios.add(new Usuario("robe","Roberto Ortiz","1234"));
		listaUsuarios.add(new Usuario("fabio","Fabio Reséndiz","fabio123"));
		listaUsuarios.add(new Usuario("pedro","Pedro Boceta","cangetin01"));
		listaUsuarios.add(new Usuario("programadornº1","Pedro Recio","kiosko24"));
		listaUsuarios.add(new Usuario("pubito","Luis de Paz","040722"));
		listaUsuarios.add(new Usuario("","Señor anónimo",""));
	}


	public static List<Usuario> getListaUsuarios() {
		return listaUsuarios;
	}
	
	
}
