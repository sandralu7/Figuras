package co.com.figuras;

public class Rectangulo extends Figura{
	
	private double largo;
	
	private double ancho;
	
	public Rectangulo (double largo, double ancho, int id, String color, String nombre) {
		super (id, color, nombre);
		this.ancho = ancho;
		this.largo = largo;
	}
	

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}


	@Override
	public double calcularArea() {
		return this.largo * this.ancho;
	}


	@Override
	public double calcularPerimetro() {
		return 2 * (this.largo + this.ancho);
	}


	@Override
	public String imprimir() {
		return "Soy un rectangulo";
	}


	@Override
	public String imprimir(double area) {
		return "Soy un rectangulo y mi area es: " + area;
	}


	@Override
	public String imprimir(int id) {
		return "Soy un rectangulo y mi id es: " + id;
	}
	
	

}
