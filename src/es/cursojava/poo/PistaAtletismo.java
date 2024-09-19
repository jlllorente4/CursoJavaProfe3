package es.cursojava.poo;

public class PistaAtletismo {

	public static void main(String[] args) {
		
		String nombre = "Raúl";
		
		Persona persona0 = new Persona("N1","A1","111A",18);
		System.out.println(persona0.getNombre());
		
		Persona persona1 = new Persona("Eva","A2","222B");
		//persona1.setNombre("Eva");
		System.out.println(persona1.getApellidos());
		System.out.println(persona1.getEdad());
		persona1.correr();
		
		Persona persona2 = new Persona();
		persona2.setNombre("Marta");
		persona2.correr();
		
		Persona persona3 = new Persona();
		persona3.setNombre("Luis");
		 
		Persona persona4 = persona3;
		persona4.setNombre("David");
		System.out.println(persona3.getNombre());//David
		System.out.println(persona4.getNombre());//David
		persona3.correr();
	}

}
