package es.cursojava.poo.herencia;

public class Leon extends Animal {
	private String colorMelena;
	
	public Leon(long id, String nombre, String fechaNacimiento, double peso) {
		super(id, nombre, fechaNacimiento, peso);
		// TODO Auto-generated constructor stub
	}

	public Leon(long id, String nombre, String fechaNacimiento, double peso, String colorMelena) {
		super(id, nombre, fechaNacimiento, peso);
		this.colorMelena = colorMelena;
	}
	
	
	public void rugir () {
		System.out.println("El león "+ getNombre()  + " está rugiendo");
	}

	@Override
	public void comer() {
		System.out.println("El león "+ getNombre() + " está mordiendo la presa");
	}

	@Override
	public String toString() {
		return "Leon con colorMelena=" + colorMelena + ", id=" + getId() + ", nombre=" + getNombre();
	}

	@Override
	public void respirar() {
		System.out.println("El león está respirando");
		
	}
	
	
}
