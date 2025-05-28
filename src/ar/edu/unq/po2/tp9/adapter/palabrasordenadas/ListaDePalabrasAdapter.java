package ar.edu.unq.po2.tp9.adapter.palabrasordenadas;

import javax.swing.DefaultListModel;

public class ListaDePalabrasAdapter extends DefaultListModel<String> {

	private final ListaDePalabrasOrdenadas listaDePalabrasOrdenadas;

	public ListaDePalabrasAdapter() {
		this.listaDePalabrasOrdenadas = new ListaDePalabrasOrdenadas();
	}

	public void addElement(String palabra) {
		listaDePalabrasOrdenadas.agregarPalabra(palabra);
	}

	public String getElementAt(int index) {
		return listaDePalabrasOrdenadas.getPalabraDePosicion(index);
	}

	public int getSize() {
		return listaDePalabrasOrdenadas.cantidadDePalabras();
	}
}