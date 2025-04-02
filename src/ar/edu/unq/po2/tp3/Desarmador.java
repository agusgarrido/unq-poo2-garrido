package ar.edu.unq.po2.tp3;

import java.util.List;

public class Desarmador {
	public int numeroConMasPares(List<Integer> lista) {
		return (int) lista.stream()
				.max((n, m) -> Integer.compare(cantidadDePares(n), cantidadDePares(m)))
				.orElse(0);
	}
	
	private int cantidadDePares(int numero) {
		int paresRecorridos = 0;
		while (numero > 0) {
			paresRecorridos = paresRecorridos + unoSiEsPar(numero);
			numero = numero / 10;
		}
		return paresRecorridos;
	}
	
	private int unoSiEsPar(int numero) {
		return esPar(numero) ? 1 : 0;
	}
	
	private boolean esPar(int numero) {
		return numero % 2 == 0;
	}
	
	/* Prueba de recursividad*/
	private int cantidadDeParesRecursiva(int numero) {
		if (numero == 0) return 0;
		return (unoSiEsPar(numero % 10) + cantidadDeParesRecursiva(numero / 10));
	}
	
}
