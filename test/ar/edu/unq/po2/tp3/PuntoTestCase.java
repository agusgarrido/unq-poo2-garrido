package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PuntoTestCase {
	Punto punto;
	Punto puntoEnOrigen;

	@BeforeEach
	public void setUp() {
		punto = new Punto(1, 1);
		puntoEnOrigen = new Punto();
	}

	@Test
	void testPuntoEnOrigen() {
		assertEquals(0, puntoEnOrigen.getX());
		assertEquals(0, puntoEnOrigen.getY());
	}
	
	@Test
	void testMoverPunto() {
		puntoEnOrigen.moverPunto(2, 2);
		assertEquals(2, puntoEnOrigen.getX());
		assertEquals(2, puntoEnOrigen.getY());
	}
	
	@Test
	void testSumarPunto() {
		puntoEnOrigen.moverPunto(2, 2);
		Punto nuevoPunto = punto.sumarPunto(puntoEnOrigen);
		assertEquals(3, nuevoPunto.getX());
		assertEquals(3, nuevoPunto.getY());
	}

}