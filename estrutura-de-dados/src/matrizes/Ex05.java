package matrizes;

import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		
		Random numeroRandom = new Random();

		int[][] matrizM = new int[10][10];

		for(int i=0;i<matrizM.length; i++) {
			for(int j=0; j<matrizM.length; j++) {
				matrizM[i][j] = numeroRandom.nextInt(100);
			}
		}
		
		for(int i=0;i<matrizM.length; i++) {
			for(int j=0; j<matrizM.length; j++) {
				System.out.print(matrizM[i][j] + " - ");
			}
			System.out.println();
		}
		
		int maiorL5 = Integer.MIN_VALUE;
		int menorL5 = Integer.MAX_VALUE;
		int linha5 = 0;
		for(int i=0; i<matrizM[linha5].length; i++) {
			if(matrizM[linha5][i] > maiorL5) {
				maiorL5 = matrizM[linha5][i];
			}
			if(matrizM[linha5][i] < menorL5) {
				menorL5 = matrizM[linha5][i];
			}	
		}
		
		int maiorcol7 = Integer.MIN_VALUE;
		int menorcol7 = Integer.MAX_VALUE;
		int col7 = 0;
		for(int i=0; i<matrizM.length; i++) {
			if(matrizM[i][col7] > maiorcol7) {
				maiorcol7 = matrizM[i][col7];
			}
			if(matrizM[i][col7] < menorcol7) {
				menorcol7 = matrizM[i][col7];
			}	
		}

		System.out.println();
		System.out.println("Maior da linha 5: " + maiorL5);
		System.out.println("Menor da linha 5: " + menorL5);
		System.out.println("Maior da coluna 7: " + maiorcol7);
		System.out.println("Menor da coluna 7: " + menorcol7);
		
	}

}
