package ej8_4;

import java.util.LinkedList;

public class ArrayProd {

	private LinkedList<Producto> lista;
	
	public ArrayProd() {
		
		this.lista = new LinkedList<Producto>();
		
	}
	
	public int tamLista() {
		
		return lista.size();
		
	}
	
	public void agregar(Producto p) {
		
		lista.add(p);
		
	}
	
	public Producto buscarPos(int i) {
		
		return lista.get(i);
		
	}
	
	public void buscarCod(int c) {
		
		int pos = 0;
		boolean parar = false;
		
		while(pos < lista.size() && !parar) {
			
			if(lista.get(pos).getCodigo() == c) {
				
				parar = true;
					
			} else {
				
				pos++;
				
			}
			
		}
		
		if(parar) {
			
			System.out.println(lista.get(pos));
			
		} else {
			
			System.out.println("No hay ningun producto con ese código");
			
		}
		
	}
	
	public void eliminarCod(int c) {
		
		int pos = 0;
		boolean parar = false;
		
		while(pos < lista.size() && !parar) {
			
			if(lista.get(pos).getCodigo() == c) {
				
				parar = true;
					
			} else {
				
				pos++;
				
			}
			
		}
		
		if(parar) {
			
			lista.remove(pos);
			
		} else {
			
			System.out.println("No hay ningun producto con ese código");
			
		}
		
	}
	
	public void CPrec(int c, double prec) {
		
		int pos = 0;
		boolean parar = false;
		
		while(pos < lista.size() && !parar) {
			
			if(lista.get(pos).getCodigo() == c) {
				
				parar = true;
					
			} else {
				
				pos++;
				
			}
			
		}
		
		if(parar) {
			
			lista.get(pos).setPrecio(prec);
			
		} else {
			
			System.out.println("No hay ningun producto con ese código");
			
		}
		
	}

	public String toString() {
		
		return "ArrayProd [lista=" + lista + "]";
		
	}
	
}
