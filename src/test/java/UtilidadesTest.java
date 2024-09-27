package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import es.cursojava.inicio.funciones.Utilidades;

public class UtilidadesTest {

	//Patrón AAA (Arrange, Act y Assert) 
	Utilidades utils;
	
	@Before
	public void preparacion() {
		utils = new Utilidades();
	}
	
	@Test
	public void validarEmailCorrecto() {
		boolean emailValido = Utilidades.validarEmail("asdasd@asdsa.es");
		
		assertFalse(emailValido);
	}
	
	@Test
	public void validarEmailInCorrecto() {
		boolean emailValido = Utilidades.validarEmail("asdasdasdsa.es");
		
		assertFalse(emailValido);
	}
	
	@Test
	public void validarEmailHotmail() {
		boolean emailValido = Utilidades.validarEmail("asdasd@hotmail.es");
		
		assertTrue(emailValido);
	}
	
	@Test
	public void validarSuma() {
		int resultado = utils.suma(7,3);
		assertEquals(10,resultado);
	}
	
	@Test(timeout = 2000)
	public void validarResta() {
		int resultado = utils.resta(7,3);
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		assertEquals(4,resultado);
	}
	
	@Test
	public void validarDivision() {
		int resultado = utils.division(8,2);
		
		assertEquals(4,resultado);
	}
	
	@Test(expected = ArithmeticException.class)
	public void validarDivisionPorCero() {
		int resultado = utils.division(8,0);
		
	}
	
}
