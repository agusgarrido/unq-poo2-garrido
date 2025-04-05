package ar.edu.unq.po2.tp3;

public class Multiplos {
	/* NOTA: La primer solución la plantee al revés, pero siendo necesario obtener
	 * el número MÁS alto, es mejor recorrer hacia atrás la lista de 0 a 1000. */
	
	public int multiploMasAlto(int x, int y) {
		for (int numero = 1000; numero > 0; numero --) {
			if (esMultiploDe(numero, x) && esMultiploDe(numero, y)) {
				return numero;
			}	
		}
		return -1;
	}
	
	private boolean esMultiploDe(int n, int m) {
		return (n % m) == 0;
	}
}
