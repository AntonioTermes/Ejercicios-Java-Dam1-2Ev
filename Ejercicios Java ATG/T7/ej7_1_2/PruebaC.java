package ej7_1_2;

public class PruebaC {
	
	public static void main(String[] args) {
		
		Cancion c1 = new Cancion("si", "si");
		Cancion c2 = new Cancion("no", "no");
		Cancion c3 = new Cancion("hentai", "hentai");
		Cancion c4 = new Cancion("i want", "to die");
		CD d1 = new CD();
		d1.agregarCancion(c1);
		d1.agregarCancion(c2);
		System.out.println(d1);
		d1.sustCancion(20, c3);
		System.out.println(d1);
		d1.eliminarCancion(0);
		System.out.println(d1);
		
	}

}
