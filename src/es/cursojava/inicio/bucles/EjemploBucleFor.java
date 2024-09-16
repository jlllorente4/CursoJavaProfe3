package es.cursojava.inicio.bucles;

public class EjemploBucleFor {

	public static void main(String[] args) {
		//1ª parte: declaramos e inicializamos una o más variables
		//2ª parte: establecemos la condición por la cual el bucle continuará iterando
		//3ª parte: como cambia la variables por cada iteración
		for (int i=0 ;  i<100  ; i++   ) {
			if(i%2==0 || i%3==0) {
				continue;
			}
			
			System.out.println(i);
			if (i>=10) {
				break;
			}
		}
		System.out.println("FIN");

	}

}
