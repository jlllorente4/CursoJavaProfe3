package es.cursojava.inicio.bucles.ejercicios;
//Mostrar los 10 primeros n�meros de la Serie de Fibonacci
//0,1,1,2,3,5,8,13
public class EjercicioFibonacci {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		
		System.out.print(num1 +", ");
		System.out.print(num2 +", ");
		
		int contador = 0;
		do {
			int suma = num1 + num2;
			num1 = num2;
			num2 = suma;
			System.out.print(suma + ", ");
			
			contador++;
		}while(contador<18);

	}

}

