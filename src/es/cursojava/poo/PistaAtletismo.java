package es.cursojava.poo;

public class PistaAtletismo {

	public static void main(String[] args) {
		
		String nombre = "Raúl";
		
		Persona persona0 = null;
		//System.out.println(persona0.nombre);
		
		Persona persona1 = new Persona();
		persona1.nombre = "Eva";
		System.out.println(persona1.apellidos);
		System.out.println(persona1.edad);
		
		Persona persona2 = new Persona();
		persona2.nombre = "Marta";
		
		Persona persona3 = new Persona();
		persona3.nombre = "Luis";
		
		Persona persona4 = persona3;
		persona4.nombre = "David";
		System.out.println(persona3.nombre);//David
		System.out.println(persona4.nombre);//David
		
	}

}
