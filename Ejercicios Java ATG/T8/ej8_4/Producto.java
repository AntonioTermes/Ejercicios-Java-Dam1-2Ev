package ej8_4;

public class Producto {
	
	private int codigo;
	private String nombre;
	private String tipo;
	private double precio;
	private int stock;
	
	public Producto(int codigo, double precio) {
		
		this.nombre = " ";
		this.tipo = " ";
		this.stock = 0;
		this.codigo = codigo;
		this.precio = precio;
		
	}
	
	public int getCodigo() {
		
		return codigo;
		
	}
	
	public void setCodigo(int codigo) {
		
		this.codigo = codigo;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}
	
	public String getTipo() {
		
		return tipo;
		
	}
	
	public void setTipo(String tipo) {
		
		this.tipo = tipo;
		
	}
	
	public double getPrecio() {
		
		return precio;
		
	}
	
	public void setPrecio(double precio) {
		
		this.precio = precio;
		
	}
	
	public int getStock() {
		
		return stock;
		
	}
	
	public void setStock(int stock) {
		
		this.stock = stock;
		
	}

	public String toString() {
		return "Producto | codigo=" + codigo + ", precio=" + precio;
	}
	
}