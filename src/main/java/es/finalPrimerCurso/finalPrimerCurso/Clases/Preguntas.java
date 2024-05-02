package es.finalPrimerCurso.finalPrimerCurso.Clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Preguntas {

	private static List<Pregunta> listaDePreguntas = new ArrayList<>();
	private static int cantidadDePreguntasOriginal = 0;
	private static int cantidadDePreguntas = 0;
	
	
	public Preguntas() {
		if(listaDePreguntas.isEmpty()) {
			//EUROPA
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Albania?", "Tirana", "Skopje", "Atenas", "Belgrado"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Alemania?", "Berlín", "París", "Viena", "Bruselas"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Andorra?", "Andorra la Vella", "Madrid", "Lisboa", "Roma"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Armenia?", "Ereván", "Tbilisi", "Bakú", "Teherán"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Austria?", "Viena", "Berlín", "Praga", "Budapest"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Azerbaiyán?", "Bakú", "Ereván", "Ankara", "Tbilisi"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Bélgica?", "Bruselas", "Ámsterdam", "Luxemburgo", "París"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Bielorrusia?", "Minsk", "Kiev", "Sofía", "Vilna"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Bosnia y Herzegovina?", "Sarajevo", "Belgrado", "Zagreb", "Podgorica"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Bulgaria?", "Sofía", "Bucarest", "Belgrado", "Atenas"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Chipre?", "Nicosia", "Atenas", "Malta", "Estambul"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Croacia?", "Zagreb", "Budapest", "Liubliana", "Sarajevo"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Dinamarca?", "Copenhague", "Estocolmo", "Oslo", "Helsinki"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Eslovaquia?", "Bratislava", "Praga", "Liubliana", "Budapest"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Eslovenia?", "Liubliana", "Zagreb", "Bratislava", "Belgrado"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de España?", "Madrid", "Barcelona", "Lisboa", "Roma"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Estonia?", "Tallin", "Riga", "Vilna", "Helsinki"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Finlandia?", "Helsinki", "Estocolmo", "Copenhague", "Oslo"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Francia?", "París", "Londres", "Berlín", "Madrid"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Georgia?", "Tbilisi", "Ereván", "Bakú", "Ankara"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Grecia?", "Atenas", "Sofía", "Bucarest", "Skopje"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Hungría?", "Budapest", "Praga", "Bratislava", "Viena"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Irlanda?", "Dublín", "Belfast", "Cardiff", "Edimburgo"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Islandia?", "Reikiavik", "Oslo", "Helsinki", "Copenhague"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Italia?", "Roma", "Madrid", "Atenas", "Londres"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Kazajistán?", "Nur-Sultán", "Almatý", "Astana", "Biskek"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Letonia?", "Riga", "Tallin", "Vilna", "Helsinki"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Liechtenstein?", "Vaduz", "Berna", "Viena", "Zúrich"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Lituania?", "Vilna", "Riga", "Tallin", "Helsinki"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Luxemburgo?", "Luxemburgo", "Bruselas", "Ámsterdam", "Berna"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Malta?", "La Valeta", "Nicosia", "Atenas", "Roma"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Moldavia?", "Chisináu", "Bucarest", "Kiev", "Sofía"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Mónaco?", "Mónaco", "París", "Niza", "Berna"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Montenegro?", "Podgorica", "Belgrado", "Sarajevo", "Tirana"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Noruega?", "Oslo", "Estocolmo", "Copenhague", "Helsinki"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Países Bajos?", "Ámsterdam", "Rotterdam", "Bruselas", "Luxemburgo"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Polonia?", "Varsovia", "Cracovia", "Praga", "Budapest"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Portugal?", "Lisboa", "Madrid", "Roma", "París"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Reino Unido?", "Londres", "Dublín", "Edimburgo", "París"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de República Checa?", "Praga", "Bratislava", "Budapest", "Viena"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Rumania?", "Bucarest", "Sofía", "Belgrado", "Kiev"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Rusia?", "Moscú", "San Petersburgo", "Kiev", "Berlín"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de San Marino?", "San Marino", "Roma", "Florencia", "Nápoles"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Serbia?", "Belgrado", "Zagreb", "Sarajevo", "Podgorica"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Suecia?", "Estocolmo", "Copenhague", "Oslo", "Helsinki"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Suiza?", "Berna", "Zúrich", "Ginebra", "Viena"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Turquía?", "Ankara", "Estambul", "Atenas", "Sofía"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Ucrania?", "Kiev", "Moscú", "Varsovia", "Budapest"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Vaticano?", "Ciudad del Vaticano", "Roma", "Florencia", "Nápoles"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Yugoslavia?", "Belgrado", "Zagreb", "Sarajevo", "Podgorica"));
			
			//AMERICA
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Antigua y Barbuda?", "Saint John's", "Bridgetown", "Castries", "Kingston"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Argentina?", "Buenos Aires", "Córdoba", "Rosario", "Mendoza"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Bahamas?", "Nasáu", "Kingston", "Bridgetown", "Belmopán"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Barbados?", "Bridgetown", "Port of Spain", "Kingston", "Castries"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Belice?", "Belmopán", "Kingston", "Ciudad de Panamá", "San Salvador"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Bolivia?", "La Paz / Sucre", "Buenos Aires", "Lima", "Asunción"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Brasil?", "Brasilia", "Río de Janeiro", "Sao Paulo", "Buenos Aires"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Canadá?", "Ottawa", "Toronto", "Montreal", "Vancouver"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Chile?", "Santiago", "Buenos Aires", "Lima", "Bogotá"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Colombia?", "Bogotá", "Medellín", "Cali", "Barranquilla"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Costa Rica?", "San José", "Ciudad de Panamá", "Managua", "Tegucigalpa"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Cuba?", "La Habana", "Santo Domingo", "San Juan", "Kingston"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Dominica?", "Roseau", "Saint George's", "Castries", "Bridgetown"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Ecuador?", "Quito", "Lima", "Bogotá", "Caracas"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de El Salvador?", "San Salvador", "Tegucigalpa", "Managua", "Guatemala"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Estados Unidos?", "Washington D.C.", "Nueva York", "Los Ángeles", "Chicago"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Granada?", "Saint George's", "Bridgetown", "Kingston", "Castries"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Guatemala?", "Guatemala", "San Salvador", "Managua", "Tegucigalpa"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Guyana?", "Georgetown", "Paramaribo", "Castries", "Bridgetown"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Haití?", "Puerto Príncipe", "Santo Domingo", "San Juan", "La Habana"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Honduras?", "Tegucigalpa", "San Salvador", "Guatemala", "Managua"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Jamaica?", "Kingston", "Santo Domingo", "San Juan", "La Habana"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de México?", "Ciudad de México", "Guadalajara", "Monterrey", "Puebla"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Nicaragua?", "Managua", "Tegucigalpa", "San Salvador", "Guatemala"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Panamá?", "Ciudad de Panamá", "San José", "San Salvador", "Guatemala"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Paraguay?", "Asunción", "Buenos Aires", "Lima", "Brasilia"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Perú?", "Lima", "Bogotá", "Santiago", "Quito"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de República Dominicana?", "Santo Domingo", "Puerto Príncipe", "San Juan", "La Habana"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de San Cristóbal y Nieves?", "Basseterre", "Castries", "Kingston", "Bridgetown"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de San Vicente y las Granadinas?", "Kingstown", "Castries", "Bridgetown", "Saint George's"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Santa Lucía?", "Castries", "Saint George's", "Kingstown", "Bridgetown"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Surinam?", "Paramaribo", "Georgetown", "Castries", "Bridgetown"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Trinidad y Tobago?", "Puerto España", "Kingston", "Bridgetown", "Castries"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Uruguay?", "Montevideo", "Buenos Aires", "Asunción", "Lima"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Venezuela?", "Caracas", "Bogotá", "Lima", "Quito"));
			
			//AFRICA
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Angola?", "Luanda", "Maputo", "Pretoria", "Windhoek"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Argelia?", "Argel", "Casablanca", "Túnez", "Rabat"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Benín?", "Porto Novo", "Cotonú", "Accra", "Lomé"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Botsuana?", "Gaborone", "Pretoria", "Harare", "Lusaka"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Burkina Faso?", "Uagadugú", "Ouagadougou", "Abiyán", "Níger"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Burundi?", "Buyumbura", "Kigali", "Gitega", "Kampala"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Cabo Verde?", "Praia", "Dakar", "Banjul", "Conakry"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Camerún?", "Yaundé", "Duala", "Libreville", "Brazzaville"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Chad?", "Yamena", "Niamey", "Bangui", "Ndjamena"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Comoras?", "Moroni", "Victoria", "Mamoudzou", "Dzaoudzi"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de República del Congo?", "Brazzaville", "Kinshasa", "Yaundé", "Bangui"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de República Democrática del Congo?", "Kinshasa", "Brazzaville", "Luanda", "Libreville"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Costa de Marfil?", "Yamoussoukro", "Abiyán", "Accra", "Lomé"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Yibuti?", "Yibuti", "Hargeisa", "Mogadiscio", "Asmara"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Egipto?", "El Cairo", "Alejandría", "Jartum", "Trípoli"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Guinea Ecuatorial?", "Malabo", "Bata", "Libreville", "Yaundé"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Eritrea?", "Asmara", "Yibuti", "Jartum", "Mogadiscio"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Eswatini?", "Mbabane", "Lobamba", "Manzini", "Gaborone"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Etiopía?", "Addis Abeba", "Nairobi", "Kigali", "Kampala"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Gabón?", "Libreville", "Brazzaville", "Malabo", "Yaundé"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Gambia?", "Banjul", "Dakar", "Conakry", "Monrovia"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Ghana?", "Accra", "Lomé", "Ouagadougou", "Abiyán"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Guinea?", "Conakry", "Banjul", "Monrovia", "Freetown"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Guinea-Bisáu?", "Bisáu", "Conakry", "Banjul", "Dakar"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Kenia?", "Nairobi", "Kampala", "Kigali", "Addis Abeba"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Lesoto?", "Maseru", "Mbabane", "Lobamba", "Manzini"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Liberia?", "Monrovia", "Freetown", "Conakry", "Banjul"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Libia?", "Trípoli", "El Cairo", "Argel", "Jartum"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Madagascar?", "Antananarivo", "Maputo", "Antananarivo", "Moroni"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Malaui?", "Lilongüe", "Lusaka", "Harare", "Gaborone"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Mali?", "Bamako", "Níger", "N'Djamena", "Burkina Faso"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Mauritania?", "Nuakchot", "Bamako", "Nuakchot", "Rabat"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Mauricio?", "Port Louis", "Saint-Denis", "Victoria", "Porto Novo"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Marruecos?", "Rabat", "Argel", "Casablanca", "Túnez"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Mozambique?", "Maputo", "Luanda", "Pretoria", "Lusaka"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Namibia?", "Windhoek", "Gaborone", "Pretoria", "Lusaka"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Níger?", "Niamey", "Bamako", "Uagadugú", "Yamena"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Nigeria?", "Abuya", "Lagos", "Kano", "Ibadán"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Ruanda?", "Kigali", "Kampala", "Nairobi", "Bujumbura"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Santo Tomé y Príncipe?", "Santo Tomé", "Malabo", "Luanda", "Libreville"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Senegal?", "Dakar", "Banjul", "Conakry", "Freetown"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Seychelles?", "Victoria", "Port Louis", "Porto Novo", "Moroni"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Sierra Leona?", "Freetown", "Monrovia", "Conakry", "Banjul"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Somalia?", "Mogadiscio", "Hargeisa", "Yibuti", "Asmara"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Sudáfrica?", "Pretoria / Ciudad del Cabo", "Johannesburgo", "Bloemfontein", "Windhoek"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Sudán del Sur?", "Yuba", "Jartum", "Kampala", "Nairobi"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Sudán?", "Jartum", "El Cairo", "Trípoli", "Yuba"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Tanzania?", "Dodoma", "Dar es Salaam", "Kampala", "Nairobi"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Togo?", "Lomé", "Accra", "Abiyán", "Uagadugú"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Túnez?", "Túnez", "Argel", "Rabat", "Casablanca"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Uganda?", "Kampala", "Nairobi", "Kigali", "Juba"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Zambia?", "Lusaka", "Harare", "Gaborone", "Pretoria"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Zimbabue?", "Harare", "Lusaka", "Gaborone", "Pretoria"));
			
			//OCEANÍA
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Australia?", "Canberra", "Sídney", "Melbourne", "Brisbane"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Fiyi?", "Suva", "Nadi", "Apia", "Wellington"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Kiribati?", "Tarawa Sur", "Nauru", "Majuro", "Funafuti"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Islas Marshall?", "Majuro", "Nauru", "Tarawa Sur", "Palikir"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Micronesia?", "Palikir", "Majuro", "Nauru", "Yaren"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Nauru?", "Yaren", "Palikir", "Majuro", "Tarawa Sur"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Nueva Zelanda?", "Wellington", "Auckland", "Sídney", "Canberra"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Palaos?", "Ngerulmud", "Melekeok", "Koror", "Majuro"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Papúa Nueva Guinea?", "Puerto Moresby", "Honiara", "Port Vila", "Dili"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Islas Salomón?", "Honiara", "Puerto Moresby", "Port Vila", "Suva"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Tonga?", "Nukualofa", "Apia", "Suva", "Port Vila"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Tuvalu?", "Funafuti", "Tarawa Sur", "Nauru", "Palikir"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Vanuatu?", "Port Vila", "Suva", "Nukualofa", "Apia"));
			
			//ASIA
			
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Afganistán?", "Kabul", "Kandahar", "Islamabad", "Teherán"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Arabia Saudita?", "Riad", "Jeddah", "Doha", "Abu Dabi"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Armenia?", "Ereván", "Tbilisi", "Bakú", "Ankara"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Azerbaiyán?", "Bakú", "Ereván", "Teherán", "Ankara"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Bangladés?", "Daca", "Dhaka", "Chittagong", "Kolkata"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Baréin?", "Manama", "Doha", "Riad", "Abu Dabi"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Birmania (Myanmar)?", "Naypyidaw", "Yangón", "Mandalay", "Bangkok"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Brunéi?", "Bandar Seri Begawan", "Kuala Lumpur", "Yakarta", "Bangkok"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Bután?", "Timbu", "Kathmandú", "Dhaka", "Thimphu"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Camboya?", "Nom Pen", "Phnom Penh", "Bangkok", "Vientián"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Catar?", "Doha", "Riad", "Manama", "Kuwait"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de China?", "Pekín", "Shanghái", "Hong Kong", "Tokio"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Chipre?", "Nicosia", "Atenas", "Estambul", "Beirut"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Corea del Norte?", "Pyongyang", "Seúl", "Busan", "Tokio"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Corea del Sur?", "Seúl", "Pyongyang", "Busan", "Tokio"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Emiratos Árabes Unidos?", "Abu Dabi", "Dubái", "Riad", "Doha"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Filipinas?", "Manila", "Ciudad de Manila", "Cebú", "Davao"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Georgia?", "Tiflis", "Ereván", "Bakú", "Ankara"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de India?", "Nueva Delhi", "Bombay", "Calcuta", "Bangalore"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Indonesia?", "Yakarta", "Bandung", "Surabaya", "Kuala Lumpur"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Irak?", "Bagdad", "Baghdad", "Basora", "Erbil"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Irán?", "Teherán", "Bagdad", "Kuwait", "Doha"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Israel?", "Jerusalén", "Tel Aviv", "Haifa", "El Cairo"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Japón?", "Tokio", "Kioto", "Osaka", "Seúl"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Jordania?", "Amán", "El Cairo", "Riad", "Doha"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Kazajistán?", "Nur-Sultán", "Almaty", "Astana", "Biskek"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Kirguistán?", "Biskek", "Almaty", "Astana", "Nur-Sultán"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Kuwait?", "Kuwait", "Doha", "Manama", "Riad"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Laos?", "Vientián", "Nom Pen", "Bangkok", "Phnom Penh"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Líbano?", "Beirut", "Damasco", "El Cairo", "Amán"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Malasia?", "Kuala Lumpur", "Singapur", "Yakarta", "Bangkok"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Maldivas?", "Malé", "Mascate", "Colombo", "Thimphu"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Mongolia?", "Ulán Bator", "Pekín", "Seúl", "Tokio"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Nepal?", "Katmandú", "Timbu", "Lhasa", "Dhaka"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Omán?", "Mascate", "Riad", "Doha", "Manama"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Pakistán?", "Islamabad", "Karachi", "Lahore", "Nueva Delhi"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Palestina?", "Jerusalén Este", "Gaza", "Amán", "Damasco"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Filipinas?", "Manila", "Ciudad de Manila", "Cebú", "Davao"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Rusia?", "Moscú", "San Petersburgo", "Novosibirsk", "Ekaterimburgo"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Arabia Saudita?", "Riad", "Jeddah", "Doha", "Abu Dabi"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Singapur?", "Singapur", "Kuala Lumpur", "Yakarta", "Bangkok"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Siria?", "Damasco", "Beirut", "Amán", "Bagdad"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Sri Lanka?", "Sri Jayawardenapura Kotte", "Colombo", "Malé", "Mascate"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Tayikistán?", "Dusambé", "Taskent", "Biskek", "Nur-Sultán"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Tailandia?", "Bangkok", "Vientián", "Nom Pen", "Hanoi"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Timor Oriental?", "Dili", "Yakarta", "Darwin", "Kupang"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Turquía?", "Ankara", "Estambul", "Atenas", "Sofía"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Turkmenistán?", "Asjabad", "Biskek", "Dusambé", "Taskent"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Emiratos Árabes Unidos?", "Abu Dabi", "Dubái", "Riad", "Doha"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Uzbekistán?", "Taskent", "Biskek", "Dusambé", "Nur-Sultán"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Vietnam?", "Hanói", "Ciudad de Ho Chi Minh", "Nom Pen", "Bangkok"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Yemen?", "Saná", "Mascate", "Doha", "Riad"));
			listaDePreguntas.add(new Pregunta("¿Cuál es la capital de Yibuti?", "Yibuti", "Hargeisa", "Mogadiscio", "Asmara"));
		}
			Collections.shuffle(listaDePreguntas);
	}

	public static List<Pregunta> getListaDePreguntas() {
		return listaDePreguntas;
	}

	public static int getCantidadDePreguntas() {
		return cantidadDePreguntas;
	}

	public static int getCantidadDePreguntasOriginal() {
		return cantidadDePreguntasOriginal;
	}

	public static void setCantidadDePreguntas(int cantidadDePreguntas) {
		Preguntas.cantidadDePreguntas = cantidadDePreguntas;
	}

	public static void setCantidadDePreguntasOriginal(int cantidadDePreguntasOriginal) {
		Preguntas.cantidadDePreguntasOriginal = cantidadDePreguntasOriginal;
	}
	
	

	
	
	
	
}
