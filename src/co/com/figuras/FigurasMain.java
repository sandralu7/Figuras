package co.com.figuras;

import java.util.ArrayList;
import java.util.List;

public class FigurasMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circulo circulo = new Circulo(10, 1, "Azul", "Circulo 1");
		Figura circulo2 = new Circulo (5, 2, "Verde", "Circulo 2");
		Figura triangulo = new Triangulo (4, "Rojo", "Triangulo1", 1);
		Figura rectangulo = new Rectangulo (10, 5, 5, "Negro", "Rectangulo");
		
		
		List<Figura> figuras = new ArrayList<Figura>();
		figuras.add(circulo); //0
		figuras.add(circulo2); //1
		figuras.add(triangulo); //2
		figuras.add(rectangulo); //3
		
		for(Figura figura : figuras) {
			
			System.out.println("La figura " + figura.getNombre() + " tiene un área: " + figura.calcularArea() + " y tiene un perimetro "  + figura.calcularPerimetro());
			System.out.println("imprimir() " + figura.imprimir());
			System.out.println("imprimir(id) " + figura.imprimir(figura.getId()));
			System.out.println("imprimir (area) " + figura.imprimir(figura.calcularArea()));
		}
		
		for (int i=0; i < figuras.size(); i++) {
			System.out.println("La figura " + figuras.get(i).getNombre() + " tiene un área: " + figuras.get(i).calcularArea() + " y tiene un perimetro "  + figuras.get(i).calcularPerimetro());
			
		}
		
		Figura fig = figuras.get(1);
		System.out.println("Figura " + fig.getNombre());
		
		System.out.println("Tamaño de la lista " + figuras.size());
		
		figuras.remove(2);
		
		System.out.println("Tamaño de la lista " + figuras.size());
		
		figuras.clear();
		System.out.println("Tamaño de la lista " + figuras.size());
		

	}

}
