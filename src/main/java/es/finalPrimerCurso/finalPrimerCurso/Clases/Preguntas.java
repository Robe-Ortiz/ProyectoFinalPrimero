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
			listaDePreguntas.add(new Pregunta("¿Albania?", "Tirana", "Skopje", "Atenas", "Belgrado"));
			listaDePreguntas.add(new Pregunta("¿Alemania?", "Berlín", "París", "Viena", "Bruselas"));
			listaDePreguntas.add(new Pregunta("¿Andorra?", "Andorra la Vella", "Madrid", "Lisboa", "Roma"));
			listaDePreguntas.add(new Pregunta("¿Armenia?", "Ereván", "Tbilisi", "Bakú", "Teherán"));
			listaDePreguntas.add(new Pregunta("¿Austria?", "Viena", "Berlín", "Praga", "Budapest"));
			listaDePreguntas.add(new Pregunta("¿Azerbaiyán?", "Bakú", "Ereván", "Ankara", "Tbilisi"));
			listaDePreguntas.add(new Pregunta("¿Bélgica?", "Bruselas", "Ámsterdam", "Luxemburgo", "París"));
			listaDePreguntas.add(new Pregunta("¿Bielorrusia?", "Minsk", "Kiev", "Sofía", "Vilna"));
			listaDePreguntas.add(new Pregunta("¿Bosnia y Herzegovina?", "Sarajevo", "Belgrado", "Zagreb", "Podgorica"));
			listaDePreguntas.add(new Pregunta("¿Bulgaria?", "Sofía", "Bucarest", "Belgrado", "Atenas"));
			listaDePreguntas.add(new Pregunta("¿Chipre?", "Nicosia", "Atenas", "Malta", "Estambul"));
			listaDePreguntas.add(new Pregunta("¿Croacia?", "Zagreb", "Budapest", "Liubliana", "Sarajevo"));
			listaDePreguntas.add(new Pregunta("¿Dinamarca?", "Copenhague", "Estocolmo", "Oslo", "Helsinki"));
			listaDePreguntas.add(new Pregunta("¿Eslovaquia?", "Bratislava", "Praga", "Liubliana", "Budapest"));
			listaDePreguntas.add(new Pregunta("¿Eslovenia?", "Liubliana", "Zagreb", "Bratislava", "Belgrado"));
			listaDePreguntas.add(new Pregunta("¿España?", "Madrid", "Barcelona", "Sevilla", "Murcia"));
			listaDePreguntas.add(new Pregunta("¿Estonia?", "Tallin", "Riga", "Vilna", "Helsinki"));
			listaDePreguntas.add(new Pregunta("¿Finlandia?", "Helsinki", "Estocolmo", "Copenhague", "Oslo"));
			listaDePreguntas.add(new Pregunta("¿Francia?", "París", "Londres", "Berlín", "Madrid"));
			listaDePreguntas.add(new Pregunta("¿Georgia?", "Tbilisi", "Ereván", "Bakú", "Ankara"));
			listaDePreguntas.add(new Pregunta("¿Grecia?", "Atenas", "Sofía", "Bucarest", "Skopje"));
			listaDePreguntas.add(new Pregunta("¿Hungría?", "Budapest", "Praga", "Bratislava", "Viena"));
			listaDePreguntas.add(new Pregunta("¿Irlanda?", "Dublín", "Belfast", "Cardiff", "Edimburgo"));
			listaDePreguntas.add(new Pregunta("¿Islandia?", "Reikiavik", "Oslo", "Helsinki", "Copenhague"));
			listaDePreguntas.add(new Pregunta("¿Italia?", "Roma", "Madrid", "Atenas", "Londres"));
			listaDePreguntas.add(new Pregunta("¿Letonia?", "Riga", "Tallin", "Vilna", "Helsinki"));
			listaDePreguntas.add(new Pregunta("¿Liechtenstein?", "Vaduz", "Berna", "Viena", "Zúrich"));
			listaDePreguntas.add(new Pregunta("¿Lituania?", "Vilna", "Riga", "Tallin", "Helsinki"));
			listaDePreguntas.add(new Pregunta("¿Luxemburgo?", "Luxemburgo", "Bruselas", "Ámsterdam", "Berna"));
			listaDePreguntas.add(new Pregunta("¿Malta?", "La Valeta", "Nicosia", "Atenas", "Roma"));
			listaDePreguntas.add(new Pregunta("¿Moldavia?", "Chisináu", "Bucarest", "Kiev", "Sofía"));
			listaDePreguntas.add(new Pregunta("¿Mónaco?", "Mónaco", "París", "Niza", "Berna"));
			listaDePreguntas.add(new Pregunta("¿Montenegro?", "Podgorica", "Belgrado", "Sarajevo", "Tirana"));
			listaDePreguntas.add(new Pregunta("¿Noruega?", "Oslo", "Estocolmo", "Copenhague", "Helsinki"));
			listaDePreguntas.add(new Pregunta("¿Países Bajos?", "Ámsterdam", "Rotterdam", "Bruselas", "Luxemburgo"));
			listaDePreguntas.add(new Pregunta("¿Polonia?", "Varsovia", "Cracovia", "Praga", "Budapest"));
			listaDePreguntas.add(new Pregunta("¿Portugal?", "Lisboa", "Madrid", "Roma", "París"));
			listaDePreguntas.add(new Pregunta("¿Reino Unido?", "Londres", "Dublín", "Edimburgo", "París"));
			listaDePreguntas.add(new Pregunta("¿República Checa?", "Praga", "Bratislava", "Budapest", "Viena"));
			listaDePreguntas.add(new Pregunta("¿Rumania?", "Bucarest", "Sofía", "Belgrado", "Kiev"));
			listaDePreguntas.add(new Pregunta("¿Rusia?", "Moscú", "San Petersburgo", "Kiev", "Berlín"));
			listaDePreguntas.add(new Pregunta("¿San Marino?", "San Marino", "Roma", "Florencia", "Nápoles"));
			listaDePreguntas.add(new Pregunta("¿Serbia?", "Belgrado", "Zagreb", "Sarajevo", "Podgorica"));
			listaDePreguntas.add(new Pregunta("¿Suecia?", "Estocolmo", "Copenhague", "Oslo", "Helsinki"));
			listaDePreguntas.add(new Pregunta("¿Suiza?", "Berna", "Zúrich", "Ginebra", "Viena"));
			listaDePreguntas.add(new Pregunta("¿Turquía?", "Ankara", "Estambul", "Atenas", "Sofía"));
			listaDePreguntas.add(new Pregunta("¿Ucrania?", "Kiev", "Moscú", "Varsovia", "Budapest"));
			listaDePreguntas.add(new Pregunta("¿Vaticano?", "Ciudad del Vaticano", "Roma", "Florencia", "Nápoles"));
			
			//AMERICA
			listaDePreguntas.add(new Pregunta("¿Antigua y Barbuda?", "Saint John's", "Bridgetown", "Castries", "Kingston"));
			listaDePreguntas.add(new Pregunta("¿Argentina?", "Buenos Aires", "Córdoba", "Rosario", "Mendoza"));
			listaDePreguntas.add(new Pregunta("¿Bahamas?", "Nasáu", "Kingston", "Bridgetown", "Belmopán"));
			listaDePreguntas.add(new Pregunta("¿Barbados?", "Bridgetown", "Port of Spain", "Kingston", "Castries"));
			listaDePreguntas.add(new Pregunta("¿Belice?", "Belmopán", "Kingston", "Ciudad de Panamá", "San Salvador"));
			listaDePreguntas.add(new Pregunta("¿Bolivia?", "La Paz / Sucre", "Buenos Aires", "Lima", "Asunción"));
			listaDePreguntas.add(new Pregunta("¿Brasil?", "Brasilia", "Río de Janeiro", "Sao Paulo", "Buenos Aires"));
			listaDePreguntas.add(new Pregunta("¿Canadá?", "Ottawa", "Toronto", "Montreal", "Vancouver"));
			listaDePreguntas.add(new Pregunta("¿Chile?", "Santiago", "Buenos Aires", "Lima", "Bogotá"));
			listaDePreguntas.add(new Pregunta("¿Colombia?", "Bogotá", "Medellín", "Cali", "Barranquilla"));
			listaDePreguntas.add(new Pregunta("¿Costa Rica?", "San José", "Ciudad de Panamá", "Managua", "Tegucigalpa"));
			listaDePreguntas.add(new Pregunta("¿Cuba?", "La Habana", "Santo Domingo", "San Juan", "Kingston"));
			listaDePreguntas.add(new Pregunta("¿Dominica?", "Roseau", "Saint George's", "Castries", "Bridgetown"));
			listaDePreguntas.add(new Pregunta("¿Ecuador?", "Quito", "Lima", "Bogotá", "Caracas"));
			listaDePreguntas.add(new Pregunta("¿El Salvador?", "San Salvador", "Tegucigalpa", "Managua", "Guatemala"));
			listaDePreguntas.add(new Pregunta("¿Estados Unidos?", "Washington D.C.", "Nueva York", "Los Ángeles", "Chicago"));
			listaDePreguntas.add(new Pregunta("¿Granada?", "Saint George's", "Bridgetown", "Kingston", "Castries"));
			listaDePreguntas.add(new Pregunta("¿Guatemala?", "Guatemala", "San Salvador", "Managua", "Tegucigalpa"));
			listaDePreguntas.add(new Pregunta("¿Guyana?", "Georgetown", "Paramaribo", "Castries", "Bridgetown"));
			listaDePreguntas.add(new Pregunta("¿Haití?", "Puerto Príncipe", "Santo Domingo", "San Juan", "La Habana"));
			listaDePreguntas.add(new Pregunta("¿Honduras?", "Tegucigalpa", "San Salvador", "Guatemala", "Managua"));
			listaDePreguntas.add(new Pregunta("¿Jamaica?", "Kingston", "Santo Domingo", "San Juan", "La Habana"));
			listaDePreguntas.add(new Pregunta("¿México?", "Ciudad de México", "Guadalajara", "Monterrey", "Puebla"));
			listaDePreguntas.add(new Pregunta("¿Nicaragua?", "Managua", "Tegucigalpa", "San Salvador", "Guatemala"));
			listaDePreguntas.add(new Pregunta("¿Panamá?", "Ciudad de Panamá", "San José", "San Salvador", "Guatemala"));
			listaDePreguntas.add(new Pregunta("¿Paraguay?", "Asunción", "Buenos Aires", "Lima", "Brasilia"));
			listaDePreguntas.add(new Pregunta("¿Perú?", "Lima", "Bogotá", "Santiago", "Quito"));
			listaDePreguntas.add(new Pregunta("¿República Dominicana?", "Santo Domingo", "Puerto Príncipe", "San Juan", "La Habana"));
			listaDePreguntas.add(new Pregunta("¿San Cristóbal y Nieves?", "Basseterre", "Castries", "Kingston", "Bridgetown"));
			listaDePreguntas.add(new Pregunta("¿San Vicente y las Granadinas?", "Kingstown", "Castries", "Bridgetown", "Saint George's"));
			listaDePreguntas.add(new Pregunta("¿Santa Lucía?", "Castries", "Saint George's", "Kingstown", "Bridgetown"));
			listaDePreguntas.add(new Pregunta("¿Surinam?", "Paramaribo", "Georgetown", "Castries", "Bridgetown"));
			listaDePreguntas.add(new Pregunta("¿Trinidad y Tobago?", "Puerto España", "Kingston", "Bridgetown", "Castries"));
			listaDePreguntas.add(new Pregunta("¿Uruguay?", "Montevideo", "Buenos Aires", "Asunción", "Lima"));
			listaDePreguntas.add(new Pregunta("¿Venezuela?", "Caracas", "Bogotá", "Lima", "Quito"));
			
			//AFRICA
			listaDePreguntas.add(new Pregunta("¿Angola?", "Luanda", "Maputo", "Pretoria", "Windhoek"));
			listaDePreguntas.add(new Pregunta("¿Argelia?", "Argel", "Casablanca", "Túnez", "Rabat"));
			listaDePreguntas.add(new Pregunta("¿Benín?", "Porto Novo", "Cotonú", "Accra", "Lomé"));
			listaDePreguntas.add(new Pregunta("¿Botsuana?", "Gaborone", "Pretoria", "Harare", "Lusaka"));
			listaDePreguntas.add(new Pregunta("¿Burkina Faso?", "Uagadugú", "Ouagadougou", "Abiyán", "Níger"));
			listaDePreguntas.add(new Pregunta("¿Burundi?", "Buyumbura", "Kigali", "Gitega", "Kampala"));
			listaDePreguntas.add(new Pregunta("¿Cabo Verde?", "Praia", "Dakar", "Banjul", "Conakry"));
			listaDePreguntas.add(new Pregunta("¿Camerún?", "Yaundé", "Duala", "Libreville", "Brazzaville"));
			listaDePreguntas.add(new Pregunta("¿Chad?", "Yamena", "Niamey", "Bangui", "Ndjamena"));
			listaDePreguntas.add(new Pregunta("¿Comoras?", "Moroni", "Victoria", "Mamoudzou", "Dzaoudzi"));
			listaDePreguntas.add(new Pregunta("¿R. del Congo?", "Brazzaville", "Kinshasa", "Yaundé", "Bangui"));
			listaDePreguntas.add(new Pregunta("¿R. Democrática del Congo?", "Kinshasa", "Brazzaville", "Luanda", "Libreville"));
			listaDePreguntas.add(new Pregunta("¿Costa de Marfil?", "Yamoussoukro", "Abiyán", "Accra", "Lomé"));
			listaDePreguntas.add(new Pregunta("¿Yibuti?", "Yibuti", "Hargeisa", "Mogadiscio", "Asmara"));
			listaDePreguntas.add(new Pregunta("¿Egipto?", "El Cairo", "Alejandría", "Jartum", "Trípoli"));
			listaDePreguntas.add(new Pregunta("¿Guinea Ecuatorial?", "Malabo", "Bata", "Libreville", "Yaundé"));
			listaDePreguntas.add(new Pregunta("¿Eritrea?", "Asmara", "Yibuti", "Jartum", "Mogadiscio"));
			listaDePreguntas.add(new Pregunta("¿Eswatini?", "Mbabane", "Lobamba", "Manzini", "Gaborone"));
			listaDePreguntas.add(new Pregunta("¿Etiopía?", "Addis Abeba", "Nairobi", "Kigali", "Kampala"));
			listaDePreguntas.add(new Pregunta("¿Gabón?", "Libreville", "Brazzaville", "Malabo", "Yaundé"));
			listaDePreguntas.add(new Pregunta("¿Gambia?", "Banjul", "Dakar", "Conakry", "Monrovia"));
			listaDePreguntas.add(new Pregunta("¿Ghana?", "Accra", "Lomé", "Ouagadougou", "Abiyán"));
			listaDePreguntas.add(new Pregunta("¿Guinea?", "Conakry", "Banjul", "Monrovia", "Freetown"));
			listaDePreguntas.add(new Pregunta("¿Guinea-Bisáu?", "Bisáu", "Conakry", "Banjul", "Dakar"));
			listaDePreguntas.add(new Pregunta("¿Kenia?", "Nairobi", "Kampala", "Kigali", "Addis Abeba"));
			listaDePreguntas.add(new Pregunta("¿Lesoto?", "Maseru", "Mbabane", "Lobamba", "Manzini"));
			listaDePreguntas.add(new Pregunta("¿Liberia?", "Monrovia", "Freetown", "Conakry", "Banjul"));
			listaDePreguntas.add(new Pregunta("¿Libia?", "Trípoli", "El Cairo", "Argel", "Jartum"));
			listaDePreguntas.add(new Pregunta("¿Madagascar?", "Antananarivo", "Maputo", "Antanamarivo", "Moroni"));
			listaDePreguntas.add(new Pregunta("¿Malaui?", "Lilongüe", "Lusaka", "Harare", "Gaborone"));
			listaDePreguntas.add(new Pregunta("¿Mali?", "Bamako", "Níger", "N'Djamena", "Burkina Faso"));
			listaDePreguntas.add(new Pregunta("¿Mauritania?", "Nuakchot", "Bamako", "Nuacchiot", "Rabat"));
			listaDePreguntas.add(new Pregunta("¿Mauricio?", "Port Louis", "Saint-Denis", "Victoria", "Porto Novo"));
			listaDePreguntas.add(new Pregunta("¿Marruecos?", "Rabat", "Argel", "Casablanca", "Túnez"));
			listaDePreguntas.add(new Pregunta("¿Mozambique?", "Maputo", "Luanda", "Pretoria", "Lusaka"));
			listaDePreguntas.add(new Pregunta("¿Namibia?", "Windhoek", "Gaborone", "Pretoria", "Lusaka"));
			listaDePreguntas.add(new Pregunta("¿Níger?", "Niamey", "Bamako", "Uagadugú", "Yamena"));
			listaDePreguntas.add(new Pregunta("¿Nigeria?", "Abuya", "Lagos", "Kano", "Ibadán"));
			listaDePreguntas.add(new Pregunta("¿Ruanda?", "Kigali", "Kampala", "Nairobi", "Bujumbura"));
			listaDePreguntas.add(new Pregunta("¿Santo Tomé y Príncipe?", "Santo Tomé", "Malabo", "Luanda", "Libreville"));
			listaDePreguntas.add(new Pregunta("¿Senegal?", "Dakar", "Banjul", "Conakry", "Freetown"));
			listaDePreguntas.add(new Pregunta("¿Seychelles?", "Victoria", "Port Louis", "Porto Novo", "Moroni"));
			listaDePreguntas.add(new Pregunta("¿Sierra Leona?", "Freetown", "Monrovia", "Conakry", "Banjul"));
			listaDePreguntas.add(new Pregunta("¿Somalia?", "Mogadiscio", "Hargeisa", "Yibuti", "Asmara"));
			listaDePreguntas.add(new Pregunta("¿Sudáfrica?", "Pretoria / Ciudad del Cabo", "Johannesburgo", "Bloemfontein", "Windhoek"));
			listaDePreguntas.add(new Pregunta("¿Sudán del Sur?", "Yuba", "Jartum", "Kampala", "Nairobi"));
			listaDePreguntas.add(new Pregunta("¿Sudán?", "Jartum", "El Cairo", "Trípoli", "Yuba"));
			listaDePreguntas.add(new Pregunta("¿Tanzania?", "Dodoma", "Dar es Salaam", "Kampala", "Nairobi"));
			listaDePreguntas.add(new Pregunta("¿Togo?", "Lomé", "Accra", "Abiyán", "Uagadugú"));
			listaDePreguntas.add(new Pregunta("¿Túnez?", "Túnez", "Argel", "Rabat", "Casablanca"));
			listaDePreguntas.add(new Pregunta("¿Uganda?", "Kampala", "Nairobi", "Kigali", "Juba"));
			listaDePreguntas.add(new Pregunta("¿Zambia?", "Lusaka", "Harare", "Gaborone", "Pretoria"));
			listaDePreguntas.add(new Pregunta("¿Zimbabue?", "Harare", "Lusaka", "Gaborone", "Pretoria"));
			
			//OCEANÍA
			listaDePreguntas.add(new Pregunta("¿Australia?", "Canberra", "Sídney", "Melbourne", "Brisbane"));
			listaDePreguntas.add(new Pregunta("¿Fiyi?", "Suva", "Nadi", "Apia", "Wellington"));
			listaDePreguntas.add(new Pregunta("¿Kiribati?", "Tarawa Sur", "Nauru", "Majuro", "Funafuti"));
			listaDePreguntas.add(new Pregunta("¿Islas Marshall?", "Majuro", "Nauru", "Tarawa Sur", "Palikir"));
			listaDePreguntas.add(new Pregunta("¿Micronesia?", "Palikir", "Majuro", "Nauru", "Yaren"));
			listaDePreguntas.add(new Pregunta("¿Nauru?", "Yaren", "Palikir", "Majuro", "Tarawa Sur"));
			listaDePreguntas.add(new Pregunta("¿Nueva Zelanda?", "Wellington", "Auckland", "Sídney", "Canberra"));
			listaDePreguntas.add(new Pregunta("¿Palaos?", "Ngerulmud", "Melekeok", "Koror", "Majuro"));
			listaDePreguntas.add(new Pregunta("¿Papúa Nueva Guinea?", "Puerto Moresby", "Honiara", "Port Vila", "Dili"));
			listaDePreguntas.add(new Pregunta("¿Islas Salomón?", "Honiara", "Puerto Moresby", "Port Vila", "Suva"));
			listaDePreguntas.add(new Pregunta("¿Tonga?", "Nukualofa", "Apia", "Suva", "Port Vila"));
			listaDePreguntas.add(new Pregunta("¿Tuvalu?", "Funafuti", "Tarawa Sur", "Nauru", "Palikir"));
			listaDePreguntas.add(new Pregunta("¿Vanuatu?", "Port Vila", "Suva", "Nukualofa", "Apia"));
			
			//ASIA
			
			listaDePreguntas.add(new Pregunta("¿Afganistán?", "Kabul", "Kandahar", "Islamabad", "Teherán"));
			listaDePreguntas.add(new Pregunta("¿Arabia Saudita?", "Riad", "Jeddah", "Doha", "Abu Dabi"));
			listaDePreguntas.add(new Pregunta("¿Armenia?", "Ereván", "Tbilisi", "Bakú", "Ankara"));
			listaDePreguntas.add(new Pregunta("¿Azerbaiyán?", "Bakú", "Ereván", "Teherán", "Ankara"));
			listaDePreguntas.add(new Pregunta("¿Bangladés?", "Daca", "Dhaka", "Chittagong", "Kolkata"));
			listaDePreguntas.add(new Pregunta("¿Baréin?", "Manama", "Doha", "Riad", "Abu Dabi"));
			listaDePreguntas.add(new Pregunta("¿Birmania (Myanmar)?", "Naypyidaw", "Yangón", "Mandalay", "Bangkok"));
			listaDePreguntas.add(new Pregunta("¿Brunéi?", "Bandar Seri Begawan", "Kuala Lumpur", "Yakarta", "Bangkok"));
			listaDePreguntas.add(new Pregunta("¿Bután?", "Timbu", "Kathmandú", "Dhaka", "Thimphu"));
			listaDePreguntas.add(new Pregunta("¿CCamboya?", "Nom Pen", "Phnom Penh", "Bangkok", "Vientián"));
			listaDePreguntas.add(new Pregunta("¿Catar?", "Doha", "Riad", "Manama", "Kuwait"));
			listaDePreguntas.add(new Pregunta("¿China?", "Pekín", "Shanghái", "Hong Kong", "Tokio"));
			listaDePreguntas.add(new Pregunta("¿Chipre?", "Nicosia", "Atenas", "Estambul", "Beirut"));
			listaDePreguntas.add(new Pregunta("¿Corea del Norte?", "Pyongyang", "Seúl", "Busan", "Tokio"));
			listaDePreguntas.add(new Pregunta("¿Corea del Sur?", "Seúl", "Pyongyang", "Busan", "Tokio"));
			listaDePreguntas.add(new Pregunta("¿Emiratos Árabes Unidos?", "Abu Dabi", "Dubái", "Riad", "Doha"));
			listaDePreguntas.add(new Pregunta("¿Filipinas?", "Manila", "Ciudad de Manila", "Cebú", "Davao"));
			listaDePreguntas.add(new Pregunta("¿Georgia?", "Tiflis", "Ereván", "Bakú", "Ankara"));
			listaDePreguntas.add(new Pregunta("¿India?", "Nueva Delhi", "Bombay", "Calcuta", "Bangalore"));
			listaDePreguntas.add(new Pregunta("¿Indonesia?", "Yakarta", "Bandung", "Surabaya", "Kuala Lumpur"));
			listaDePreguntas.add(new Pregunta("¿Irak?", "Bagdad", "Baghdad", "Basora", "Erbil"));
			listaDePreguntas.add(new Pregunta("¿Irán?", "Teherán", "Bagdad", "Kuwait", "Doha"));
			listaDePreguntas.add(new Pregunta("¿Israel?", "Jerusalén", "Tel Aviv", "Haifa", "El Cairo"));
			listaDePreguntas.add(new Pregunta("¿Japón?", "Tokio", "Kioto", "Osaka", "Seúl"));
			listaDePreguntas.add(new Pregunta("¿Jordania?", "Amán", "El Cairo", "Riad", "Doha"));
			listaDePreguntas.add(new Pregunta("¿Kazajistán?", "Astana", "Almaty", "Nur-Sultán", "Biskek"));
			listaDePreguntas.add(new Pregunta("¿Kirguistán?", "Biskek", "Almaty", "Astana", "Nur-Sultán"));
			listaDePreguntas.add(new Pregunta("¿Kuwait?", "Kuwait", "Doha", "Manama", "Riad"));
			listaDePreguntas.add(new Pregunta("¿Laos?", "Vientián", "Nom Pen", "Bangkok", "Phnom Penh"));
			listaDePreguntas.add(new Pregunta("¿Líbano?", "Beirut", "Damasco", "El Cairo", "Amán"));
			listaDePreguntas.add(new Pregunta("¿Malasia?", "Kuala Lumpur", "Singapur", "Yakarta", "Bangkok"));
			listaDePreguntas.add(new Pregunta("¿Maldivas?", "Malé", "Mascate", "Colombo", "Thimphu"));
			listaDePreguntas.add(new Pregunta("¿Mongolia?", "Ulán Bator", "Pekín", "Seúl", "Tokio"));
			listaDePreguntas.add(new Pregunta("¿Nepal?", "Katmandú", "Timbu", "Lhasa", "Dhaka"));
			listaDePreguntas.add(new Pregunta("¿Omán?", "Mascate", "Riad", "Doha", "Manama"));
			listaDePreguntas.add(new Pregunta("¿Pakistán?", "Islamabad", "Karachi", "Lahore", "Nueva Delhi"));
			listaDePreguntas.add(new Pregunta("¿Palestina?", "Jerusalén Este", "Gaza", "Amán", "Damasco"));
			listaDePreguntas.add(new Pregunta("¿Filipinas?", "Manila", "Ciudad de Manila", "Cebú", "Davao"));
			listaDePreguntas.add(new Pregunta("¿Rusia?", "Moscú", "San Petersburgo", "Novosibirsk", "Ekaterimburgo"));
			listaDePreguntas.add(new Pregunta("¿Arabia Saudita?", "Riad", "Jeddah", "Doha", "Abu Dabi"));
			listaDePreguntas.add(new Pregunta("¿Singapur?", "Singapur", "Kuala Lumpur", "Yakarta", "Bangkok"));
			listaDePreguntas.add(new Pregunta("¿Siria?", "Damasco", "Beirut", "Amán", "Bagdad"));
			listaDePreguntas.add(new Pregunta("¿Sri Lanka?", "Sri Jayawardenapura Kotte", "Colombo", "Malé", "Mascate"));
			listaDePreguntas.add(new Pregunta("¿Tayikistán?", "Dusambé", "Taskent", "Biskek", "Nur-Sultán"));
			listaDePreguntas.add(new Pregunta("¿Tailandia?", "Bangkok", "Vientián", "Nom Pen", "Hanoi"));
			listaDePreguntas.add(new Pregunta("¿Timor Oriental?", "Dili", "Yakarta", "Darwin", "Kupang"));
			listaDePreguntas.add(new Pregunta("¿Turquía?", "Ankara", "Estambul", "Atenas", "Sofía"));
			listaDePreguntas.add(new Pregunta("¿Turkmenistán?", "Asjabad", "Biskek", "Dusambé", "Taskent"));
			listaDePreguntas.add(new Pregunta("¿Emiratos Árabes Unidos?", "Abu Dabi", "Dubái", "Riad", "Doha"));
			listaDePreguntas.add(new Pregunta("¿Uzbekistán?", "Taskent", "Biskek", "Dusambé", "Nur-Sultán"));
			listaDePreguntas.add(new Pregunta("¿Vietnam?", "Hanói", "Ciudad de Ho Chi Minh", "Nom Pen", "Bangkok"));
			listaDePreguntas.add(new Pregunta("¿Yemen?", "Saná", "Mascate", "Doha", "Riad"));
			listaDePreguntas.add(new Pregunta("¿Yibuti?", "Yibuti", "Hargeisa", "Mogadiscio", "Asmara"));
			
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
