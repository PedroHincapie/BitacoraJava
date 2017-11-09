package co.com.ejercccios.logica;

public class ConstructorTagHtml {

	public static void main(String[] args) {
		String palabra = "######## Pedro";
		int cant = palabra.length();

		int contador = 0;
		for (int i = 0; i < cant; i++) {
			char da = '#';
			if(palabra.charAt(i) == da){
				contador++;
			}
		}

		String resultado = palabra.substring(palabra.indexOf(" "), cant);

		StringBuilder dato = new StringBuilder("<h");
		dato.append(contador).append(">").append(resultado);
		dato.append("</h").append(contador).append(">");


		System.err.println(dato);

	}
}