import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BisiestosTest
{
	private int a;
	
	/* CARACTERIZACIONES:
	 * BLOQUE 1 --> 
	 * 				B1: Las entradas solo son int positivos
	 * 					B1_1: La entrada es un int negativo
	 * 					B1_2: La entrada es int cero
	 * 					B1_3: La entrada es un int positivo
	 * 
	 * BLOQUE 2 -->
	 * 				B2: Las entradas son múltiplos de 4
	 * 					B2_1: No es múltiplo de 4
	 * 					B2_2: Es múltiplo de 4
	 * 
	 * BLOQUE 3 -->
	 * 				B3: Las entradas son múltiplos de 100
	 * 					B3_1: No es múltiplo de 100
	 * 					B3_2: Es múltiplo de 100
	 * 
	 * BLOQUE 4 -->
	 * 				B4: Las entradas son múltiplos de 400
	 * 					B4_1: No es múltiplo de 400
	 * 					B4_2: Es múltiplo de 400
	 * 
	 * BLOQUE 5 -->
	 * 				B5: No todos los años terminados en 00 son bisiestos
	 * 			(Que sean múltiplos de 4 no significa que sean bisiestos)
	 * 					B5_1: No es bisiesto
	 * 					B5_2: Es bisiesto
	 * 
	 * BLOQUE 6 -->
	 * 				B6: Los años no múltiples de 100 pero si de 4 son bisiestos
	 * 					B6_1: Es bisiesto
	  
	 */
	
	// BLOQUE 1
					// B1_1
	@Test (expected = IllegalArgumentException.class)
	public void testForNegativeEntry()
	{
		Bisiestos.esBisiesto(-2020);
	}
	
					// B1_2
	@Test (expected = IllegalArgumentException.class)
	public void testForZeroEntry()
	{
		Bisiestos.esBisiesto(0);
	}
	
					// B1_3
	@Test public void testForPositiveEntry()
	{
      assertEquals("Positive entry", true, Bisiestos.esBisiesto(2020));
	}
	
	// BLOQUE 2
					// B2_1
	@Test public void testFornon4Multiple()
	{
      assertEquals("Is not a multiple of four", false, Bisiestos.esBisiesto(2001));
	}
	
					// B2_2
	@Test public void testFor4Multiple()
	{
      assertEquals("Is a multiple of four", true, Bisiestos.esBisiesto(2020));
	}
	
	// BLOQUE 3
					// B3_1
	@Test public void testFornon100Multiple()
	{
      assertEquals("Is not a multiple of one hundred", false, Bisiestos.esBisiesto(2001));
	}
	
					// B3_2
	@Test public void testFor100Multiple()
	{
      assertEquals("Is a multiple of one hundred", true, Bisiestos.esBisiesto(2000));
	}
	
	// BLOQUE 4
					// B4_1
	@Test public void testFornon400Multiple()
	{
      assertEquals("Is not a multiple of four hundred", false, Bisiestos.esBisiesto(2001));
	}
	
					// B4_2
	@Test public void testFor400Multiple()
	{
      assertEquals("Is a multiple of four hundred", true, Bisiestos.esBisiesto(2000));
	}
	
	// BLOQUE 5
					// B5_1
	@Test public void testFor00nonLeapYear()
	{
      assertEquals("00 year is not leap year", false, Bisiestos.esBisiesto(1900));
	}
	
					// B5_2
	@Test public void testFor00LeapYear()
	{
      assertEquals("00 year is leap year", true, Bisiestos.esBisiesto(2000));
	}
	
	// BLOQUE 6
					// B6_1
	@Test public void testFornon100Mul4MulLY()
	{
      assertEquals("Is leap year", true, Bisiestos.esBisiesto(2024));
	}
}
