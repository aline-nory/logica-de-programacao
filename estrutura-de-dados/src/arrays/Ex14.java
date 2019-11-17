package arrays;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[5];
		
		for(int i=0; i<idades.length; i++) {
			System.out.println("Entre com a idade");
			idades[i] = scan.nextInt();		
		}
		
		//A MANEIRA IDEAL É USAR A POSIÇÃO DO ARRAY
		int maiorIdade = idades[0];
		int indexMaior = 0;
		int menorIdade = idades[0];
		int indexMenor = 0;
		
		for(int i=1; i<idades.length; i++) {
			if(idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				indexMaior = i;
			} else if (idades[i] < menorIdade) {
				menorIdade = idades[i];
				indexMenor = i;
			}
	    }
		
		System.out.println();
		System.out.println("Maior idade: " + maiorIdade);
		System.out.println("Indíce maior idade: " + indexMaior);
		System.out.println("Menor idade: " + menorIdade);
		System.out.println("Indíce menor idade: " + indexMenor);
		
//		int maiorIdade = Integer.MIN_VALUE;
//		int menorIdade = Integer.MAX_VALUE;
//		
//		for(int i=0; i<idades.length; i++) {
//			if(idades[i] > maiorIdade) {
//				maiorIdade = idades[i];
//			} else if (idades[i] < menorIdade) {
//				menorIdade = idades[i];
//			}
//		}
		


	}

}
