package ar.edu.unq.po2.tp3;

public class Punto {
	private int x;
	private int y;

	public Punto() {
		this(0, 0);
	}
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void moverPunto(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public Punto sumarPunto(Punto punto) {
		return new Punto(punto.getX() + x, punto.getY() + y);
	}
}
