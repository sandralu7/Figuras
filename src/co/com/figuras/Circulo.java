package co.com.figuras;


// Al extender de Figura y teniendo en cuenta que figura implementa la interface IFigura DEBO implementar
//los metodos de calcular area y perimetro.
public class Circulo extends Figura {
	
	private double radio;
	

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public Circulo (double radio, int id, String color, String nombre) {
		super (id, color, nombre);
		this.radio = radio;
		
	}

	@Override
	public double calcularArea() {
		return Math.PI * this.radio * this.radio;
	}

	@Override
	public double calcularPerimetro() {
	
		return 2 * Math.PI * this.radio;
	}

	@Override
	public String imprimir() {
		return "Soy un circulo";
	}

	@Override
	public String imprimir(double area) {
		return "Soy un circulo y mi area es: " + area;
	}

	@Override
	public String imprimir(int id) {
		return "Soy un circulo y mi id es: " + id;
	}
	
	

}
