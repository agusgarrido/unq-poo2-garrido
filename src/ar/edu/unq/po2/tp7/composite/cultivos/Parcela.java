package ar.edu.unq.po2.tp7.composite.cultivos;

import java.util.ArrayList;
import java.util.List;

public class Parcela implements Cultivo{
	private List<Cultivo> cultivos;

	public Parcela() {
		this.cultivos = new ArrayList<Cultivo>();
	}

	public int getValor() {
		return cultivos.stream().mapToInt(cultivo -> cultivo.getValor()).sum();
	}

	public void agregarCultivo(Cultivo cultivo) {
		try {
			this.validarSiSePuedeCultivar();
			cultivos.add(cultivo);
		} catch (Exception ex) {
			throw ex;
		}

	}

	private void validarSiSePuedeCultivar() {
		if (cultivos.size() >= 4) {
			throw new UnsupportedOperationException("No se puede agregar más cultivos en esta parcela.");
		}
	}
}
