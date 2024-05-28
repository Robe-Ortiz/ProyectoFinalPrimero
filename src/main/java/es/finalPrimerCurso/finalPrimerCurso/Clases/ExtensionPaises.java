package es.finalPrimerCurso.finalPrimerCurso.Clases;

import java.util.HashMap;
import java.util.Map;

public class ExtensionPaises {

	private static Map <String,Double> mapaEuropa = new HashMap<>();
	private static Map<String,Double> mapaAmerica = new HashMap<>();
	private static Map<String,Double> mapaMundo = new HashMap<>();
	
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
    
    private void incluirOceania(Map<String, Double> mapaParaLlenar) {
        mapaParaLlenar.put("Australia", 7.692);
        mapaParaLlenar.put("Papúa Nueva Guinea", 0.462);
        mapaParaLlenar.put("Nueva Zelanda", 0.268);
        mapaParaLlenar.put("Fiyi", 0.018);
        mapaParaLlenar.put("Islas Salomón", 0.029);
        mapaParaLlenar.put("Vanuatu", 0.012);
        mapaParaLlenar.put("Samoa", 0.0028);
        mapaParaLlenar.put("Kiribati", 0.0081);
        mapaParaLlenar.put("Tonga", 0.00075);
        mapaParaLlenar.put("Micronesia", 0.007);
        mapaParaLlenar.put("Palau", 0.000459);
        mapaParaLlenar.put("Nauru", 0.000021);
        mapaParaLlenar.put("Tuvalu", 0.000026);
        mapaParaLlenar.put("Islas Marshall", 0.000181);
    }
	
    private void incluirAfrica(Map<String, Double> mapaParaLlenar) {
        mapaParaLlenar.put("Argelia", 2.382);
        mapaParaLlenar.put("R. Democrática del Congo", 2.345);
        mapaParaLlenar.put("Sudán", 1.886);
        mapaParaLlenar.put("Libia", 1.760);
        mapaParaLlenar.put("Chad", 1.284);
        mapaParaLlenar.put("Níger", 1.267);
        mapaParaLlenar.put("Angola", 1.246);
        mapaParaLlenar.put("Mali", 1.240);
        mapaParaLlenar.put("Sudán del Sur", 0.619);
        mapaParaLlenar.put("Etiopía", 1.104);
        mapaParaLlenar.put("Sudáfrica", 1.221);
        mapaParaLlenar.put("Mauritania", 1.030);
        mapaParaLlenar.put("Egipto", 1.002);
        mapaParaLlenar.put("Tanzania", 0.947);
        mapaParaLlenar.put("Nigeria", 0.924);
        mapaParaLlenar.put("Namibia", 0.825);
        mapaParaLlenar.put("Mozambique", 0.801);
        mapaParaLlenar.put("Zambia", 0.752);
        mapaParaLlenar.put("Somalia", 0.637);
        mapaParaLlenar.put("R. Centroafricana", 0.623);
        mapaParaLlenar.put("Madagascar", 0.587);
        mapaParaLlenar.put("Botsuana", 0.581);
        mapaParaLlenar.put("Kenia", 0.580);
        mapaParaLlenar.put("Gabón", 0.267);
        mapaParaLlenar.put("Guinea", 0.246);
        mapaParaLlenar.put("Ghana", 0.239);
        mapaParaLlenar.put("Senegal", 0.197);
        mapaParaLlenar.put("Uruguay", 0.176);
        mapaParaLlenar.put("Malí", 1.240);
        mapaParaLlenar.put("Zimbabue", 0.391);
        mapaParaLlenar.put("Guinea Ecuatorial", 0.028);
        mapaParaLlenar.put("Mauricio", 0.002);
        mapaParaLlenar.put("Comoras", 0.002);
        mapaParaLlenar.put("Santo Tomé y Príncipe", 0.001);
        mapaParaLlenar.put("Seychelles", 0.0005);
    }
    
    private void incluirAsia(Map<String, Double> mapaParaLlenar) {
        mapaParaLlenar.put("China", 9.597);
        mapaParaLlenar.put("India", 3.287);
        mapaParaLlenar.put("Kazajistán", 2.724);
        mapaParaLlenar.put("Arabia Saudita", 2.150);
        mapaParaLlenar.put("Irán", 1.648);
        mapaParaLlenar.put("Mongolia", 1.564);
        mapaParaLlenar.put("Indonesia", 1.904);
        mapaParaLlenar.put("Pakistán", 0.881);
        mapaParaLlenar.put("Myanmar", 0.676);
        mapaParaLlenar.put("Afganistán", 0.652);
        mapaParaLlenar.put("Yemen", 0.527);
        mapaParaLlenar.put("Tailandia", 0.513);
        mapaParaLlenar.put("Turkmenistán", 0.491);
        mapaParaLlenar.put("Uzbekistán", 0.448);
        mapaParaLlenar.put("Irak", 0.438);
        mapaParaLlenar.put("Japón", 0.377);
        mapaParaLlenar.put("Vietnam", 0.331);
        mapaParaLlenar.put("Malasia", 0.330);
        mapaParaLlenar.put("Filipinas", 0.300);
        mapaParaLlenar.put("Laos", 0.237);
        mapaParaLlenar.put("Bangladés", 0.148);
        mapaParaLlenar.put("Nepal", 0.147);
        mapaParaLlenar.put("Corea del Norte", 0.120);
        mapaParaLlenar.put("Corea del Sur", 0.100);
        mapaParaLlenar.put("Jordania", 0.089);
        mapaParaLlenar.put("Azerbaiyán", 0.086);
        mapaParaLlenar.put("Emiratos Árabes Unidos", 0.084);
        mapaParaLlenar.put("Siria", 0.185);
        mapaParaLlenar.put("Sri Lanka", 0.065);
        mapaParaLlenar.put("Bután", 0.038);
        mapaParaLlenar.put("Taiwán", 0.036);
        mapaParaLlenar.put("Armenia", 0.029);
        mapaParaLlenar.put("Kuwait", 0.018);
        mapaParaLlenar.put("Timor Oriental", 0.015);
        mapaParaLlenar.put("Catar", 0.012);
        mapaParaLlenar.put("Líbano", 0.010);
        mapaParaLlenar.put("Chipre", 0.009);
        mapaParaLlenar.put("Brunéi", 0.005);
        mapaParaLlenar.put("Maldivas", 0.0003);
        mapaParaLlenar.put("Singapur", 0.0007);
        mapaParaLlenar.put("Baréin", 0.0008);
    }
    
	public ExtensionPaises() {
		//europa
		incluirEuropa(mapaEuropa);
		//america
		incluirAmerica(mapaAmerica);
		//mundo
		incluirEuropa(mapaMundo);
		incluirAmerica(mapaMundo);
		incluirOceania(mapaMundo);
		incluirAfrica(mapaMundo);
		incluirAsia(mapaMundo);
	}


	public static Map<String, Double> getMapaEuropa() {
		return mapaEuropa;
	}

	public static Map<String, Double> getMapaAmerica() {
		return mapaAmerica;
	}

	public static Map<String, Double> getMapaMundo() {
		return mapaMundo;
	}
	
	
	
	
}
