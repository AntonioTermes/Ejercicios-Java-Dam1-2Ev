package ej8_2;

import java.util.ArrayList;

public class PilaPalabras {
	
	private ArrayList<String> pila;
	
	public PilaPalabras() {
		
		this.pila = new ArrayList<String>();
		
	}
	
	public void apilarPalabra(String p) {
		
		pila.add(p);
		
	}
	
	public String desapilarPalabra() {
		
		String ultima = pila.get(pila.size() - 1);
		pila.remove(pila.size() - 1);
		return ultima;
		
	}
	
	public String obtenerPCima() {
		
		return pila.get(pila.size() - 1);
		
	}
	
	public boolean pilaVacia() {
		
		if(pila.isEmpty()) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}

}
