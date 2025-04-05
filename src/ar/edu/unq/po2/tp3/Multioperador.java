package ar.edu.unq.po2.tp3;

import java.util.List;

public class Multioperador {
	
	
	public int sumar(List<Integer> numeros) {
		return (int) numeros.stream().mapToInt(Integer::intValue).sum();
	}
	
	public int multiplicar(List<Integer> numeros) {
		return (int) numeros.stream().reduce(1, (n1, n2) -> n1 * n2);
	}
	
	public int restar(List<Integer> numeros) {
		return (int) numeros.stream().reduce((n1, n2) -> n1 - n2).orElse(0);
	}
	
	/* NOTA: El reduce, si no hay un valor inicial, devuelve Optional<Integer> -> No se puede casteara a int.
	 * Necesito -> Asignar un valor predeterminado en caso de lista vacía -> orElse(0), por ejemplo.*/
}
