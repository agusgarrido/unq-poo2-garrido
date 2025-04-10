package ar.edu.unq.po2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {
	Trabajador ricardo;
	Ingreso venta;
	Ingreso reparacion;
	IngresoPorHorasExtras finDeSemana;

	@BeforeEach
	void setUp() {
		ricardo = new Trabajador();
		venta = new Ingreso(4, "Venta - SAMSUNG A15", 300000.0);
		reparacion = new Ingreso(5, "Reparación pin de carga - MOTO G54", 20000.0);
		finDeSemana = new IngresoPorHorasExtras(4, "Atención en local - Viernes Semana Santa", 80000.00, 4);
		ricardo.agregarIngreso(finDeSemana);
		ricardo.agregarIngreso(venta);
	}

	@Test
	void testMontoImponible() {
		assertEquals(300000, ricardo.getMontoImponible());
		ricardo.agregarIngreso(reparacion);
		assertEquals(320000, ricardo.getMontoImponible());
	}

	@Test
	void getImpuestoAPagar() {
		assertNotEquals(64000.0, ricardo.getImpuestoAPagar()); // Porque el fin de semana es monto no imponible
		assertEquals(60000.0, ricardo.getImpuestoAPagar());
	}

	@Test
	void testTotalPercibido() {
		assertEquals(380000, ricardo.getTotalPercibido());
		ricardo.agregarIngreso(reparacion);
		assertEquals(400000, ricardo.getTotalPercibido());
	}

}
