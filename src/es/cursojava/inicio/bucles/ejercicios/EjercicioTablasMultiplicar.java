package es.cursojava.inicio.bucles.ejercicios;
//Pintar las tablas de multiplicar de los numeros del 1-10
public class EjercicioTablasMultiplicar {

	public static void main(String[] args) {
		
		
		for ( int i=1 ;  i<=10  ; i++ ) {
			System.out.println("\nTabla del "+i);
			for ( int j=1 ;  j<=10  ; j++ ) {
				System.out.println("\t"+i + "x" + j + "=" + i*j );
			}
		}

	}

}
