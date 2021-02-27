package ej6_3;

import java.util.Scanner;

public class MenuCompra {
	
	public static void main(String[] args) {
		
		Zona principal = new Zona(1000);
		Zona compraVenta = new Zona(200);
		Zona VIP = new Zona(25);
		Scanner s = new Scanner(System.in);
		boolean finalizar = false;
		while(!finalizar) {
			
			System.out.printf("%nInserte un número correspondiente a la acción requerida%n-------------------------------------------------------%n1. Mostrar las entradas libres.%n2. Comprar entradas.%n3. Salir.%n-------------------------------------------------------%n");
			int menu = s.nextInt();
			switch(menu) {
			
			case 1:
				System.out.println("Quedan " + principal.getEntradas() + " entradas libres en la sala principal.");
				System.out.println("Quedan " + compraVenta.getEntradas() + " entradas libres en la zona de Compra-Venta.");
				System.out.println("Quedan " + VIP.getEntradas() + " entradas libres en la sala principal");
				break;
				
			case 2:
				System.out.printf("%n-------------------------------------------------------%nSeleccione la zona de la que quiere comprar entradas%n-------------------------------------------------------%n1. Sala Principal.%n2. Sala Compra-Venta.%n3. Sala VIP%nOtra opción: Salir%n-------------------------------------------------------%n");
				int compraOP = s.nextInt();
				switch(compraOP) {
				
				case 1:
					System.out.println("Seleccione la cantidad de entradas que se quieran comprar.");
					int cantP = s.nextInt();
					principal.Comprar(cantP);
					break;
					
				case 2:
					System.out.println("Seleccione la cantidad de entradas que se quieran comprar.");
					int cantC = s.nextInt();
					compraVenta.Comprar(cantC);
					break;
					
				case 3:
					System.out.println("Seleccione la cantidad de entradas que se quieran comprar.");
					int cantV = s.nextInt();
					VIP.Comprar(cantV);
					break;
					
				default:	
					break;
					
				}
				
				break;
			
			case 3:
				finalizar = true;
				System.out.println("Gracias por usar este servicio.");
				break;
				
			default:
				break;
				
			}
			
		}
		
	}

}
