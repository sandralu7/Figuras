package co.com.figuras;

public class Triangulo extends Figura {
	
	private double lado;
	

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public Triangulo (double lado, String color, String nombre, int id) {
		super (id, color, nombre);
		this.lado = lado;
		
	}
	

	@Override
	public double calcularArea() {
		return (this.lado * this.lado / Math.pow(3, 1/2))/4;
	}

	@Override
	public double calcularPerimetro() {
		return this.lado * 3;
	}

	@Override
	public String imprimir() {
		return "Soy un triangulo";
	}

	@Override
	public String imprimir(double area) {
		return "Soy un triangulo y mi area es: " + area;
	}

	@Override
	public String imprimir(int id) {
		return "Soy un triangulo y mi id es: " + id;
	}

}
