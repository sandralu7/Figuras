package co.com.figuras;


//No hay necesidad de implementar los metodos de IFigura porque la clase es abstracta
//la clase abstracta puede tener metodos abstractos
public abstract class Figura implements IFigura {
	
	private int id;
	
	private String color;
	
	private String nombre;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Figura () {
		//Los valoress por defecto son opcionales
		this.id = 1;
		this.color = "Rojo";
		this.nombre = "Figura 1";
	}
	
	public Figura (int id, String color, String nombre) {
		this.id = id;
		this.color = color;
		this.nombre = nombre;
	}
	
	public abstract String imprimir();
	
	public abstract String imprimir(double area);
	
	public abstract String imprimir(int id);



}
