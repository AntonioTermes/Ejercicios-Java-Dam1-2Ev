package ej9_6_a;

import java.util.Scanner;

public class ComprobarEntero {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		try {
			
			int a = s.nextInt();
			
		}
		
		catch(java.util.InputMismatchException excepion) {
			
			System.out.println("El numero no es un entero");
			
		}

		
	}

}
