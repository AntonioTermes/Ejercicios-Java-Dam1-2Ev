package ej6_2;

public class Pizza {
	
	private String tam;
	private String tipo;
	private String estado;
	public static int TotalPedidas;
	public static int TotalServidas;
	
	public Pizza() {
	
		this.estado = "pedida";
		TotalPedidas++;
		
	}
	
	public Pizza(String ti,String ta) {
		
		this.tam = ta;
		this.tipo = ti;
		this.estado = "pedida";
		TotalPedidas++;
		
	}
	
	public void sirve() {
		
		if(estado == "pedida") {
			
			System.out.printf("La pizza ha sido servida.\n%n");
			this.estado = "servida";
			TotalPedidas--;
			TotalServidas++;
			
		} else if(estado == "servida") {
			
			System.out.println("Esta pizza ya ha sido servida...");
			
		}
		
	}

	public static int getTotalPedidas() {
		
		return TotalPedidas;
		
	}

	public static int getTotalServidas() {
		
		return TotalServidas;
		
	}

	public String toString() {
		
		return "Pizza " + tipo + ", " + tam + ". Esta pizza está: " + estado;
		
	}

}
