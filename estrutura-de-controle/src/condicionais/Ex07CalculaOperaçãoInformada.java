/*****************************************************************************
 * Fa�a um programa que leia 2 n�meros e em seguida pergunte ao usu�rio qual 
 * opera��o ele deseja realizar. O resultado da opera��o deve ser acompanhado
 * de uma frase que diga se o n�mero �: par ou �mpar; positivo ou negativo.
 *****************************************************************************/
package condicionais;

import java.util.Scanner;

public class Ex07CalculaOpera��oInformada {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero:");
		float num1 = scan.nextInt();

		System.out.println("Entre com o segundo numero:");
		float num2 = scan.nextInt();

		System.out.println("Entre com o operador (+ - / * ):");
		String operador = scan.next();
		
		scan.close();

		double resultado = 0;
		boolean valida = true; //Flag

		switch(operador) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "/": resultado = num1 / num2; break;
		case "*": resultado = num1 * num2; break;
		default:
			System.out.println("Opera��o inv�lida.");
			valida = false;
		} //Vai para a pr�xima etapa apenas se a opera��o for true;

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
				System.out.println("Resultado impar.");
			}
		}		
	}
}
