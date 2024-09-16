package es.cursojava.inicio;

public class Variables {

	/*
	 Comentario de bloque
	 
	*/
	//Variables de instancia
	static int numeroInstancia;
	
	public static void main(String[] args) {
		//Comentario de linea
		//Variables locales
		//Tipos primitivos
		byte edad = 127;// -128 a 127 8bits
		short num2 = 10;//-32768 a 32767 16bits
		int numero = 7;//-2,147,483,648 a 2,147,483,647 32bits
		long num3 = 12;//-9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
		
		int numeroLocal;//Una variable local se debe inicializar antes de usar
		//System.out.println(numeroLocal);
		
		//Una variable de instancia se inicializa de manera automática
		System.out.println(numeroInstancia);
		
		
		double decimal1 = 79.6;
		float decimal2 = 9.5f;
		
		boolean esMayorEdad = true;
		char caracter = 'A';
		
		//Tipos Objeto
		String texto = "Hola Mundo";
		//Array o Matriz o Arreglo
		double [] notasClase1 = {9,6,3,4,7.5,8};
		
		
		System.out.println(texto);
		System.out.println(numero + 3 );
		System.out.println(texto + numero * 3 );
		
	}

}