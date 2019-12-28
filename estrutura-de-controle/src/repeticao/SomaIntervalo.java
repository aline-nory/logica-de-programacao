package repeticao;

import java.util.Scanner;

public class SomaIntervalo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 0;

		System.out.println("Entre com um número:");
		int primeiroNumero = scan.nextInt();

		System.out.println("Entre com outro número:");
		int segundoNumero = scan.nextInt();

		for(int i = primeiroNumero; i<=segundoNumero; i++) {
			total += i;
		}
		scan.close();
		System.out.println(total);
	}
}
