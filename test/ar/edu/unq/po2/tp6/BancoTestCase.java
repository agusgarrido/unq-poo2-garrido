package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.mercadocentral.Cargo.ProductoCooperativa;
import ar.edu.unq.po2.tp5.mercadocentral.Cargo.ProductoEmpresaTradicional;

class BancoTestCase {
	Banco banco;
	SolicitudCreditoHipotecario ch1;
	SolicitudCreditoHipotecario ch2;
	SolicitudCreditoPersonal cp1;
	SolicitudCreditoPersonal cp2;
	Cliente cliente1;
	Cliente cliente2;
	Cliente cliente3;
	Propiedad propiedadGarantiaInsuficiente;
	Propiedad propiedadValida;

	@BeforeEach
	public void setUp() {
		banco = new Banco();
		cliente1 = new Cliente("Gustavo", "Ricanti", "Calle Falsa 1234", 62, 2000000);
		cliente2 = new Cliente("Valeria", "Álvarez", "Av. Siempreviva 742", 35, 1500000);
		cliente3 = new Cliente("Cliente", "Ficticio", "Esto no es una dirección 999", 70, 10000);
		
		propiedadValida = new Propiedad("Descripción de prueba", "Av. Siempreviva 742", 80000000);
		propiedadGarantiaInsuficiente = new Propiedad("Descripción de prueba", "P. Sherman 42", 20000000);
        
		ch1 = new SolicitudCreditoHipotecario(cliente1, 1000000, 24, propiedadValida); 
        ch2 = new SolicitudCreditoHipotecario(cliente2, 15000000, 12, propiedadGarantiaInsuficiente);
        cp1 = new SolicitudCreditoPersonal(cliente1, 200000, 48);
        cp2 = new SolicitudCreditoPersonal(cliente2, 2000000, 24);
        
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);
	}
	
	@Test
	void testAgregarClientes() {
		assertEquals(banco.getClientes().size(), 2);
		banco.agregarCliente(cliente3);
		assertEquals(banco.getClientes().size(), 3);
	}
	
	@Test
	void testRegistrarSolicitudes() {
		banco.registrarSolicitud(ch1);
		assertEquals(banco.getSolicitudes().size(), 1);
		banco.registrarSolicitud(cp1);
		assertEquals(banco.getSolicitudes().size(), 2);
	}
	
	@Test
	void testCreditosValidos() {

	}
	
	@Test
	void testCreditosInvalidos() {

	}
	
	@Test
	void testMontoADesembolsar() {
		testAgregarClientes();
		
	}

}
