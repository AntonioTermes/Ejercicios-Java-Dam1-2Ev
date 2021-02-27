package ej7_3_4;

import java.util.ArrayList;

public class Libreria {
	
	private ArrayList<Libro> lista;
	
	public Libreria() {
		
		this.lista = new ArrayList<Libro>();
		
	}
	
	public int tam() {
		
		return lista.size();
		
	}
	
	public void agregar(Libro l) {
		
		lista.add(l);
		
	}
	
	public void eliminarPos(int i) {
		
		lista.remove(i);
		
	}
	
	public Libro buscarPos(int i) {
		
		return lista.get(i);
		
	}
	
	public int buscarTit(String t) {
		
		boolean seguir = true;
		int i = 0;
		
		while ((i<lista.size())&&(seguir)){
			
			if ((lista.get(i).getTitulo().toUpperCase().indexOf(t.toUpperCase()))!=-1) {
				
				seguir = false;
			
			} else {
				
				i++;
				
			}
		
		}
		
		if(!seguir) {
			
			return i;
			
		} else {
			
			return -1;
			
		}
		
	}
	
}
