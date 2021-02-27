package ej8_4;

public class PProd {
	
	public static void main(String[] args) {
		
		Producto p1 = new Producto(122, 75.77);
		Producto p2 = new Producto(18, 32.54);
		Producto p3 = new Producto(214, 2);
		Producto p4 = new Producto(53, 10.99);
		
		ArrayProd a = new ArrayProd();
		
		a.agregar(p1);
		a.agregar(p2);
		System.out.println(a.tamLista());
		a.agregar(p3);
		a.agregar(p4);
		System.out.println(a.tamLista());
		//System.out.println(a);
		a.buscarCod(53);
		a.eliminarCod(214);
		System.out.println(a.tamLista());
		a.CPrec(18, 69.69);
		System.out.println(a);
		System.out.println(a.buscarPos(2));
		
	}

}
