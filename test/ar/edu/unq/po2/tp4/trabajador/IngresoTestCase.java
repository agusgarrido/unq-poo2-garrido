package ar.edu.unq.po2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTestCase {
	Ingreso venta;
	Ingreso reparacion;

	@BeforeEach
	public void setUp() {
		venta = new Ingreso(4, "Venta - SAMSUNG A15", 300000.0);
		reparacion = new Ingreso(5, "Reparación pin de carga - MOTO G54", 20000.0);
	}

	@Test
	void testMesDePercepcion() {
		assertEquals(4, venta.getMesDePercepcion());
	}

	@Test
	void testMonto() {
		assertEquals(20000.0, reparacion.getMonto());
	}

	@Test
	void testMontoImponible() {
		assertEquals(reparacion.getMontoImponible(), reparacion.getMonto());
	}

}
