package repeticao;

import java.util.Scanner;

public class Ex16SomaDoIntervaloDosNumeros {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 0;

		System.out.println("Entre com um número:");
		int num1 = scan.nextInt();

		System.out.println("Entre com outro número:");
		int num2 = scan.nextInt();

		for(int i = num1; i<=num2; i++) {
			total += i;
		}
		scan.close();
		System.out.println(total);
	}
}
