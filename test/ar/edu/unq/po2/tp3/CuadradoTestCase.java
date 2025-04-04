package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTestCase {
	Cuadrado cuadrado;
	Punto punto;

	@BeforeEach
	public void setUp() {
		punto = new Punto(2, 2);
		cuadrado = new Cuadrado(5, punto);
	}

	@Test
	void testArea() {
		assertEquals(25, cuadrado.calcularArea(), "Fallo en el cálculo de area");
	}

	@Test
	void testPerimetro() {
		assertEquals(20, cuadrado.calcularPerimetro(), "Fallo en el cálculo de perímetro");
	}

	@Test
	void testOrientacion() {
		assertEquals("Cuadrado", cuadrado.orientacion(), "La orientación no es la esperada");
	}

}