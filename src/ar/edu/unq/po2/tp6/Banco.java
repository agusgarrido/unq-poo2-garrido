package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes;
	private List<SolicitudCredito> solicitudes;
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudCredito>();
	}
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void registrarSolicitud(SolicitudCredito solicitudCredito) {
		solicitudes.add(solicitudCredito);
	}
	
	public double montoADesembolsar() {
		return solicitudes.stream()
						.filter(solicitud -> solicitud.esAceptable())
						.mapToDouble(monto -> monto.getMonto())
						.sum();
	}
	
	public List<SolicitudCredito> getSolicitudes() {
		return this.solicitudes;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}
}
