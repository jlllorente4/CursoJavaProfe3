package es.cursojava.colecciones;

import java.util.HashSet;

import es.cursojava.poo.ejercicios.Alumno;

public class PruebaSet {

	public static void main(String[] args) {
		HashSet<Alumno> setAlumnos = new HashSet();

		setAlumnos.add(new Alumno ("N1","111A"));
		setAlumnos.add(new Alumno ("N2","222B"));
		setAlumnos.add(new Alumno ("N3","333C"));
		setAlumnos.add(new Alumno ("N4","444D"));
		
		for( Alumno alumno   :  setAlumnos  ) {
			System.out.println(alumno.getNombre() + " " +alumno.getDni());
		}
		
		System.out.println("==========================");
		Alumno alumno5 = new Alumno ("N5","555E");
		setAlumnos.add(alumno5);
		setAlumnos.add(alumno5);
		
		for( Alumno alumno   :  setAlumnos  ) {
			System.out.println(alumno.getNombre() + " " +alumno.getDni());
		}
	}

}
