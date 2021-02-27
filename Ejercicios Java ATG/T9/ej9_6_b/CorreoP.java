package ej9_6_b;

public class CorreoP {
	
	public static void comprobar(String c) throws Exception {
		
		if (c.contains("@.")) {
			
			throw new Exception("DirCorreoIncorrectaException");
			
		} else if (c.contains("@")) {
		
			String [] corte1 = c.split("@", 2);
			if(corte1[1].contains(".")) {
				
				String [] corte2 = corte1[1].split("\\.", 2);
				if(corte2[1].equals("")) {
					
					throw new Exception("DirCorreoIncorrectaException");
					
				}
				
			} else {
				
				throw new Exception("DirCorreoIncorrectaException");
				
			}
	
		} else {
			
			throw new Exception("DirCorreoIncorrectaException");
			
		}
		
	}
	
	public static void main(String [] args) throws Exception {
		
		String correo = "aaaaaaaaaaaaaaa@aah.com";
		
		comprobar(correo);
		
	}

}
