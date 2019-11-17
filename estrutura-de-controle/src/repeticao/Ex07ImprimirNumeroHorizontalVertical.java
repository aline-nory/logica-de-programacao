/****************************************************
 * Faça um programa que imprima na tela os numeros 
 * de 1 a 20 um abaixo do outro e depois imprima um
 * ao lado do outro.
 ****************************************************/

package repeticao;

public class Ex07ImprimirNumeroHorizontalVertical {
	public static void main(String[] args) {
		for(int i = 1; i <= 20 ; i++) {
			//System.out.println(i); //Vertical
			System.out.print(i + " "); //Horizontal
		}
	}
}
