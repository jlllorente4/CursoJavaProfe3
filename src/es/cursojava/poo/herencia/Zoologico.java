package es.cursojava.poo.herencia;

public class Zoologico {

	public static void main(String[] args) {
		
		Vaca vaca1 = new Vaca(1,"Vaca1","",250, "Hereford");
		Vaca vaca2 = new Vaca(2,"Vaca2","",250, "Hereford");
		Leon leon1 = new Leon(3,"Leon1","",200, "Rojo");
		System.out.println(leon1);
		Serpiente serpiente1 = new Serpiente(4,"Serpiente1","",20);
		
		Animal[] animales = {vaca1,vaca2,leon1, serpiente1};
			
		for (Animal animal : animales) {
			//Polimorfismo
			animal.comer();
			
			if (animal instanceof Vaca) {
				//Cast o Casting
				Vaca v = (Vaca)animal;
				v.mugir();
			}
			animal.beber();
		}
		
		Animal leon2 = new Leon(5,"Leon2","",200, "Rojo");
		leon2.comer();
		leon2.beber();
		System.out.println("=======================");
		
		//Cast 
		Leon l = (Leon)leon2;
		l.rugir();
		
//		Vaca v = (Vaca)leon2;
//		v.mugir();
		
		
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
