package es.cursojava.inicio.funciones;

public class EjemploFunciones {

	public static void main(String[] args) {
		int num1 = 5;
		
		String email = "asda@sdasd.es";
		boolean valido = Utilidades.validarEmail(email);
		System.out.println(valido);
		
		//Paso por valor
		System.out.println(num1);//5
		funcion1(num1);
		System.out.println(num1);//5
		
		//Paso por referencia
//		int[] nums = {1,2,3,4};
//		System.out.println(nums[0]);//1
//		funcion1(nums);
//		System.out.println(nums[0]);//9
		
		
		String msg = "Hola";
		System.out.println(msg);
		funcion1(msg);
		System.out.println(msg);
		
		
		pintarTablaMultiplicar(num1);
		
		//Devuelve dato de tipo y lo almaceno en variable del mismo tipo
		int anio = calculaAnioNacimiento(24);
		System.out.println(anio);
	}
	
	//Sobrecarga de funciones
	public static void funcion1 () {
		System.out.println("Ejemplo 1 de funciones");
	}
	
	public static void funcion1 (String texto) {
		texto = "Adios";
		System.out.println("Ejemplo 1 de funciones con texto "+ texto);
	}

	public static void funcion1 (int numero) {
		numero = 6;
		System.out.println("Ejemplo 1 de funciones con número: "+ numero);//6
	}
	public static void funcion1 (int[] numeros) {
		numeros[0]=9;
		System.out.println("Ejemplo 1 de funciones con número: "+ numeros[0]);//9
	}
	
	public static void pintarTablaMultiplicar (int numero) {
		for ( int i=1 ;  i<=10  ; i++ ) {
			System.out.println(i + "x" + numero + "=" + i*numero );
		}
	}
	
	private static int calculaAnioNacimiento (int edad) {
		int anioNacimiento=0;
		
		anioNacimiento=2024-edad;
		
		return anioNacimiento;
	}

	
}











