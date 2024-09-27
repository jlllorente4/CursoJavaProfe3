package es.cursojava.colecciones;

import java.util.HashMap;

import es.cursojava.poo.ejercicios.Alumno;

public class PruebaMap {

	public static void main(String[] args) {
		
		HashMap<String,Alumno> mapaAlumnos = new HashMap();
		
		mapaAlumnos.put("111A", new Alumno ("N1","111A"));
		mapaAlumnos.put("222B", new Alumno ("N2","222B"));
		mapaAlumnos.put("333C", new Alumno ("N3","333C"));
		mapaAlumnos.put("444D", new Alumno ("N4","444D"));
		
		String dni = "333C";
		Alumno a = mapaAlumnos.get(dni);
		System.out.println(a.getNombre() +  " " + a.getDni()) ;
		
	}

}
