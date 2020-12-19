public class Embotelladora {
	// @param 			pequenas: número de botellas en almacén de 1L
	// 					grandes : número de botellas en almacén de 5L
	//					total 	: número total de litros que hay que embotellar
	// @return			número de botellas pequeñas necesarias para embotellar el total de lı́quido, teniendo
	//					en cuenta que hay que minimizar el número de botellas pequeñas: primero
	//					se rellenan las grandes
	// @throws			NoSolution si no es posible embotellar todo el lı́quido
	
	public static int calculaBotellasPequenas(int pequenas, int grandes, int total) throws NoSolution {
		int contador;
		int Litros_G = 5;
		
		if(pequenas <= 0 || total <= 0 || grandes < 0){
			throw new NoSolution ("Invalid parameters");
		} //Grandes si pueden ser cero porque son un dato extra que no devolvemos
		
		contador = total - Litros_G*grandes;

		if(contador < 0){
			return 0;
		}
		
		if(contador > pequenas){
			throw new NoSolution ("There aren't solutions");
		}
		return contador;
	}
}
