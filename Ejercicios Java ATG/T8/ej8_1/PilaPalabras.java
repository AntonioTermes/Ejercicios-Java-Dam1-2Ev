package ej8_1;

import java.util.LinkedList;

public class PilaPalabras {
	
	private LinkedList<String> pila;
	
	public PilaPalabras() {
		
		this.pila = new LinkedList<String>();
		
	}
	
	public void apilarPalabra(String p) {
		
		pila.add(p);
		
	}
	
	public String desapilarPalabra() {
		
		return pila.removeLast();
		
	}
	
	public String obtenerPCima() {
		
		return pila.getLast();
		
	}
	
	public boolean pilaVacia() {
		
		if(pila.isEmpty()) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}

}
