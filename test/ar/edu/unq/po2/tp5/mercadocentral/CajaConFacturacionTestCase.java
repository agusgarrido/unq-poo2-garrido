package ar.edu.unq.po2.tp5.mercadocentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.mercadocentral.Agencia.AgenciaRecaudadora;
import ar.edu.unq.po2.tp5.mercadocentral.Cargo.FacturaImpuesto;
import ar.edu.unq.po2.tp5.mercadocentral.Cargo.FacturaServicio;
import ar.edu.unq.po2.tp5.mercadocentral.Cargo.ProductoCooperativa;
import ar.edu.unq.po2.tp5.mercadocentral.Cargo.ProductoEmpresaTradicional;

class CajaConFacturacionTestCase {
	AgenciaRecaudadora arba;
	AgenciaRecaudadora aysa;
	FacturaImpuesto automotor;
	FacturaServicio agua;
	Caja supermercado;

	@BeforeEach
	public void setUp() {
		supermercado = new Caja();
		arba = new AgenciaRecaudadora();
		aysa = new AgenciaRecaudadora();
		automotor = new FacturaImpuesto(arba, 80000);
		agua = new FacturaServicio(aysa, 10, 1000);
	}
	
	@Test
	void testFacturacion() {
		supermercado.registrarPago(automotor);
		supermercado.registrarPago(agua);
		assertEquals(1, arba.getFacturado());
		assertEquals(1, aysa.getFacturado());
		supermercado.getMontoTotal();
		assertEquals(90000, supermercado.getMontoTotal());
	}

}
