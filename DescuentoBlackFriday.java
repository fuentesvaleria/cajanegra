import java.util.*;
import java.lang.IllegalArgumentException;
public class DescuentoBlackFriday
{
    /**
    * @param precioOriginal es el precio de un producto marcado en la etiqueta
    * PorcentajeDecuento es el decuento a aplicar expresado como un porcentaje.
    * agregamos  el paramentro dia y mes para sabes si es 29 de noviembre 29/11
    * @return el preciofinal teniendo en cuenta que si es black fridau se aplica 
    * el decuento
    * @throws illegalArgumentException si precioOriginal es negativo o el porcentaje es negativo
    */
    public static double precioFinal(double precioOriginal, double porcentajeDescuento, int dia , int mes) throws IllegalArgumentException{
    	double preciof;
	double aux;
	if(dia !=  29){
		  throw new IllegalArgumentException(dia + " no es black friday");
	}
	if(mes !=  11){
		  throw new IllegalArgumentException(mes + " no es black fridayl");
	}
	if(precioOriginal<=0.0){
                throw new IllegalArgumentException(precioOriginal + " introducido mal precio orginal");
        }
        if(porcentajeDescuento<=0.0){
                throw new IllegalArgumentException(porcentajeDescuento + " introducido mal el porcentaje");
        }
        if(porcentajeDescuento>100.0){
                throw new IllegalArgumentException(porcentajeDescuento + " introducido mal el porcentaje");
        }
	aux = (precioOriginal*(porcentajeDescuento/100.0));
	preciof = precioOriginal - aux;
	return preciof;
    }
}

