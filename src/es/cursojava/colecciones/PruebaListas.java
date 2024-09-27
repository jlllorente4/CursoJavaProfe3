package es.cursojava.colecciones;

import java.util.ArrayList;

import es.cursojava.poo.ejercicios.Alumno;

public class PruebaListas {

	public static void main(String[] args) {
		
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
//		listaAlumnos.add("Hola");
//		listaAlumnos.add(1);
		listaAlumnos.add(new Alumno ("N1","111A"));
		listaAlumnos.add(new Alumno ("N2","222B"));
		listaAlumnos.add(new Alumno ("N3","333C"));
		listaAlumnos.add(new Alumno ("N4","444D"));
		
		for( Alumno alumno   :  listaAlumnos  ) {
			System.out.println(alumno.getNombre() + " " +alumno.getDni());
		}
		
		System.out.println("=====================");
		Alumno alumno5 = new Alumno ("N5","555E");
		listaAlumnos.add(0, alumno5);
		listaAlumnos.add(0, alumno5);
		
		for( Alumno alumno   :  listaAlumnos  ) {
			System.out.println(alumno.getNombre() + " " +alumno.getDni());
		}
		
		System.out.println("=====================");
		String dni = "555E";
		for( Alumno alumno   :  listaAlumnos  ) {
			if(alumno.getDni().equals(dni)) {
				System.out.println(alumno.getNombre() + " " +alumno.getDni());
				break;
			}
			
		}
	}

}
