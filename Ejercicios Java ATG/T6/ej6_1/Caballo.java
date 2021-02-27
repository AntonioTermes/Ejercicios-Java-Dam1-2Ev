package ej6_1;

public class Caballo {

	private String color;
	private String altura;
	private String peso;
	private Boolean puraSangre;
	private int salto;
	private int a�os;
	
	public Caballo(String color, String altura, String peso, int salto, int a�os, Boolean puraSangre) {
		
		this.color = color;
		this.altura = altura;
		this.peso = peso;
		this.puraSangre = puraSangre;
		this.salto = salto;
		this.a�os = a�os;
		
	}

	public Caballo() {
		
	}

	public Caballo(int salto, int a�os) {
		
		this.salto = salto;
		this.a�os = a�os;
		
	}

	public String getColor() {
		
		return color;
		
	}

	public void setColor(String color) {
		
		this.color = color;
		
	}

	public String getAltura() {
		
		return altura;
		
	}

	public void setAltura(String altura) {
		
		this.altura = altura;
		
	}

	public String getPeso() {
		
		return peso;
		
	}

	public void setPeso(String peso) {
		
		this.peso = peso;
		
	}

	public Boolean getpuraSangre() {
		
		return puraSangre;
		
	}

	public void setpuraSangre(Boolean puraSangre) {
		
		this.puraSangre = puraSangre;
		
	}

	public int getSalto() {
		
		return salto;
		
	}

	public void setSalto(int salto) {
		
		this.salto = salto;
		
	}

	public int getA�os() {
		
		return a�os;
		
	}

	public void setA�os(int a�os) {
		
		this.a�os = a�os;
		
	}

	public void saltando() {
		
		if(this.salto < 10 ) {
			
			System.out.println("No puedo saltar eso");
			
		} else {
			
			System.out.println("|---|");
			
		}
		
	}
	
	
	@Override
	public String toString() {
		
		return "Caballo [color=" + color + ", altura=" + altura + ", peso=" + peso + ", razaPura=" + puraSangre
				+ ", salto=" + salto + ", a�os=" + a�os + "]";
		
	}
	
}