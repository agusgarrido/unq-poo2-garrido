package ar.edu.unq.po2.tp9.template.elementossimilares;

public class MismaLetraInicial extends Filtro{

	public boolean esSimilar(WikipediaPage page, WikipediaPage otherPage) {
		return obtenerPrimerCaracter(page) == obtenerPrimerCaracter(otherPage);
	}
	
	private char obtenerPrimerCaracter(WikipediaPage page) {
		return Character.toLowerCase(page.getTitle().charAt(0));
	}
}
