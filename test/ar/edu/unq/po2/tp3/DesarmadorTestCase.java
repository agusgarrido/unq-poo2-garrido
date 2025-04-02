package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesarmadorTestCase {
	Desarmador desarmador;
	List<Integer> listado;

	@BeforeEach
	public void setUp() {
		desarmador = new Desarmador();
		listado = new ArrayList<Integer>();
	}

	@Test
	void ConMaximoNumeroDePares() {
		listado.add(2121);
		listado.add(43517);
		listado.add(81824);
		assertEquals(desarmador.numeroConMasPares(listado), 81824);
	}

}
