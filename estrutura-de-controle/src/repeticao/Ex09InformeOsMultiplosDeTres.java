/*********************************************************
 * Fa�a um programa que imprima os m�ltiplos de 3 at� 100.
 *********************************************************/
package repeticao;

public class Ex09InformeOsMultiplosDeTres {
	public static void main(String[] args) {
		for(int multiplo = 1; multiplo < 100; multiplo++) {
			if(multiplo % 3 == 0) {
				System.out.println(multiplo);
			}
		}
	}
}




