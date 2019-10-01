package ar.edu.utn.frba.sceu.forma;

public class CalculadorFormas {

	public static void main(String[] args) {
		FormaRectangular forma1 = new FormaRectangular();
		
		forma1.setAltura(12);
		forma1.setBase(10);
		
		System.out.println("area es: " + forma1.area());
		System.out.println("perimetro: " + forma1.perimetro());
		System.out.println("es cuadrado: " + forma1.esCuadrado());
		
		FormaRectangular forma2 = new FormaRectangular(); 
		
		forma2.setAltura(20);
		forma2.setBase(30);
		
		System.out.println("area es: " + forma2.area());
		System.out.println("perimetro: " + forma2.perimetro());
		System.out.println("es mas grande: " +);
	}

}
