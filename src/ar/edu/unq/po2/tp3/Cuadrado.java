package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {

	public Cuadrado(double lado, Punto punto) {
		super(lado, lado, punto);
	}

	@Override
	public double calcularPerimetro() {
		return getAlto() * 4;
	}

	@Override
	public String orientacion() {
		return "Cuadrado";
	}

}
