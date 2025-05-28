package ar.edu.unq.po2.tp9.template.elementossimilares;

public class LinkEnComun extends Filtro{
	
	public boolean esSimilar(WikipediaPage page, WikipediaPage otherPage) {
		return page.getLinks().stream().anyMatch(link -> otherPage.getLinks().contains(link));
	}
}
