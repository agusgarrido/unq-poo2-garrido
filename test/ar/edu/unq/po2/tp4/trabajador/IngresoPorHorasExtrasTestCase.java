package ar.edu.unq.po2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class IngresoPorHorasExtrasTestCase {
	IngresoPorHorasExtras finDeSemana;

	@BeforeEach
	public void setUp() {
		finDeSemana = new IngresoPorHorasExtras(4, "Atención en local - Viernes Semana Santa", 80000.00, 4);
	}

	@Test
	void testMonto() {
		assertEquals(80000.0, finDeSemana.getMonto());
	}

	@Test
	void testMesDePercepcion() {
		assertNotEquals(5, finDeSemana.getMesDePercepcion());
	}

	@Test
	void testCantidadHorasExtras() {
		assertEquals(4, finDeSemana.getCantidadHorasExtras());
	}

	@Test
	void testMontoImponible() {
		assertNotEquals(finDeSemana.getMonto(), finDeSemana.getMontoImponible());
		assertEquals(0.0, finDeSemana.getMontoImponible());
	}

}
