package ej8_1;

public class PPP {
	
	public static void main(String[] args) {
		
		PilaPalabras PP1 = new PilaPalabras();
		PP1.apilarPalabra("Me");
		PP1.apilarPalabra("gusta");
		PP1.apilarPalabra("el");
		PP1.apilarPalabra("hentai");
		PP1.apilarPalabra("de");
		PP1.apilarPalabra("monster");
		PP1.apilarPalabra("girls");
		
		System.out.println(PP1.obtenerPCima());
		System.out.println(PP1.desapilarPalabra());
		System.out.println(PP1.obtenerPCima());
		System.out.println(PP1.pilaVacia());
		PP1.desapilarPalabra();
		PP1.desapilarPalabra();
		PP1.desapilarPalabra();
		PP1.desapilarPalabra();
		PP1.desapilarPalabra();
		PP1.desapilarPalabra();
		System.out.println(PP1.pilaVacia());
		
	}

}
