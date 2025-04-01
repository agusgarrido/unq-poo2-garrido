package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	private List<Integer> numeros = new ArrayList<>();
	
	public void agregarNumero(int n) {
		numeros.add(n);
	}
	
	public List<Integer> lista(){
		return numeros;
	}
	
	public int contarPares() {
		return (int) numeros.stream().filter(this::esPar).count();
		// Casteo de long a int
	}
	
	public int contarImpares() {
		return (int) numeros.stream().filter(n -> !esPar(n)).count();
		// Uso de función lambda -> Referencia de métodos no permite negación directa
	}
	
	public int cantidadDeMultiplosDe(int m) {
		return (int) numeros.stream().filter(n -> esMultiploDe(n, m)).count();
	}
	
	public boolean esPar(int n) {
		return n % 2 == 0;
	}
	
	private boolean esMultiploDe(int n, int m) {
		return n % m == 0;
	}
	
}