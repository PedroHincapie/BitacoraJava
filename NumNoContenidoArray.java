package co.com.ejercccios.logica;

import java.util.HashMap;

public class NumNoContenidoArray {

	public static void main(String[] args) {

		//		int A[] = {1,2,3,6,7,8,56,9,86};
		//						int A[] = {1,3,6,4,1,2};
		//		int A[] = {1,2,3};
		int A[] = {-1,-3};

		HashMap<Integer, Integer> contenedor = new HashMap<>();
		int dato = 0;

		int cantidad = A.length;


		for (int i = 0; i < cantidad; i++) {
			contenedor.put(A[i],A[i]);
		}

		//				for(Map.Entry m:contenedor.entrySet()){
		//					System.err.println("Dato " + m.getValue());
		//				}

		for (int i = 0; i < cantidad ; i++) {
			if(!contenedor.containsValue(i)){
				dato = i;
			}else{
				dato = contenedor.get(i+1) + 1;
			}

		}

		System.err.println(dato);
	}
}
