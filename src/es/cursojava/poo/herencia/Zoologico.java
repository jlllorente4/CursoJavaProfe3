package es.cursojava.poo.herencia;

public class Zoologico {

	public static void main(String[] args) {
		
		Vaca vaca1 = new Vaca(1,"Vaca1","",250, "Hereford");
		Vaca vaca2 = new Vaca(2,"Vaca2","",250, "Hereford");
		Leon leon1 = new Leon(3,"Leon1","",200, "Rojo");
		
		System.out.println(leon1);
		//Animal animal1 = new Animal(1,"Vaca1","",250);
		//De una clase abstracta no se pueden generar objetos 
		
		vaca2.comer();
		vaca2.beber();
		vaca2.mugir();
		
		leon1.comer();
		leon1.beber();
		leon1.rugir();
		
	}

}
