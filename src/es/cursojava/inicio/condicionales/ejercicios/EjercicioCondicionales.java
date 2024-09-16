package es.cursojava.inicio.condicionales.ejercicios;

public class EjercicioCondicionales {

	public static void main(String[] args) {
		String mes = "Enero";
		
		if(mes.equalsIgnoreCase("enero") || mes.equals("Febrero") || mes.equals("Marzo" )) {
			System.out.println("Invierno");
		}else if(mes.equals("Abril") || mes.equals("Mayo") || mes.equals("Junio")) {
			System.out.println("Primavera");
		}else if(mes.equals("Julio") || mes.equals("Agosto") || mes.equals("Septiembre")) {
			System.out.println("Verano");
		}else if(mes.equals("Octubre") || mes.equals("Noviembre") || mes.equals("Diciembre")) {
			System.out.println("Otoño");
		}else {
			System.out.println("Mes incorrecto");
		}

	}

}
