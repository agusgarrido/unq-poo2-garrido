package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	Rectangulo rectangulo;
	Punto punto;

	@BeforeEach
	public void setUp() {
		punto = new Punto(1, 1);
		rectangulo = new Rectangulo(10, 4, punto);
	}

	@Test
	void testArea() {
		assertEquals(40, rectangulo.calcularArea(), "Fallo en el cálculo de area");
	}

	@Test
	void testPerimetro() {
		assertEquals(28, rectangulo.calcularPerimetro(), "Fallo en el cálculo de perímetro");
	}

	@Test
	void testOrientacion() {
		assertNotEquals("Horizontal", rectangulo.orientacion(), "La orientación no es la esperada");
	}

}
