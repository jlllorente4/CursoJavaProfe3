package es.cursojava.poo.ejercicios;

public class Aula {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("A1");
		alumno1.setDni("111A");
		alumno1.setNota(1.5);
		alumno1.setMayorEdad(true);
		
		Alumno alumno2 = new Alumno("A2",null);
		//alumno2.setNota(3);
		alumno2.setMayorEdad(true);
		
		Alumno alumno3 = new Alumno("A3","3333C",9.5,true);
		
		alumno1.verNota();
		alumno2.verNota();
		alumno3.verNota();
		
		Alumno[] alumnos = {alumno1,alumno2,alumno3};
		//System.out.println(alumnos[0].getNombre());
		Aula aula1 = new Aula();
		aula1.pintaDatosAlumnosAprobados(alumnos);
		
		//Acceso variable tipo static
		System.out.println("==========================");
		Alumno.contador=6;
		System.out.println(alumno1.contador);//0-6
		alumno2.contador=8;
		System.out.println(alumno1.contador);//0-8
		System.out.println(alumno2.contador);//8-8
		System.out.println(Alumno.contador);//6-8
		alumno3.contador=10;
		System.out.println(alumno1.contador);//0-10
		System.out.println(alumno2.contador);//8-10
		System.out.println(alumno3.contador);//10-10
		System.out.println(Alumno.contador);
	}
	
	private void pintaDatosAlumnosAprobados(Alumno[] arrayAlumnos) {
//		for ( int i=0  ;  i<arrayAlumnos.length  ; i++  ) {
//			Alumno alumno = arrayAlumnos[i];
//			if(alumno.getNota()>=5) {
//				System.out.println(alumno.getNombre());
//			}
//		}
		
		
		for ( Alumno alumno : arrayAlumnos  ) {
			if(alumno.getNota()>=5) {
				System.out.println(alumno.getNombre());
			}
		}
		
	}

}
