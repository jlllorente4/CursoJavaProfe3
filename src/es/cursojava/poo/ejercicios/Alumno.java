package es.cursojava.poo.ejercicios;

public class Alumno {
	private String nombre;
	private String dni;
	private double nota;
	private boolean mayorEdad;
	static int contador;
	
	public Alumno() {
	
	}

	public Alumno(String nombre, String dni, double nota, boolean mayorEdad) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.nota = nota;
		this.mayorEdad = mayorEdad;
	}

	public Alumno(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public boolean isMayorEdad() {
		return mayorEdad;
	}

	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}
	
	public void verNota () {
		if (this.mayorEdad) {
			if (this.nota==0) {
				System.out.println("El alumno "+ this.nombre +" no ha estudiado nada");
			}else if (nota<5) {
				System.out.println("El alumno "+ this.nombre +" ha estudiado poco");
			}else if (nota<9) {
				System.out.println("El alumno "+ this.nombre +" ha estudiado mucho");
			}else if (nota<=10) {
				System.out.println("El alumno "+ this.nombre +" es un genio");
			} 
		}else {
			System.out.println("El alumno " + nombre +" no tiene permisos");
		}
	}
	
}
