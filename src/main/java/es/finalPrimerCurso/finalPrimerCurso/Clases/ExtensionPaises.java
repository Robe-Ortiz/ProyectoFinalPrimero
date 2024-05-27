package es.finalPrimerCurso.finalPrimerCurso.Clases;

import java.util.HashMap;
import java.util.Map;

public class ExtensionPaises {

	private static Map <String,Double> mapaEuropa = new HashMap<>();
	private static Map<String,Double> mapaAmerica = new HashMap<>();
	
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
	
	
    private void incluirAmerica(Map<String, Double> mapaParaLlenar) {
        mapaParaLlenar.put("Canadá", 9.984);
        mapaParaLlenar.put("Estados Unidos", 9.631);
        mapaParaLlenar.put("Brasil", 8.515);
        mapaParaLlenar.put("Argentina", 2.780);
        mapaParaLlenar.put("México", 1.964);
        mapaParaLlenar.put("Perú", 1.285);
        mapaParaLlenar.put("Colombia", 1.141);
        mapaParaLlenar.put("Bolivia", 1.099);
        mapaParaLlenar.put("Venezuela", 0.916);
        mapaParaLlenar.put("Chile", 0.756);
        mapaParaLlenar.put("Paraguay", 0.406);
        mapaParaLlenar.put("Ecuador", 0.283);
        mapaParaLlenar.put("Guyana", 0.215);
        mapaParaLlenar.put("Uruguay", 0.176);
        mapaParaLlenar.put("Surinam", 0.163);
        mapaParaLlenar.put("Nicaragua", 0.130);
        mapaParaLlenar.put("Cuba", 0.109);
        mapaParaLlenar.put("Honduras", 0.112);
        mapaParaLlenar.put("Guatemala", 0.109);
        mapaParaLlenar.put("Panamá", 0.075);
        mapaParaLlenar.put("Costa Rica", 0.051);
        mapaParaLlenar.put("Puerto Rico", 0.009);
        mapaParaLlenar.put("Belice", 0.022);
        mapaParaLlenar.put("El Salvador", 0.021);
        mapaParaLlenar.put("Jamaica", 0.011);
        mapaParaLlenar.put("Trinidad y Tobago", 0.005);
        mapaParaLlenar.put("Barbados", 0.00043);
        mapaParaLlenar.put("San Vicente y las Granadinas", 0.00039);
        mapaParaLlenar.put("Granada", 0.00034);
        mapaParaLlenar.put("Antigua y Barbuda", 0.00044);
        mapaParaLlenar.put("San Cristóbal y Nieves", 0.00026);
        mapaParaLlenar.put("Dominica", 0.00075);
        mapaParaLlenar.put("Santa Lucía", 0.00062);
    }
	
	public ExtensionPaises() {
		incluirEuropa(mapaEuropa);
		incluirAmerica(mapaAmerica);
	}


	public static Map<String, Double> getMapaEuropa() {
		return mapaEuropa;
	}

	public static Map<String, Double> getMapaAmerica() {
		return mapaAmerica;
	}
	
	
	
	
}
