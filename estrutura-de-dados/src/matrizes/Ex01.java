package matrizes;

public class Ex01 {

	public static void main(String[] args) {
		
		double [] [] notas = new double[3] [4];
		
		notas [0] [0] = 10;
		notas [0] [1] = 9.5;
		notas [0] [2] = 6;
		notas [0] [3] = 8.5;
		
		notas [1] [0] = 5;
		notas [1] [1] = 7.5;
		notas [1] [2] = 4;
		notas [1] [3] = 6.5;
		
		notas [2] [0] = 9;
		notas [2] [1] = 8.5;
		notas [2] [2] = 7;
		notas [2] [3] = 7.5;

		for(int i=0; i<notas.length; i++) {
			for(int j=0; j<notas[i].length; j++) {
				System.out.print(notas [i] [j] + " - ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Alteração de uma nota");
		notas [1] [3] = 8;

		for(int i=0; i<notas.length; i++) {
			for(int j=0; j<notas[i].length; j++) {
				System.out.print(notas [i] [j] + " - ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Calculando a média");
		
		double soma;
		
		for(int i=0; i<notas.length; i++) {
			soma = 0;
			for(int j=0; j<notas[i].length; j++) {
				soma += notas [i][j];
			}
			System.out.println("Média do aluno " + i + " é = " + (soma/4) );
		}
		
	}
}
