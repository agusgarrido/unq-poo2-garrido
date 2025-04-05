package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
	private List<Persona2> integrantes = new ArrayList<Persona2>();
	
	public EquipoDeTrabajo (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public List<Persona2> getIntegrantes() {
		return integrantes;
	}
	
	public void contratar(Persona2 persona) {
		integrantes.add(persona);
	}
	
	public double promedioEdad() {
		return integrantes.stream().mapToDouble(Persona2::getEdad).average().orElse(0);
	}
	
}
