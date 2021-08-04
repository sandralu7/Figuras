package co.com.figuras;

public interface IFigura {
	
	//Los metodos no tienen cuerpo porque van implementados en una subclases
	//asi yo no ponga el abstract el metodo siempre es abstracto
	public double calcularArea();
	public abstract double calcularPerimetro();

}
