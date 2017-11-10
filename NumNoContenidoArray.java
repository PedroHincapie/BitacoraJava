package co.com.ejercccios.logica;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class NumNoContenidoArray {

	public static void main(String[] args) {

		//		int A[] = {1,2,3,6,7,8,56,9,86};
		int A[] = {1, 3, 6, 4, 1, 2};
		//		int A[] = {1,2,3};
		//				int A[] = {-1,-3};

		Map<Integer, Integer> contenedor = new LinkedHashMap<Integer, Integer>();

		int cantidad = A.length;


		for (int i = 0; i < cantidad; i++) {
			contenedor.put(i+1, i+1);
		}

		//		for(Map.Entry m:contenedor.entrySet()){
		//			System.err.println("Dato " + m.getKey());
		//		}

		for (int i = 0; i < cantidad ; i++) {
			if(contenedor.containsKey(A[i])){
				contenedor.remove(A[i]); 
			}

		}

		if(contenedor.size() == 0){
			System.err.println(cantidad+1);

		}else{
			Iterator<Integer> numeroContenidos = contenedor.keySet().iterator();

			if(numeroContenidos.hasNext()){

				System.err.println((int)numeroContenidos.next());
			}
		}

		System.err.println(1);
	}
}
