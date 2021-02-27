package ej9_3;

import java.util.HashSet;
import java.util.Iterator;

public class Libreria {
	
	private HashSet<Libro> lista;
	
	public Libreria() {
		
		this.lista = new HashSet<Libro>();
		
	}
	
	public int tam() {
		
		return lista.size();
		
	}
	
	public void agregar(Libro l) {
		
		lista.add(l);
		
	}
	
	public void eliminarPos(Libro l) {
		
		lista.remove(l);
		
	}
	
	public boolean vacio() {
		
		if(lista.isEmpty()) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public boolean encontrarLibro(Libro l) {
		
		Iterator<Libro> i = lista.iterator();
		boolean encontrado = false;
		Libro aaaAaaa = new Libro();
		
		while(i.hasNext() && !encontrado) {
			
			aaaAaaa = i.next();
			if(aaaAaaa.equals(l)) {
				
				encontrado = true;
				return encontrado;
				
			}
			
		}
		
		return encontrado;
		
	}
	
public Libro parteTitulo(String t) {
		
		Iterator<Libro> i = lista.iterator();
		boolean encontrado = false;
		Libro aaaAaaa = new Libro();
		
		while(i.hasNext() && !encontrado) {
			
			aaaAaaa = i.next();
			if(aaaAaaa.getTitulo().contains(t)) {
				
				encontrado = true;
				return aaaAaaa;
				
			}
			
		}
		
		return null;
		
	}
	
}
