/*****************************************************************************
 * Fa�a um programa que imprima na tela apenas os n�meros �mpares de 1 a 50.
 *****************************************************************************/
package repeticao;

public class Ex03ImprimeNumerosImpares {
	public static void main(String[] args) {
		for(int i = 1; i<50; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
