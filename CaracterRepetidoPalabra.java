package co.com.ejercccios.logica;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CaracterRepetidoPalabra {
	public static void main(String[] args) {
		//	    String expected = "a";
		//	    String actual = Challenge.firstNonRepeatingLetter("a");
		//	    assertEquals(expected, actual);
		//	    String expected1 = "t";
		//	    String actual1 = Challenge.firstNonRepeatingLetter("stress");
		//	    assertEquals(expected1, actual1);
		//	    String expected2 = "e";
		//	    String actual2 = Challenge.firstNonRepeatingLetter("moonmen");
		//	    assertEquals(expected2, actual2);

		String palabra = "moonmen";
		HashMap<Character, Integer> contador = new LinkedHashMap<>();

		for (int x=0;x<palabra.length();x++){
			int cont = 0;
			for (int i = 0; i < palabra.length(); i++) {
				if(palabra.charAt(i) == palabra.charAt(x)){
					cont++;
					contador.put(palabra.charAt(i), cont);
				}
			}

		}
		for(Map.Entry m:contador.entrySet()){
			if("1".equals(m.getValue().toString())){
				System.err.println("Dato " + m.getKey());
				break;
			}
		}

	}
}