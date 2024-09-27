package es.cursojava.excepciones;

import es.cursojava.poo.ejercicios.Alumno;

public class PruebaExcepciones {

	public static void main(String[] args) {
		
		System.out.println("Inicio");
		int[] numeros = {10,20,30};
		Alumno alumno1 = null;
				
		
		
		try {//Controlamos el código que se ejecuta
			int resultado = 7/0;
			alumno1.getNombre();
			System.out.println(numeros[3]);
			System.out.println("Continua");
		}catch (ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Se ha producido un error al acceder a una posición que no existe de un array");
		}catch (NullPointerException npe) {
			System.out.println("Se ha producido un error al acceder a un objeto que no existe");
		}catch(Exception e) {
			System.out.println("Se ha producido un error");
		}finally {
			System.out.println("Siempre se ejecuta");
		}
		
		try {
			metodo1();
		} catch (MiExcepcion e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("FIN");

	}
	
	
	public static void metodo1 () throws MiExcepcion{
		if(Math.random()>0.5) {
			MiExcepcion me = new MiExcepcion("Se ha producido un error gestionado por mi");
			throw me;
		}
	}

}
