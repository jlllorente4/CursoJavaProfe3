package es.cursojava.inicio.bucles;

public class EjemploBucleFor {

	public static void main(String[] args) {
		//1� parte: declaramos e inicializamos una o m�s variables
		//2� parte: establecemos la condici�n por la cual el bucle continuar� iterando
		//3� parte: como cambia la variables por cada iteraci�n
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
