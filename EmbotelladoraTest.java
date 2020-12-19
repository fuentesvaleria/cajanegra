import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class EmbotelladoraTest
{
	private int pequena, grande, total;
	
	// BLOQUE 1 -->
					//B1_1: Pequeñas es int negativo
	@Test (expected = NoSolution.class)
	public void testForSmallNegativeEntry() throws NoSolution
	{
		pequena = -4;
		grande = 5;
		total = 200;
		Embotelladora.calculaBotellasPequenas(pequena, grande, total);
	}
	
					//B1_2: Grandes es int negativo
	@Test (expected = NoSolution.class)
	public void testForBigNegativeEntry() throws NoSolution
	{
		pequena = 4;
		grande = -5;
		total = 200;
		Embotelladora.calculaBotellasPequenas(pequena, grande, total);
	}
	
					//B1_3: Total es int negativo
	@Test (expected = NoSolution.class)
	public void testForTotalNegativeEntry() throws NoSolution
	{
		pequena = 4;
		grande = 5;
		total = -200;
		Embotelladora.calculaBotellasPequenas(pequena, grande, total);
	}
	
					//B1_4: Pequeñas es int cero
	@Test (expected = NoSolution.class)
	public void testForSmallZeroEntry() throws NoSolution
	{
		pequena = 0;
		grande = 5;
		total = 200;
		Embotelladora.calculaBotellasPequenas(pequena, grande, total);
	}
	
					//B1_5: Total es int cero
	@Test (expected = NoSolution.class)
	public void testForTotalZeroEntry() throws NoSolution
	{
		pequena = 4;
		grande = 5;
		total = 0;
		Embotelladora.calculaBotellasPequenas(pequena, grande, total);
	}
	
	//BLOQUE 2 -->
					//B2_1: Las botellas grandes cubren el total
	@Test public void testForZeroSmallBottles() throws NoSolution
	{
		pequena = 50;
		grande = 40;
		total = 200;
		assertEquals("Zero small bottles", 0, Embotelladora.calculaBotellasPequenas(pequena, grande, total));
	}
	
					//B2_2: No se pueden embotellar todos los litros
	@Test (expected = NoSolution.class)
	public void testForNoSolution() throws NoSolution
	{
		pequena = 50;
		grande = 40;
		total = 1000;
		Embotelladora.calculaBotellasPequenas(pequena, grande, total);
	}
	
					//B2_3: Minimizado el uso de botellas pequeñas
	@Test public void testForSolution() throws NoSolution
	{
		pequena = 50;
		grande = 195;
		total = 1000;
		assertEquals("25 small bottles", 25, Embotelladora.calculaBotellasPequenas(pequena, grande, total));
	}
}
