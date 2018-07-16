package br.com.geovanyrodrigues.ExemploTDD_Java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTeste {
	
	@Test
	public void deveriaSomarDoisNumeros() throws Exception {
		int num1 = 10;
		int num2 = 20;
		
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.soma(num1, num2);
		
		assertEquals(30, soma);
	}
	
	@Test(expected = ArithmeticException.class)
	public void deveriaLancarExceptionPorFalhaAoDividirPorZero() throws Exception {
		int num1 = 10;
		int num2 = 0;
		
		Calculadora calculadora = new Calculadora();
		calculadora.dividir(num1, num2);
	}
}
