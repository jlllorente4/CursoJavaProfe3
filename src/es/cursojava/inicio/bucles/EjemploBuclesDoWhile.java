package es.cursojava.inicio.bucles;

public class EjemploBuclesDoWhile {

	public static void main(String[] args) {
		//Bucle primero ejecuta y luego eval�a la condici�n
		int numero = 0;
		do {
			System.out.println("Ejecuta "+ numero);
		}while(numero>5);
		System.out.println("FIN");
	}

}
