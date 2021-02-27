package ej7_1_2;

import java.util.Arrays;

public class CD {
	
	private static int limite = 21; 
	private Cancion[] album;
	private int contador;
	
	CD(){
		
		this.contador = 0;
		this.album = new Cancion[limite + 1];
		
	}
	
	public int numeroCanciones() {
		
		return contador;
		
	}
	
	public Cancion buscarCancion(int i) {
		
		return album[i];
		
	}
	
	public boolean sustCancion(int pos, Cancion c) {
		
		if(pos >= 0 && pos < limite) {
			
			album[pos] = c;	
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public boolean agregarCancion(Cancion c) {
		
		if(contador < limite) {
			
			album[contador] = c;
			contador++;
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public boolean eliminarCancion(int i) {
		
		if(i < limite && i >= 0) {
			
			album[i] = album[limite];
			contador--;
			return true;
			
		} else {
			
			return false;
			
		}
		
	}

	public String toString() {
		
		return Arrays.toString(album);
		
	}

}