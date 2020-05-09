package CalculadoraTest;


import Calculadora.Calculadora;
import Calculadora.tasksCalculadora;


public class CalculadoraTest {

	
	tasksCalculadora taskcalc = new tasksCalculadora();
	
	
	 
	public double somar( 10.0 ,5.0);
	
	 
	public void testSomaErro(){
		assertNotEquals(15, calculadoraTeste.somar(5, 5));
	}
	
	 
	public void testSomaNotNull(){
		assertNotNull(calculadoraTeste.somar(5, 0));
	}
	
	 
	public void testSomaVerifica(){
		assertTrue(calculadoraTeste.somar(5, 5) == 10);
	}
	
	
	
	

// subtrair
	
	 
	public void testSubtrair()	{
		assertEquals(5, calculadoraTeste.subtrair(10, 5),0.01);
	}
	
	 
	public void testSubtraiErro(){
		assertNotEquals(10, calculadoraTeste.subtrair(5, 5));
	}
	
	 
	public void testSubtraiNotNull(){
		assertNotNull(calculadoraTeste.subtrair(1, 1));
	}
	
	 
	public void testSubtraiVerifica(){
		assertTrue(calculadoraTeste.subtrair(10, 5)==5);
	}
	
	 
	
//dividir
	
	 
	public void testDividir()	{
		assertEquals(3, calculadoraTeste.dividir(15, 5),0.01);
		
	}

	 
	public void testDividirErro(){
		assertNotEquals(10, calculadoraTeste.dividir(10, 5));
	}
	
	 
	public void testDividirNotNull(){
		assertNotNull(calculadoraTeste.dividir(1, 1));
	}
	
	 
	public void testDividirVerifica(){
		assertTrue(calculadoraTeste.dividir(15, 5) == 3);
	}
	
	
// multiplicar
	 
	public void testMultiplicar()	{
		assertEquals(25, calculadoraTeste.multiplicar(5, 5),0.01);

	}
	
	 
	public void testMultiplicarErro(){
		assertNotEquals(10, calculadoraTeste.multiplicar(5, 10));
	}
	

	public void testMultiplicarNotNull(){
		assertNotNull(calculadoraTeste.multiplicar(1, 1));
	}
	
	public void testMultiplicarVerifica(){
		assertTrue(calculadoraTeste.multiplicar(5, 5) == 25);
	}
	
	
	
	
	
}
