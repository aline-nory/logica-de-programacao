package matrizes;

import java.util.Scanner;

public class Ex03MatrizIrregular {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de pessoas entrevistadas: ");
		int numEntrevistados = scan.nextInt();
		
		String [][] nomesFilhos = new String[numEntrevistados] [];
		
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Entre com a quantidade de filhos");
			int qdtFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String [qdtFilhos];
			
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println("Digite o nome do filho: " + (j+1));
				nomesFilhos[i][j] = scan.next();
			}
		}
		
		for(int i=0; i<nomesFilhos.length; i++) {
			System.out.println("Pessoa " + (i+1) + "tem " + nomesFilhos[i].length + " filhos.");
			for(int j=0; j<nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}

	}

}
