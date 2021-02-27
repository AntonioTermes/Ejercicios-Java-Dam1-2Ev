package ej6_3;

public class Zona {

	private int entradas;
	
	public Zona(int entradas) {
		
		this.entradas = entradas;
		
	}
	
	public void Comprar(int c) {
		
		if(entradas >= c) {
			
			entradas -= c;
			System.out.printf("Se han comprado exitosamente " + c + " entradas!%nLa cantidad de entradas disponibles ha pasado a ser " + entradas + " entadas.%n" );
			
		} else {
			
			System.out.println("No quedan suficientes entradas...");
			
		}
		
	}
	
	public int getEntradas() {
		
		return entradas;
		
	}
	
}
