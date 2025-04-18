package ar.edu.unq.po2.tp5.mercadocentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.mercadocentral.Agencia.*;
import ar.edu.unq.po2.tp5.mercadocentral.Cargo.*;

class FacturaTestCase {
	AgenciaRecaudadora arba;
	AgenciaRecaudadora aysa;
	FacturaImpuesto automotor;
	FacturaServicio agua;

	@BeforeEach
	public void setUp() {
		arba = new AgenciaRecaudadora();
		aysa = new AgenciaRecaudadora();
		automotor = new FacturaImpuesto(arba, 80000);
		agua = new FacturaServicio(aysa, 10, 1000);
	}
	
	@Test
	void testValores() {
		assertEquals(10000, agua.getValor());
		assertEquals(80000, automotor.getValor());
	}
}
