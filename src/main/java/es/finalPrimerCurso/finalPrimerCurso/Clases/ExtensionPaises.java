package es.finalPrimerCurso.finalPrimerCurso.Clases;

import java.util.HashMap;
import java.util.Map;

public class ExtensionPaises {

	private static Map <String,Double> mapaEuropa = new HashMap<>();
	
	
	
	private void incluirEuropa(Map<String,Double> mapaParaLlenar) {
		mapaParaLlenar.put("Rusia", 17.098);
        mapaParaLlenar.put("Ucrania", 0.603);
        mapaParaLlenar.put("Francia", 0.551);
        mapaParaLlenar.put("España", 0.506);
        mapaParaLlenar.put("Suecia", 0.450);
        mapaParaLlenar.put("Alemania", 0.357);
        mapaParaLlenar.put("Finlandia", 0.338);
        mapaParaLlenar.put("Noruega", 0.324);
        mapaParaLlenar.put("Polonia", 0.313);
        mapaParaLlenar.put("Italia", 0.301);
        mapaParaLlenar.put("Reino Unido", 0.244);
        mapaParaLlenar.put("Rumania", 0.238);
        mapaParaLlenar.put("Bielorrusia", 0.207);
        mapaParaLlenar.put("Grecia", 0.132);
        mapaParaLlenar.put("Bulgaria", 0.111);
        mapaParaLlenar.put("Islandia", 0.103);
        mapaParaLlenar.put("Hungría", 0.093);
        mapaParaLlenar.put("Portugal", 0.092);
        mapaParaLlenar.put("Austria", 0.084);
        mapaParaLlenar.put("República Checa", 0.079);
        mapaParaLlenar.put("Serbia", 0.077);
        mapaParaLlenar.put("Irlanda", 0.070);
        mapaParaLlenar.put("Lituania", 0.065);
        mapaParaLlenar.put("Letonia", 0.064);
        mapaParaLlenar.put("Croacia", 0.056);
        mapaParaLlenar.put("Bosnia y Herzegovina", 0.051);
        mapaParaLlenar.put("Eslovaquia", 0.049);
        mapaParaLlenar.put("Estonia", 0.045);
        mapaParaLlenar.put("Dinamarca", 0.043);
        mapaParaLlenar.put("Suiza", 0.041);
        mapaParaLlenar.put("Países Bajos", 0.041);
        mapaParaLlenar.put("Moldavia", 0.034);
        mapaParaLlenar.put("Bélgica", 0.030);
        mapaParaLlenar.put("Albania", 0.028);
        mapaParaLlenar.put("Macedonia del Norte", 0.025);
        mapaParaLlenar.put("Eslovenia", 0.020);
        mapaParaLlenar.put("Montenegro", 0.014);
        mapaParaLlenar.put("Kosovo", 0.011);
        mapaParaLlenar.put("Luxemburgo", 0.003);
        mapaParaLlenar.put("Andorra", 0.001);
        mapaParaLlenar.put("Malta", 0.001);
        mapaParaLlenar.put("Liechtenstein", 0.001);
        mapaParaLlenar.put("San Marino", 0.0006);
        mapaParaLlenar.put("Mónaco", 0.0002);
        mapaParaLlenar.put("Ciudad del Vaticano", 0.0004);
	}
	
	
	public ExtensionPaises() {
		incluirEuropa(mapaEuropa);
	}


	public static Map<String, Double> getMapaEuropa() {
		return mapaEuropa;
	}
	
	
}
