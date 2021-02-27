package ej9_1;

import java.util.Date;

public class Libro {
	
	private String titulo;
	private String autor;
	private int ISBN;
	private int paginas;
	private String edicion;
	private String editorial;
	private String lugar;
	private Date fecha;
	
	public Libro() {
		
		this.titulo = " ";
		this.autor = " ";
		ISBN = 0;
		this.paginas = 0;
		this.edicion = "";
		this.editorial = "";
		this.lugar = "";
		this.fecha = new Date(00/00/0000);
		
	}
	
	public Libro(String titulo, int paginas) {
		
		this.titulo = titulo;
		this.autor = " ";
		ISBN = 0;
		this.paginas = paginas;
		this.edicion = "";
		this.editorial = "";
		this.lugar = "";
		this.fecha = new Date();
		
	}
	
	public Libro(String titulo, String autor, int iSBN, int paginas, String edicion, String editorial, String lugar,
			Date fecha) {
		
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
		this.paginas = paginas;
		this.edicion = edicion;
		this.editorial = editorial;
		this.lugar = lugar;
		this.fecha = fecha;
		
	}

	public String getTitulo() {
		
		return titulo;
		
	}
	
	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
		
	}
	
	public String getAutor() {
		
		return autor;
		
	}
	
	public void setAutor(String autor) {
		
		this.autor = autor;
		
	}
	
	public int getISBN() {
		
		return ISBN;
		
	}
	
	public void setISBN(int iSBN) {
		
		ISBN = iSBN;
		
	}
	
	public int getPaginas() {
		
		return paginas;
		
	}
	
	public void setPaginas(int paginas) {
		
		this.paginas = paginas;
		
	}
	
	public String getEdicion() {
		
		return edicion;
		
	}
	
	public void setEdicion(String edicion) {
		
		this.edicion = edicion;
		
	}
	
	public String getEditorial() {
		
		return editorial;
		
	}
	
	public void setEditorial(String editorial) {
		
		this.editorial = editorial;
		
	}
	
	public String getLugar() {
		
		return lugar;
		
	}
	
	public void setLugar(String lugar) {
		
		this.lugar = lugar;
		
	}
	
	public Date getFecha() {
		
		return fecha;
		
	}
	
	public void setFecha(Date fecha) {
		
		this.fecha = fecha;
		
	}

	public String toString() {
		return "Titulo: " + titulo + " páginas: " + paginas + " |";
	}

}
