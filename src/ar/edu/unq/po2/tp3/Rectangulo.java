package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private double alto;
	private double ancho;
	private Punto punto;

	public Rectangulo(double alto, double ancho, Punto punto) {
		this.alto = alto;
		this.ancho = ancho;
		this.punto = punto;
	}
	
	public double calcularArea() {
		return alto * ancho;
	}
	
	public double getAlto()
	{ 
		return alto;
	}
	
	public double getAncho()
	{ 
		return ancho;
	}
	
	public double calcularPerimetro() {
		return (alto + ancho) * 2;
	}
	
	public String orientacion() {
		return alto > ancho ? "Vertical" : "Horizontal";
	}
}
