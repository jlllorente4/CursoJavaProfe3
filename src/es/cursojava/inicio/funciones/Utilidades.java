package es.cursojava.inicio.funciones;

public class Utilidades {

	public static boolean validarEmail(String email) {
		boolean emailValido = false;

//		Math.random();
//		int numero = Integer.parseInt("2");

		emailValido = email.contains("@");

		if (!email.endsWith("hotmail.es")) {
			emailValido = false;
		}
//		String [] colores = {"Rojo","Verde"};
//		EjemploFunciones.pintarTablaMultiplicar(2);

		return emailValido;
	}

	public int suma(int num1, int num2) {

		return num1 + num2;
	}

	public int resta(int num1, int num2) {

		return num1 - num2;
	}

	public int division(int num1, int num2) {

		return num1 / num2;
	}

}
