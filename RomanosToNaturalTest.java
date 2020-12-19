import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RomanosToNaturalTest
{
   @Test (expected = IllegalArgumentException.class)
   public void letrasinvalidas() 
   {
      String romano = "MRRRSS";
      RomanosToNatural.convierte(romano);
   }

   @Test (expected = IllegalArgumentException.class)
   public void espacioenmedio() 
   {
      String romano = "MMX VIII";
      RomanosToNatural.convierte(romano);
   }
   @Test (expected = IllegalArgumentException.class)
   public void espacioinicio() 
   {
      String romano = " MMXVIII";
      RomanosToNatural.convierte(romano);
   }
   @Test (expected = IllegalArgumentException.class)
   public void espaciofinal() 
   {
      String romano = "MMXVIII ";
      RomanosToNatural.convierte(romano);
   }
   @Test (expected = IllegalArgumentException.class)
   public void elementosminusculas() 
   {
      String romano = "mmxviii";
      RomanosToNatural.convierte(romano);
   }
    // this test passes
   @Test public void validoselement() 
   {
      String romano = "MMXVIII";
      assertEquals("no da 2018", 2018, RomanosToNatural.convierte(romano));
   }
   //test de c1
   @Test (expected = NullPointerException.class)
    public void testForNullElement()
    {
    	String romano =null;
	RomanosToNatural.convierte(romano);
    }
}
