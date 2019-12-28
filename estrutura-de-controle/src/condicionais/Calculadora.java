/*****************************************************************************
 * Faça um programa que leia 2 números e em seguida pergunte ao usuário qual 
 * operação ele deseja realizar. O resultado da operação deve ser acompanhado
 * de uma frase que diga se o número é: par ou ímpar; positivo ou negativo.
 *****************************************************************************/
package condicionais;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero:");
		float primeiroNumero = scan.nextInt();

		System.out.println("Entre com o segundo numero:");
		float segundoNumero = scan.nextInt();

		System.out.println("Entre com o operador (+ - / * ):");
		String operador = scan.next();
		
		scan.close();

		double resultado = 0;
		boolean valida = true;

		switch(operador) {
		case "+": resultado = primeiroNumero + segundoNumero; break;
		case "-": resultado = primeiroNumero - segundoNumero; break;
		case "/": resultado = primeiroNumero / segundoNumero; break;
		case "*": resultado = primeiroNumero * segundoNumero; break;
		default:
			System.out.println("Operação inválida.");
			valida = false;
		}

		if(valida) {
			System.out.println("Resultado: " + resultado);
			if(resultado >= 0) {
				System.out.println("Resultado positivo.");
			} else {
				System.out.println("Resultado negativo.");
			}
			if(resultado % 2 == 0) { 
				System.out.println("Resultado par.");
			} else {
				System.out.println("Resultado ímpar.");
			}
		}		
	}
}
