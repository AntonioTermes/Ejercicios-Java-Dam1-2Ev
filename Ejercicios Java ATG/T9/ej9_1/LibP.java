package ej9_1;

public class LibP {
	
	public static void main(String[] args) {
		
		Libro l1 = new Libro("aaA", 43);
		Libro l2 = new Libro("abA", 623);
		Libro l3 = new Libro("acA", 83);
		Libro l4 = new Libro("adA", 163);
		Libro l5 = new Libro("aaaA", 323);
		Libreria i1 = new Libreria();
		
		i1.agregar(l1);
		i1.agregar(l2);
		i1.agregar(l3);
		i1.agregar(l4);
		i1.agregar(l5);
		
		i1.ordTitulo();
		
		System.out.println(i1);
		
	}

}
