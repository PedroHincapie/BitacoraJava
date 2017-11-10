package co.com.ejercccios.logica;

import java.util.HashMap;

public class EsferasCentralesCodility {
	/*
 A[0].x = 0 A[0].y = 5 A[0].z = 4
 A[1].x = 0 A[1].y = 0 A[1].z = -3
 A[2].x = -2 A[2].y = 1 A[2].z = -6
 A[3].x = 1 A[3].y = -2 A[3].z = 2
 A[4].x = 1 A[4].y = 1 A[4].z = 1
 A[5].x = 4 A[5].y = -4 A[5].z = 3

the function should return 3, because three central spheres are required to
cover these points:
a central sphere of radius sqrt(3) covers point number 4,
a central sphere of radius 3 covers points numbers 1 and
3,
a central sphere of radius sqrt(41) covers points numbers
0, 2 and 5.

It is impossible to cover these points with fewe
	 */

	public static void main(String[] args) {
		int [][]A = {{0,5,4},{0,0,-3},{-2,1,-6},{1,-2,2},{1,1,1},{4,-10000,10000}};
		Double []B = new Double [A.length];
		HashMap<Double,Integer> contenedor = new HashMap<>();
		
		for (int i = 0; i < A.length; i++) {
			Double r = 0.0;
			for (int j = 0; j < A[i].length; j++) {
				r += Math.pow(A[i][j], 2);
			}           
			B[i] = r;
			contenedor.put(B[i], 0);
		}
		
		System.err.println(contenedor.size());
	}
}