package co.com.ejercccios.logica;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class NumNoContenidoArray {
	/*
	 * This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
	 */

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
