package ej6_1;

public class Caballo {

	private String color;
	private String altura;
	private String peso;
	private Boolean puraSangre;
	private int salto;
	private int años;
	
	public Caballo(String color, String altura, String peso, int salto, int años, Boolean puraSangre) {
		
		this.color = color;
		this.altura = altura;
		this.peso = peso;
		this.puraSangre = puraSangre;
		this.salto = salto;
		this.años = años;
		
	}

	public Caballo() {
		
	}

	public Caballo(int salto, int años) {
		
		this.salto = salto;
		this.años = años;
		
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

	public int getAños() {
		
		return años;
		
	}

	public void setAños(int años) {
		
		this.años = años;
		
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
				+ ", salto=" + salto + ", años=" + años + "]";
		
	}
	
}