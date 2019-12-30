package arrays;

public class Ex17 {
	public static void main(String[] args) {	
		int[] vetorA = new int[10];
		int qtd0 = 0;
		int qtd1 = 0;
		
		for(int i=0; i<vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 1);		
			if(vetorA[i] == 1) {
				qtd0++;
			} else {
				qtd1++;
			}			
		}
		
		double porc0 = (qtd0 * 100) / vetorA.length;
		double porc1 = 100 - porc0;
		
		System.out.println();
		System.out.println("Vetor A: ");
		for(int i=0; i<vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("Porcentagem de 0: " + porc0 + "%");
		System.out.println();
		System.out.println("Porcentagem de 1: " + porc1 + "%");
	}
}
