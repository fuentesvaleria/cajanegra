import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.lang.IllegalArgumentException;
public class RomanosToNatural
{
  /**
    * C1: String sea distinto de null
    * C2: Que string sea valido IllegalArgumentException
    * 	1. Que pertenezca a las letras dadas
    *	2. letras en mayusculas
    * C3: no tenga espacios en blanco
    *	1.al principio
    *	2.final
    *	3.medias
    */
   enum RomanNumeral {
	    I(1), IV(4), V(5), IX(9), X(10),
	    XL(40), L(50), XC(90), C(100),
	    CD(400), D(500), CM(900), M(1000);

	    private int value;

	    RomanNumeral(int value) {
	        this.value = value;
	    }

	    public int getValue() {
	        return value;
	    }

	    public static List<RomanNumeral> getReverseSortedValues() {
	        return Arrays.stream(values())
	          .sorted(Comparator.comparing((RomanNumeral e) -> e.value).reversed())
	          .collect(Collectors.toList());
	    }
   }
   public static boolean esMayuscula(String s) 
   {
		return s.equals(s.toUpperCase());
   }
   public static int convierte(String s) throws IllegalArgumentException
   {
            if(s == null) throw new NullPointerException("RomanosToNatural.convierte"); //primera c1
            if(!esMayuscula(s)){
                throw new IllegalArgumentException(s + " cannot be converted to a Roman Numeral");
            }
            String romanNumeral = s.toUpperCase();
            int result = 0;

            List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

            int i = 0;

            while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
                RomanNumeral symbol = romanNumerals.get(i);
                if (romanNumeral.startsWith(symbol.name())) {
                    result += symbol.getValue();
                    romanNumeral = romanNumeral.substring(symbol.name().length());
                } else {
                    i++;
                }
            }

            if (romanNumeral.length() > 0) {
                throw new IllegalArgumentException(s + " cannot be converted to a Roman Numeral");
            }

            return result;
   }
}

