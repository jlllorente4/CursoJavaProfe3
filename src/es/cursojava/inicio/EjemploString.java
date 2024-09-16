package es.cursojava.inicio;

public class EjemploString {

	public static void main(String[] args) {
		String texto1 = "hola";
		String texto2 = "hola";
		String texto3 = new String("Hola");
		
		System.out.println(texto1==texto2);//true
		System.out.println(texto1==texto3);//false??
		System.out.println(texto1.equals(texto3));//true
		System.out.println(texto1.equalsIgnoreCase(texto3));//true
		
		
		texto1 = texto1.toUpperCase();
		
		System.out.println(texto1);//HOLA
		
		System.out.println(texto1 + ", qué tal?");
		//campo1 + "|" + campo2 + "|" + campo3 + "|" + campo4
		
	}

}
