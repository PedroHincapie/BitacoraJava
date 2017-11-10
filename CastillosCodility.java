package co.com.ejercccios.logica;

public class CastillosCodility {

	public static int extremoq(int p, int[]A) {
		int q = p;
		while (q < A.length - 1 && A[q+1] == A[q]) {
			q++;
		}
		return q;
	}

	public static int solution(int []A) {
		int castillos = 0;
		if (A.length > 0) {
			char tipoAnt = '0';
			char tipo = '0';
			int p = 0;
			int q = extremoq(p, A);

			while (q < A.length - 1) {
				tipo = (A[q+1] > A[q]) ? 'C' : 'V';
				if (tipoAnt != tipo) {
					castillos++;
				}
				p = ++q;
				q = extremoq(p, A);
				tipoAnt = tipo;
			}

			castillos++;
		}
		return castillos;
	}

	public static void main(String[] args) {
		int []A = {2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5};
		//		int []A = {-3, -1, -1};
		System.out.println(solution(A));
	}

}
