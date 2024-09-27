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
		System.out.println("El le�n "+ getNombre()  + " est� rugiendo");
	}

	@Override
	public void comer() {
		System.out.println("El le�n "+ getNombre() + " est� mordiendo la presa");
	}

	@Override
	public String toString() {
		return "Leon con colorMelena=" + colorMelena + ", id=" + getId() + ", nombre=" + getNombre();
	}

	@Override
	public void respirar() {
		System.out.println("El le�n est� respirando");
		
	}
	
	
}
