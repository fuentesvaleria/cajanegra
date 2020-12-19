import java.lang.IllegalArgumentException;

public class Bisiestos {
	
	// @param 	a 					un numero entero positivo
	// @return 	true 				si a es un año bisiesto
	// 			false 				en caso contrario
	// @throws 	InvalidParameter	si a no es un parametro valido
	
	public static boolean esBisiesto(int a) throws IllegalArgumentException {
		
		if(a <= 0){
			throw new IllegalArgumentException ("Year can't be negative or zero");
		}
		
		if((a%4 == 0) && ((a%100 != 0) || (a%400 == 0)))
		{
			return true;
		}
		
		return false;
	}
}
