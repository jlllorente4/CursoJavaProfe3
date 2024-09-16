package es.cursojava.inicio.condicionales;

public class EjemplosCondicionalesIf {
	//En java para evaluar condiciones tenemos
	//   + if
	//   + switch
	public static void main(String[] args) {
		
		int numero =4;
		int nota = 4;
		
		if (numero%2!=0) {
			System.out.println("El numero " + numero  + " es impar");
		}else {
			System.out.println("El numero " + numero  + " es par");
		}
		
		// += -= *=
		nota = nota +3;
		nota += 3;
		System.out.println(nota*=2);//20
		
		// ++ y -- (aumentan o disminuyen en 1 el valor de un entero)
		System.out.println(nota++);//20
		System.out.println(nota);//21
		System.out.println(++nota);//22
		
		
		
		
		if (nota>=0 && nota<5) {
			System.out.println("Suspenso");
		}else if (nota<7) {
			System.out.println("Aprobado");
		}else if (nota<9) {
			System.out.println("Notable");
		}else if (nota<=10) {
			System.out.println("Sobresaliente");
		}else {
			System.out.println("Nota incorrecta");
		}
		
		System.out.println("Fin");
	}

}
