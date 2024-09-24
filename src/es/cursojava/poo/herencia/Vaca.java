package es.cursojava.poo.herencia;

public class Vaca extends Animal{
	private String tipoVaca;

	public Vaca(long id, String nombre, String fechaNacimiento, double peso, String tipoVaca) {
		super(id, nombre, fechaNacimiento, peso);
		this.tipoVaca = tipoVaca;
	}
	
	public void mugir () {
		System.out.println("La vaca "+ getNombre()  + " está mugiendo");
	}
	
	@Override
	public void comer() {
		System.out.println("La vaca "+ getNombre() + " está pastando");
	}

}
