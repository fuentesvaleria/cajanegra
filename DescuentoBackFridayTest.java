import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.*;

public class DescuentoBackFridayTest
{
	//si un valor es negativo tanto precio como porcentaje 
   @Test (expected = IllegalArgumentException.class)
   public void precioinvalido() 
   {
      double pre = -500.0;
      double des = 30.0;
      int d = 11;
      int m = 05;
      DescuentoBlackFriday.precioFinal(pre,des,d,m);
   }
   @Test (expected = IllegalArgumentException.class)
   public void preciocero() 
   {
      double pre = 0.0;
      double des = 30.0;
      int d = 11;
      int m = 05;
      DescuentoBlackFriday.precioFinal(pre,des,d,m);
   }
   @Test (expected = IllegalArgumentException.class)
   public void porcentajeinvalido() 
   {
      double pre = -500.0;
      double des = 30.0;
      int d = 11;
      int m = 05;
      DescuentoBlackFriday.precioFinal(pre,des,d,m);
   }
   @Test (expected = IllegalArgumentException.class)
   public void porcentajecero() 
   {
      double pre = 500.0;
      double des = 0.0;
      int d = 11;
      int m = 05;
      DescuentoBlackFriday.precioFinal(pre,des,d,m);
   }
   @Test (expected = IllegalArgumentException.class)
   public void porcentajemayorquecien()
   {
      double pre = 500.0;
      double des = 1110.0;
      int d = 11;
      int m = 05;
      DescuentoBlackFriday.precioFinal(pre,des,d,m);
   }
   //fecha distinta 29 de noviembre
   @Test (expected = IllegalArgumentException.class)
   public void fechainvalida()
   {
      double pre = 500.0;
      double des = 30.0;
      int d = 11;
      int m = 05;
      DescuentoBlackFriday.precioFinal(pre,des,d,m);
   }
    // this test passes
   @Test 
   public void validoselement() 
   {
      Double result = DescuentoBlackFriday.precioFinal(100.0,30.0,29,11);
      Double value = 70.0;
      assertEquals(value, result);
   }
}
