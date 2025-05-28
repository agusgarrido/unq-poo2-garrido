package ar.edu.unq.po2.tp9.template.elementossimilares;

public class PropiedadEnComun {

	public boolean esSimilar(WikipediaPage page, WikipediaPage otherPage) {
		return page.getInfobox().keySet().stream().anyMatch(key -> otherPage.getInfobox().containsKey(key));
	}
}
