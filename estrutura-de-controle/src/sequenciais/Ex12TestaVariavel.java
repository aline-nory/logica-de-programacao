/************************************************************************************
 * Mostre o valor de uma variável após a mesma receber a cópia de uma outra variável,
 * modificando o valor desta logo em seguida. 
 * 
 *************************************************************************************/

package sequenciais;

public class Ex12TestaVariavel {
	
	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		
		segundo = primeiro;
		primeiro = 10;
		
		System.out.println(segundo);
	}
}
