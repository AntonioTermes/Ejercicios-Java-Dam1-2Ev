package ej9_5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Diccionario {
	
	public static void main(String [] args) {
	HashMap<String, String> dic = new HashMap<String, String>();
		
		dic.put("Movimiento", "Movement");
		dic.put("Jugar", "Play");
		dic.put("Horizonte", "Horizon");
		dic.put("Sol", "Sun");
		dic.put("Cataluña", "Catalonia");
		dic.put("España", "Spain");
		dic.put("Mercado", "Market");
		dic.put("Farmacia", "Pharmacy");
		dic.put("Mantenimiento", "Manteinance");
		dic.put("Tienda", "Shop");
		dic.put("Pelota", "Ball");
		dic.put("Entrada", "Entrance");
		dic.put("Guardia", "Guard");
		dic.put("Triste", "Sad");
		dic.put("Disparar", "Shoot");
		dic.put("Colegio", "School");
		dic.put("Es", "Is");
		dic.put("Bueno", "Good");
		dic.put("Historia", "Story");
		dic.put("Proyectil", "Projectile");
		dic.put("Tristeza", "Sadness");
		
		Scanner s = new Scanner(System.in);
		int bien = 0;
		int mal = 0;
		
		for(int i = 0; i < 5; i++) {
			
			Iterator it = dic.keySet().iterator();
			int ran = (int) (Math.random()*dic.size());
			for(int f = 0; f <= ran; f++) {
				
				it.next();
				
			}
			
			String esp = (String)it.next();
			System.out.println("Traduce " + esp + ":");
			String ing = s.nextLine();
			if(ing.toUpperCase().equals(dic.get(esp).toUpperCase())) {
				
				bien++;
				
			} else {
				
				mal++;
				
			}
			
		}
		
		System.out.println("Correctas: " + bien);
		System.out.println("Erroneas: " + mal);
		
	}
	
}
