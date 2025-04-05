package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	EquipoDeTrabajo equipoDeTrabajo;
	Persona2 persona1;
	Persona2 persona2;
	Persona2 persona3;
	Persona2 persona4;
	Persona2 persona5;

	@BeforeEach
	public void setUp() {
		equipoDeTrabajo = new EquipoDeTrabajo("Equipo");
		persona1 = new Persona2("Ana", "López", 25);
		persona2 = new Persona2("Carlos", "Martínez", 30);
		persona3 = new Persona2("Lucía", "Gómez", 28);
		persona4 = new Persona2("Juan", "Pérez", 35);
		persona5 = new Persona2("Sofía", "Ramírez", 32);
		equipoDeTrabajo.contratar(persona1);
		equipoDeTrabajo.contratar(persona2);
		equipoDeTrabajo.contratar(persona3);
		equipoDeTrabajo.contratar(persona4);
		equipoDeTrabajo.contratar(persona5);
	}

	@Test
	void testNombre() {
		assertEquals("Equipo", equipoDeTrabajo.getNombre(), "Fallo al obtener el nombre");
	}

	@Test
	
	/* PREGUNTA: ¿Conviene resolver el punto 5 directamente en este test o sería mejor crear una clase con un método main para separar los ambientes de prueba y ejecución? */
	void testPromedioEdades() {
		assertEquals(30, equipoDeTrabajo.promedioEdad(), "Fallo en el cálculo de promedio");
	}

	@Test
	void testCantidadContratados() {
		assertEquals(5, equipoDeTrabajo.getIntegrantes().size() , "La cantidad de integrantes no es la esperada.");
	}

}
