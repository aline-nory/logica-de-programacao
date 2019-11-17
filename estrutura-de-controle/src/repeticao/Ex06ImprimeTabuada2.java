package repeticao;

public class Ex06ImprimeTabuada2 {
	public static void main(String[] args) {
		
		for(int multiplicador = 3; multiplicador <= 5; multiplicador++) {
			for(int contador = 0; contador <= 10; contador++) {
				System.out.print(multiplicador * contador);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
