package es.finalPrimerCurso.finalPrimerCurso.Clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Capitales {

	private static List<PreguntaCapital> listaDePreguntas = new ArrayList<>();
	private static int cantidadDePreguntasOriginal = 0;
	private static int cantidadDePreguntas = 0;	
	
	public Capitales() {
		if(listaDePreguntas.isEmpty()) {
			//EUROPA
			listaDePreguntas.add(new PreguntaCapital("¿Albania?", "Tirana", "Skopje", "Atenas", "Belgrado"));
			listaDePreguntas.add(new PreguntaCapital("¿Alemania?", "Berlín", "París", "Viena", "Bruselas"));
			listaDePreguntas.add(new PreguntaCapital("¿Andorra?", "Andorra la Vella", "Madrid", "Lisboa", "Roma"));
			listaDePreguntas.add(new PreguntaCapital("¿Armenia?", "Ereván", "Tbilisi", "Bakú", "Teherán"));
			listaDePreguntas.add(new PreguntaCapital("¿Austria?", "Viena", "Berlín", "Praga", "Budapest"));
			listaDePreguntas.add(new PreguntaCapital("¿Azerbaiyán?", "Bakú", "Ereván", "Ankara", "Tbilisi"));
			listaDePreguntas.add(new PreguntaCapital("¿Bélgica?", "Bruselas", "Ámsterdam", "Luxemburgo", "París"));
			listaDePreguntas.add(new PreguntaCapital("¿Bielorrusia?", "Minsk", "Kiev", "Sofía", "Vilna"));
			listaDePreguntas.add(new PreguntaCapital("¿Bosnia y Herzegovina?", "Sarajevo", "Belgrado", "Zagreb", "Podgorica"));
			listaDePreguntas.add(new PreguntaCapital("¿Bulgaria?", "Sofía", "Bucarest", "Belgrado", "Atenas"));
			listaDePreguntas.add(new PreguntaCapital("¿Chipre?", "Nicosia", "Atenas", "Malta", "Estambul"));
			listaDePreguntas.add(new PreguntaCapital("¿Croacia?", "Zagreb", "Budapest", "Liubliana", "Sarajevo"));
			listaDePreguntas.add(new PreguntaCapital("¿Dinamarca?", "Copenhague", "Estocolmo", "Oslo", "Helsinki"));
			listaDePreguntas.add(new PreguntaCapital("¿Eslovaquia?", "Bratislava", "Praga", "Liubliana", "Budapest"));
			listaDePreguntas.add(new PreguntaCapital("¿Eslovenia?", "Liubliana", "Zagreb", "Bratislava", "Belgrado"));
			listaDePreguntas.add(new PreguntaCapital("¿España?", "Madrid", "Barcelona", "Sevilla", "Murcia"));
			listaDePreguntas.add(new PreguntaCapital("¿Estonia?", "Tallin", "Riga", "Vilna", "Helsinki"));
			listaDePreguntas.add(new PreguntaCapital("¿Finlandia?", "Helsinki", "Estocolmo", "Copenhague", "Oslo"));
			listaDePreguntas.add(new PreguntaCapital("¿Francia?", "París", "Londres", "Berlín", "Madrid"));
			listaDePreguntas.add(new PreguntaCapital("¿Georgia?", "Tbilisi", "Ereván", "Bakú", "Ankara"));
			listaDePreguntas.add(new PreguntaCapital("¿Grecia?", "Atenas", "Sofía", "Bucarest", "Skopje"));
			listaDePreguntas.add(new PreguntaCapital("¿Hungría?", "Budapest", "Praga", "Bratislava", "Viena"));
			listaDePreguntas.add(new PreguntaCapital("¿Irlanda?", "Dublín", "Belfast", "Cardiff", "Edimburgo"));
			listaDePreguntas.add(new PreguntaCapital("¿Islandia?", "Reikiavik", "Oslo", "Helsinki", "Copenhague"));
			listaDePreguntas.add(new PreguntaCapital("¿Italia?", "Roma", "Madrid", "Atenas", "Londres"));
			listaDePreguntas.add(new PreguntaCapital("¿Letonia?", "Riga", "Tallin", "Vilna", "Helsinki"));
			listaDePreguntas.add(new PreguntaCapital("¿Liechtenstein?", "Vaduz", "Berna", "Viena", "Zúrich"));
			listaDePreguntas.add(new PreguntaCapital("¿Lituania?", "Vilna", "Riga", "Tallin", "Helsinki"));
			listaDePreguntas.add(new PreguntaCapital("¿Luxemburgo?", "Luxemburgo", "Bruselas", "Ámsterdam", "Berna"));
			listaDePreguntas.add(new PreguntaCapital("¿Malta?", "La Valeta", "Nicosia", "Atenas", "Roma"));
			listaDePreguntas.add(new PreguntaCapital("¿Moldavia?", "Chisináu", "Bucarest", "Kiev", "Sofía"));
			listaDePreguntas.add(new PreguntaCapital("¿Mónaco?", "Mónaco", "París", "Niza", "Berna"));
			listaDePreguntas.add(new PreguntaCapital("¿Montenegro?", "Podgorica", "Belgrado", "Sarajevo", "Tirana"));
			listaDePreguntas.add(new PreguntaCapital("¿Noruega?", "Oslo", "Estocolmo", "Copenhague", "Helsinki"));
			listaDePreguntas.add(new PreguntaCapital("¿Países Bajos?", "Ámsterdam", "Rotterdam", "Bruselas", "Luxemburgo"));
			listaDePreguntas.add(new PreguntaCapital("¿Polonia?", "Varsovia", "Cracovia", "Praga", "Budapest"));
			listaDePreguntas.add(new PreguntaCapital("¿Portugal?", "Lisboa", "Madrid", "Roma", "París"));
			listaDePreguntas.add(new PreguntaCapital("¿Reino Unido?", "Londres", "Dublín", "Edimburgo", "París"));
			listaDePreguntas.add(new PreguntaCapital("¿República Checa?", "Praga", "Bratislava", "Budapest", "Viena"));
			listaDePreguntas.add(new PreguntaCapital("¿Rumania?", "Bucarest", "Sofía", "Belgrado", "Kiev"));
			listaDePreguntas.add(new PreguntaCapital("¿Rusia?", "Moscú", "San Petersburgo", "Kiev", "Berlín"));
			listaDePreguntas.add(new PreguntaCapital("¿San Marino?", "San Marino", "Roma", "Florencia", "Nápoles"));
			listaDePreguntas.add(new PreguntaCapital("¿Serbia?", "Belgrado", "Zagreb", "Sarajevo", "Podgorica"));
			listaDePreguntas.add(new PreguntaCapital("¿Suecia?", "Estocolmo", "Copenhague", "Oslo", "Helsinki"));
			listaDePreguntas.add(new PreguntaCapital("¿Suiza?", "Berna", "Zúrich", "Ginebra", "Viena"));
			listaDePreguntas.add(new PreguntaCapital("¿Turquía?", "Ankara", "Estambul", "Atenas", "Sofía"));
			listaDePreguntas.add(new PreguntaCapital("¿Ucrania?", "Kiev", "Moscú", "Varsovia", "Budapest"));
			listaDePreguntas.add(new PreguntaCapital("¿Vaticano?", "Ciudad del Vaticano", "Roma", "Florencia", "Nápoles"));
			
			//AMERICA
			listaDePreguntas.add(new PreguntaCapital("¿Antigua y Barbuda?", "Saint John's", "Bridgetown", "Castries", "Kingston"));
			listaDePreguntas.add(new PreguntaCapital("¿Argentina?", "Buenos Aires", "Córdoba", "Rosario", "Mendoza"));
			listaDePreguntas.add(new PreguntaCapital("¿Bahamas?", "Nasáu", "Kingston", "Bridgetown", "Belmopán"));
			listaDePreguntas.add(new PreguntaCapital("¿Barbados?", "Bridgetown", "Port of Spain", "Kingston", "Castries"));
			listaDePreguntas.add(new PreguntaCapital("¿Belice?", "Belmopán", "Kingston", "Ciudad de Panamá", "San Salvador"));
			listaDePreguntas.add(new PreguntaCapital("¿Bolivia?", "La Paz / Sucre", "Buenos Aires", "Lima", "Asunción"));
			listaDePreguntas.add(new PreguntaCapital("¿Brasil?", "Brasilia", "Río de Janeiro", "Sao Paulo", "Buenos Aires"));
			listaDePreguntas.add(new PreguntaCapital("¿Canadá?", "Ottawa", "Toronto", "Montreal", "Vancouver"));
			listaDePreguntas.add(new PreguntaCapital("¿Chile?", "Santiago", "Buenos Aires", "Lima", "Bogotá"));
			listaDePreguntas.add(new PreguntaCapital("¿Colombia?", "Bogotá", "Medellín", "Cali", "Barranquilla"));
			listaDePreguntas.add(new PreguntaCapital("¿Costa Rica?", "San José", "Ciudad de Panamá", "Managua", "Tegucigalpa"));
			listaDePreguntas.add(new PreguntaCapital("¿Cuba?", "La Habana", "Santo Domingo", "San Juan", "Kingston"));
			listaDePreguntas.add(new PreguntaCapital("¿Dominica?", "Roseau", "Saint George's", "Castries", "Bridgetown"));
			listaDePreguntas.add(new PreguntaCapital("¿Ecuador?", "Quito", "Lima", "Bogotá", "Caracas"));
			listaDePreguntas.add(new PreguntaCapital("¿El Salvador?", "San Salvador", "Tegucigalpa", "Managua", "Guatemala"));
			listaDePreguntas.add(new PreguntaCapital("¿Estados Unidos?", "Washington D.C.", "Nueva York", "Los Ángeles", "Chicago"));
			listaDePreguntas.add(new PreguntaCapital("¿Granada?", "Saint George's", "Bridgetown", "Kingston", "Castries"));
			listaDePreguntas.add(new PreguntaCapital("¿Guatemala?", "Guatemala", "San Salvador", "Managua", "Tegucigalpa"));
			listaDePreguntas.add(new PreguntaCapital("¿Guyana?", "Georgetown", "Paramaribo", "Castries", "Bridgetown"));
			listaDePreguntas.add(new PreguntaCapital("¿Haití?", "Puerto Príncipe", "Santo Domingo", "San Juan", "La Habana"));
			listaDePreguntas.add(new PreguntaCapital("¿Honduras?", "Tegucigalpa", "San Salvador", "Guatemala", "Managua"));
			listaDePreguntas.add(new PreguntaCapital("¿Jamaica?", "Kingston", "Santo Domingo", "San Juan", "La Habana"));
			listaDePreguntas.add(new PreguntaCapital("¿México?", "Ciudad de México", "Guadalajara", "Monterrey", "Puebla"));
			listaDePreguntas.add(new PreguntaCapital("¿Nicaragua?", "Managua", "Tegucigalpa", "San Salvador", "Guatemala"));
			listaDePreguntas.add(new PreguntaCapital("¿Panamá?", "Ciudad de Panamá", "San José", "San Salvador", "Guatemala"));
			listaDePreguntas.add(new PreguntaCapital("¿Paraguay?", "Asunción", "Buenos Aires", "Lima", "Brasilia"));
			listaDePreguntas.add(new PreguntaCapital("¿Perú?", "Lima", "Bogotá", "Santiago", "Quito"));
			listaDePreguntas.add(new PreguntaCapital("¿República Dominicana?", "Santo Domingo", "Puerto Príncipe", "San Juan", "La Habana"));
			listaDePreguntas.add(new PreguntaCapital("¿San Cristóbal y Nieves?", "Basseterre", "Castries", "Kingston", "Bridgetown"));
			listaDePreguntas.add(new PreguntaCapital("¿San Vicente y las Granadinas?", "Kingstown", "Castries", "Bridgetown", "Saint George's"));
			listaDePreguntas.add(new PreguntaCapital("¿Santa Lucía?", "Castries", "Saint George's", "Kingstown", "Bridgetown"));
			listaDePreguntas.add(new PreguntaCapital("¿Surinam?", "Paramaribo", "Georgetown", "Castries", "Bridgetown"));
			listaDePreguntas.add(new PreguntaCapital("¿Trinidad y Tobago?", "Puerto España", "Kingston", "Bridgetown", "Castries"));
			listaDePreguntas.add(new PreguntaCapital("¿Uruguay?", "Montevideo", "Buenos Aires", "Asunción", "Lima"));
			listaDePreguntas.add(new PreguntaCapital("¿Venezuela?", "Caracas", "Bogotá", "Lima", "Quito"));
			
			//AFRICA
			listaDePreguntas.add(new PreguntaCapital("¿Angola?", "Luanda", "Maputo", "Pretoria", "Windhoek"));
			listaDePreguntas.add(new PreguntaCapital("¿Argelia?", "Argel", "Casablanca", "Túnez", "Rabat"));
			listaDePreguntas.add(new PreguntaCapital("¿Benín?", "Porto Novo", "Cotonú", "Accra", "Lomé"));
			listaDePreguntas.add(new PreguntaCapital("¿Botsuana?", "Gaborone", "Pretoria", "Harare", "Lusaka"));
			listaDePreguntas.add(new PreguntaCapital("¿Burkina Faso?", "Uagadugú", "Ouagadougou", "Abiyán", "Níger"));
			listaDePreguntas.add(new PreguntaCapital("¿Burundi?", "Buyumbura", "Kigali", "Gitega", "Kampala"));
			listaDePreguntas.add(new PreguntaCapital("¿Cabo Verde?", "Praia", "Dakar", "Banjul", "Conakry"));
			listaDePreguntas.add(new PreguntaCapital("¿Camerún?", "Yaundé", "Duala", "Libreville", "Brazzaville"));
			listaDePreguntas.add(new PreguntaCapital("¿Chad?", "Yamena", "Niamey", "Bangui", "Ndjamena"));
			listaDePreguntas.add(new PreguntaCapital("¿Comoras?", "Moroni", "Victoria", "Mamoudzou", "Dzaoudzi"));
			listaDePreguntas.add(new PreguntaCapital("¿R. del Congo?", "Brazzaville", "Kinshasa", "Yaundé", "Bangui"));
			listaDePreguntas.add(new PreguntaCapital("¿R. Democrática del Congo?", "Kinshasa", "Brazzaville", "Luanda", "Libreville"));
			listaDePreguntas.add(new PreguntaCapital("¿Costa de Marfil?", "Yamoussoukro", "Abiyán", "Accra", "Lomé"));
			listaDePreguntas.add(new PreguntaCapital("¿Yibuti?", "Yibuti", "Hargeisa", "Mogadiscio", "Asmara"));
			listaDePreguntas.add(new PreguntaCapital("¿Egipto?", "El Cairo", "Alejandría", "Jartum", "Trípoli"));
			listaDePreguntas.add(new PreguntaCapital("¿Guinea Ecuatorial?", "Malabo", "Bata", "Libreville", "Yaundé"));
			listaDePreguntas.add(new PreguntaCapital("¿Eritrea?", "Asmara", "Yibuti", "Jartum", "Mogadiscio"));
			listaDePreguntas.add(new PreguntaCapital("¿Eswatini?", "Mbabane", "Lobamba", "Manzini", "Gaborone"));
			listaDePreguntas.add(new PreguntaCapital("¿Etiopía?", "Addis Abeba", "Nairobi", "Kigali", "Kampala"));
			listaDePreguntas.add(new PreguntaCapital("¿Gabón?", "Libreville", "Brazzaville", "Malabo", "Yaundé"));
			listaDePreguntas.add(new PreguntaCapital("¿Gambia?", "Banjul", "Dakar", "Conakry", "Monrovia"));
			listaDePreguntas.add(new PreguntaCapital("¿Ghana?", "Accra", "Lomé", "Ouagadougou", "Abiyán"));
			listaDePreguntas.add(new PreguntaCapital("¿Guinea?", "Conakry", "Banjul", "Monrovia", "Freetown"));
			listaDePreguntas.add(new PreguntaCapital("¿Guinea-Bisáu?", "Bisáu", "Conakry", "Banjul", "Dakar"));
			listaDePreguntas.add(new PreguntaCapital("¿Kenia?", "Nairobi", "Kampala", "Kigali", "Addis Abeba"));
			listaDePreguntas.add(new PreguntaCapital("¿Lesoto?", "Maseru", "Mbabane", "Lobamba", "Manzini"));
			listaDePreguntas.add(new PreguntaCapital("¿Liberia?", "Monrovia", "Freetown", "Conakry", "Banjul"));
			listaDePreguntas.add(new PreguntaCapital("¿Libia?", "Trípoli", "El Cairo", "Argel", "Jartum"));
			listaDePreguntas.add(new PreguntaCapital("¿Madagascar?", "Antananarivo", "Maputo", "Antanamarivo", "Moroni"));
			listaDePreguntas.add(new PreguntaCapital("¿Malaui?", "Lilongüe", "Lusaka", "Harare", "Gaborone"));
			listaDePreguntas.add(new PreguntaCapital("¿Mali?", "Bamako", "Níger", "N'Djamena", "Burkina Faso"));
			listaDePreguntas.add(new PreguntaCapital("¿Mauritania?", "Nuakchot", "Bamako", "Nuacchiot", "Rabat"));
			listaDePreguntas.add(new PreguntaCapital("¿Mauricio?", "Port Louis", "Saint-Denis", "Victoria", "Porto Novo"));
			listaDePreguntas.add(new PreguntaCapital("¿Marruecos?", "Rabat", "Argel", "Casablanca", "Túnez"));
			listaDePreguntas.add(new PreguntaCapital("¿Mozambique?", "Maputo", "Luanda", "Pretoria", "Lusaka"));
			listaDePreguntas.add(new PreguntaCapital("¿Namibia?", "Windhoek", "Gaborone", "Pretoria", "Lusaka"));
			listaDePreguntas.add(new PreguntaCapital("¿Níger?", "Niamey", "Bamako", "Uagadugú", "Yamena"));
			listaDePreguntas.add(new PreguntaCapital("¿Nigeria?", "Abuya", "Lagos", "Kano", "Ibadán"));
			listaDePreguntas.add(new PreguntaCapital("¿Ruanda?", "Kigali", "Kampala", "Nairobi", "Bujumbura"));
			listaDePreguntas.add(new PreguntaCapital("¿Santo Tomé y Príncipe?", "Santo Tomé", "Malabo", "Luanda", "Libreville"));
			listaDePreguntas.add(new PreguntaCapital("¿Senegal?", "Dakar", "Banjul", "Conakry", "Freetown"));
			listaDePreguntas.add(new PreguntaCapital("¿Seychelles?", "Victoria", "Port Louis", "Porto Novo", "Moroni"));
			listaDePreguntas.add(new PreguntaCapital("¿Sierra Leona?", "Freetown", "Monrovia", "Conakry", "Banjul"));
			listaDePreguntas.add(new PreguntaCapital("¿Somalia?", "Mogadiscio", "Hargeisa", "Yibuti", "Asmara"));
			listaDePreguntas.add(new PreguntaCapital("¿Sudáfrica?", "Pretoria / Ciudad del Cabo", "Johannesburgo", "Bloemfontein", "Windhoek"));
			listaDePreguntas.add(new PreguntaCapital("¿Sudán del Sur?", "Yuba", "Jartum", "Kampala", "Nairobi"));
			listaDePreguntas.add(new PreguntaCapital("¿Sudán?", "Jartum", "El Cairo", "Trípoli", "Yuba"));
			listaDePreguntas.add(new PreguntaCapital("¿Tanzania?", "Dodoma", "Dar es Salaam", "Kampala", "Nairobi"));
			listaDePreguntas.add(new PreguntaCapital("¿Togo?", "Lomé", "Accra", "Abiyán", "Uagadugú"));
			listaDePreguntas.add(new PreguntaCapital("¿Túnez?", "Túnez", "Argel", "Rabat", "Casablanca"));
			listaDePreguntas.add(new PreguntaCapital("¿Uganda?", "Kampala", "Nairobi", "Kigali", "Juba"));
			listaDePreguntas.add(new PreguntaCapital("¿Zambia?", "Lusaka", "Harare", "Gaborone", "Pretoria"));
			listaDePreguntas.add(new PreguntaCapital("¿Zimbabue?", "Harare", "Lusaka", "Gaborone", "Pretoria"));
			
			//OCEANÍA
			listaDePreguntas.add(new PreguntaCapital("¿Australia?", "Canberra", "Sídney", "Melbourne", "Brisbane"));
			listaDePreguntas.add(new PreguntaCapital("¿Fiyi?", "Suva", "Nadi", "Apia", "Wellington"));
			listaDePreguntas.add(new PreguntaCapital("¿Kiribati?", "Tarawa Sur", "Nauru", "Majuro", "Funafuti"));
			listaDePreguntas.add(new PreguntaCapital("¿Islas Marshall?", "Majuro", "Nauru", "Tarawa Sur", "Palikir"));
			listaDePreguntas.add(new PreguntaCapital("¿Micronesia?", "Palikir", "Majuro", "Nauru", "Yaren"));
			listaDePreguntas.add(new PreguntaCapital("¿Nauru?", "Yaren", "Palikir", "Majuro", "Tarawa Sur"));
			listaDePreguntas.add(new PreguntaCapital("¿Nueva Zelanda?", "Wellington", "Auckland", "Sídney", "Canberra"));
			listaDePreguntas.add(new PreguntaCapital("¿Palaos?", "Ngerulmud", "Melekeok", "Koror", "Majuro"));
			listaDePreguntas.add(new PreguntaCapital("¿Papúa Nueva Guinea?", "Puerto Moresby", "Honiara", "Port Vila", "Dili"));
			listaDePreguntas.add(new PreguntaCapital("¿Islas Salomón?", "Honiara", "Puerto Moresby", "Port Vila", "Suva"));
			listaDePreguntas.add(new PreguntaCapital("¿Tonga?", "Nukualofa", "Apia", "Suva", "Port Vila"));
			listaDePreguntas.add(new PreguntaCapital("¿Tuvalu?", "Funafuti", "Tarawa Sur", "Nauru", "Palikir"));
			listaDePreguntas.add(new PreguntaCapital("¿Vanuatu?", "Port Vila", "Suva", "Nukualofa", "Apia"));
			
			//ASIA
			
			listaDePreguntas.add(new PreguntaCapital("¿Afganistán?", "Kabul", "Kandahar", "Islamabad", "Teherán"));
			listaDePreguntas.add(new PreguntaCapital("¿Arabia Saudita?", "Riad", "Jeddah", "Doha", "Abu Dabi"));
			listaDePreguntas.add(new PreguntaCapital("¿Armenia?", "Ereván", "Tbilisi", "Bakú", "Ankara"));
			listaDePreguntas.add(new PreguntaCapital("¿Azerbaiyán?", "Bakú", "Ereván", "Teherán", "Ankara"));
			listaDePreguntas.add(new PreguntaCapital("¿Bangladés?", "Daca", "Dhaka", "Chittagong", "Kolkata"));
			listaDePreguntas.add(new PreguntaCapital("¿Baréin?", "Manama", "Doha", "Riad", "Abu Dabi"));
			listaDePreguntas.add(new PreguntaCapital("¿Birmania (Myanmar)?", "Naypyidaw", "Yangón", "Mandalay", "Bangkok"));
			listaDePreguntas.add(new PreguntaCapital("¿Brunéi?", "Bandar Seri Begawan", "Kuala Lumpur", "Yakarta", "Bangkok"));
			listaDePreguntas.add(new PreguntaCapital("¿Bután?", "Timbu", "Kathmandú", "Dhaka", "Thimphu"));
			listaDePreguntas.add(new PreguntaCapital("¿CCamboya?", "Nom Pen", "Phnom Penh", "Bangkok", "Vientián"));
			listaDePreguntas.add(new PreguntaCapital("¿Catar?", "Doha", "Riad", "Manama", "Kuwait"));
			listaDePreguntas.add(new PreguntaCapital("¿China?", "Pekín", "Shanghái", "Hong Kong", "Tokio"));
			listaDePreguntas.add(new PreguntaCapital("¿Chipre?", "Nicosia", "Atenas", "Estambul", "Beirut"));
			listaDePreguntas.add(new PreguntaCapital("¿Corea del Norte?", "Pyongyang", "Seúl", "Busan", "Tokio"));
			listaDePreguntas.add(new PreguntaCapital("¿Corea del Sur?", "Seúl", "Pyongyang", "Busan", "Tokio"));
			listaDePreguntas.add(new PreguntaCapital("¿Emiratos Árabes Unidos?", "Abu Dabi", "Dubái", "Riad", "Doha"));
			listaDePreguntas.add(new PreguntaCapital("¿Filipinas?", "Manila", "Ciudad de Manila", "Cebú", "Davao"));
			listaDePreguntas.add(new PreguntaCapital("¿Georgia?", "Tiflis", "Ereván", "Bakú", "Ankara"));
			listaDePreguntas.add(new PreguntaCapital("¿India?", "Nueva Delhi", "Bombay", "Calcuta", "Bangalore"));
			listaDePreguntas.add(new PreguntaCapital("¿Indonesia?", "Yakarta", "Bandung", "Surabaya", "Kuala Lumpur"));
			listaDePreguntas.add(new PreguntaCapital("¿Irak?", "Bagdad", "Baghdad", "Basora", "Erbil"));
			listaDePreguntas.add(new PreguntaCapital("¿Irán?", "Teherán", "Bagdad", "Kuwait", "Doha"));
			listaDePreguntas.add(new PreguntaCapital("¿Israel?", "Jerusalén", "Tel Aviv", "Haifa", "El Cairo"));
			listaDePreguntas.add(new PreguntaCapital("¿Japón?", "Tokio", "Kioto", "Osaka", "Seúl"));
			listaDePreguntas.add(new PreguntaCapital("¿Jordania?", "Amán", "El Cairo", "Riad", "Doha"));
			listaDePreguntas.add(new PreguntaCapital("¿Kazajistán?", "Astana", "Almaty", "Nur-Sultán", "Biskek"));
			listaDePreguntas.add(new PreguntaCapital("¿Kirguistán?", "Biskek", "Almaty", "Astana", "Nur-Sultán"));
			listaDePreguntas.add(new PreguntaCapital("¿Kuwait?", "Kuwait", "Doha", "Manama", "Riad"));
			listaDePreguntas.add(new PreguntaCapital("¿Laos?", "Vientián", "Nom Pen", "Bangkok", "Phnom Penh"));
			listaDePreguntas.add(new PreguntaCapital("¿Líbano?", "Beirut", "Damasco", "El Cairo", "Amán"));
			listaDePreguntas.add(new PreguntaCapital("¿Malasia?", "Kuala Lumpur", "Singapur", "Yakarta", "Bangkok"));
			listaDePreguntas.add(new PreguntaCapital("¿Maldivas?", "Malé", "Mascate", "Colombo", "Thimphu"));
			listaDePreguntas.add(new PreguntaCapital("¿Mongolia?", "Ulán Bator", "Pekín", "Seúl", "Tokio"));
			listaDePreguntas.add(new PreguntaCapital("¿Nepal?", "Katmandú", "Timbu", "Lhasa", "Dhaka"));
			listaDePreguntas.add(new PreguntaCapital("¿Omán?", "Mascate", "Riad", "Doha", "Manama"));
			listaDePreguntas.add(new PreguntaCapital("¿Pakistán?", "Islamabad", "Karachi", "Lahore", "Nueva Delhi"));
			listaDePreguntas.add(new PreguntaCapital("¿Palestina?", "Jerusalén Este", "Gaza", "Amán", "Damasco"));
			listaDePreguntas.add(new PreguntaCapital("¿Filipinas?", "Manila", "Ciudad de Manila", "Cebú", "Davao"));
			listaDePreguntas.add(new PreguntaCapital("¿Rusia?", "Moscú", "San Petersburgo", "Novosibirsk", "Ekaterimburgo"));
			listaDePreguntas.add(new PreguntaCapital("¿Arabia Saudita?", "Riad", "Jeddah", "Doha", "Abu Dabi"));
			listaDePreguntas.add(new PreguntaCapital("¿Singapur?", "Singapur", "Kuala Lumpur", "Yakarta", "Bangkok"));
			listaDePreguntas.add(new PreguntaCapital("¿Siria?", "Damasco", "Beirut", "Amán", "Bagdad"));
			listaDePreguntas.add(new PreguntaCapital("¿Sri Lanka?", "Sri Jayawardenapura Kotte", "Colombo", "Malé", "Mascate"));
			listaDePreguntas.add(new PreguntaCapital("¿Tayikistán?", "Dusambé", "Taskent", "Biskek", "Nur-Sultán"));
			listaDePreguntas.add(new PreguntaCapital("¿Tailandia?", "Bangkok", "Vientián", "Nom Pen", "Hanoi"));
			listaDePreguntas.add(new PreguntaCapital("¿Timor Oriental?", "Dili", "Yakarta", "Darwin", "Kupang"));
			listaDePreguntas.add(new PreguntaCapital("¿Turquía?", "Ankara", "Estambul", "Atenas", "Sofía"));
			listaDePreguntas.add(new PreguntaCapital("¿Turkmenistán?", "Asjabad", "Biskek", "Dusambé", "Taskent"));
			listaDePreguntas.add(new PreguntaCapital("¿Emiratos Árabes Unidos?", "Abu Dabi", "Dubái", "Riad", "Doha"));
			listaDePreguntas.add(new PreguntaCapital("¿Uzbekistán?", "Taskent", "Biskek", "Dusambé", "Nur-Sultán"));
			listaDePreguntas.add(new PreguntaCapital("¿Vietnam?", "Hanói", "Ciudad de Ho Chi Minh", "Nom Pen", "Bangkok"));
			listaDePreguntas.add(new PreguntaCapital("¿Yemen?", "Saná", "Mascate", "Doha", "Riad"));
			listaDePreguntas.add(new PreguntaCapital("¿Yibuti?", "Yibuti", "Hargeisa", "Mogadiscio", "Asmara"));
			
		}
			Collections.shuffle(listaDePreguntas);
	}

	public static List<PreguntaCapital> getListaDePreguntas() {
		return listaDePreguntas;
	}

	public static int getCantidadDePreguntas() {
		return cantidadDePreguntas;
	}

	public static int getCantidadDePreguntasOriginal() {
		return cantidadDePreguntasOriginal;
	}

	public static void setCantidadDePreguntas(int cantidadDePreguntas) {
		Capitales.cantidadDePreguntas = cantidadDePreguntas;
	}

	public static void setCantidadDePreguntasOriginal(int cantidadDePreguntasOriginal) {
		Capitales.cantidadDePreguntasOriginal = cantidadDePreguntasOriginal;
	}
	
	

	
	
	
	
}
