package ar.edu.unq.po2.tp9.template.elementossimilares;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
	
	public List<WikipediaPage> getSimilarPages(WikipediaPage page,
					List<WikipediaPage> wikipedia){
		
		List<WikipediaPage> similares = new ArrayList<WikipediaPage>();
		
		wikipedia.forEach(otherPage -> {
			if(esSimilar(page, otherPage)) {
				similares.add(otherPage);
			}
		});
		
		return similares;
	};
	
	public abstract boolean esSimilar(WikipediaPage page, WikipediaPage otherPage);
	
}
