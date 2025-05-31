package ar.edu.unq.po2.tp11.observer.encuentrosdeportivos;

import java.util.ArrayList;
import java.util.List;

public class Partido {
	private String resultado;
	private List<String> contrincantes;
	private String deporte;
	
	public Partido(String resultado, List<String> contrincantes, String deporte) {
		this.resultado = resultado;
		this.contrincantes = new ArrayList<String>(contrincantes);
		this.deporte = deporte;
	}
	
	public String getDeporte() {
		return this.deporte;
	}
	
	public List<String> getContrincantes(){
		return this.contrincantes;
	}
	
	public String getResultado(){
		return this.resultado;
	}
}
