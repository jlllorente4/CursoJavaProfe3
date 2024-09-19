package es.cursojava.poo;

public class Persona {
	//Variables de instancia
	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	
	public Persona () {
		
	}
	
	public Persona (String nombre, String apellidos, String dni, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}
	
	public Persona(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	//M�todos getter y setter
	public String getNombre () {
		return nombre;
	}
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	//M�todos
	public void correr () {
		System.out.println(nombre + " est� corriendo");
	}
}
