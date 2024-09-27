package es.cursojava.poo.herencia;

public abstract class Animal {
	private long id;
	private String nombre;
	private String fechaNacimiento;
	private double peso;
	
	public Animal(long id, String nombre, String fechaNacimiento, double peso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.peso = peso;
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void beber() {
		System.out.println("El animal "+ nombre + " está bebiendo");
	}
	
	public void comer() {
		System.out.println("El animal "+ nombre + " está comiendo");
	}
	
	public abstract void respirar();
	
}
