/********************************************************************************
 * Faça um programa que lê duas notas parciais de um aluno numa disciplina ao 
 * longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece
 * a tabela abaixo:
 * 		Média de aproveitamento		Conceito
 * 		Entre 9.0 e 10.0			A
 * 		Entre 7.5 e 9.0				B
 * 		Entre 6.0 e 7.5 			C
 * 		Entre 4.0 e 6.0				D
 * 		Entre 4.0 e 0.0				E
 * 
 * O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e 
 * a mensagem "APROVADO" se o conceito for A, B ou C ou "REPROVADO" se o conceito
 * for D ou E.
 ********************************************************************************/

package condicionais;

import java.util.Scanner;

public class MediaDasNotas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a primeira nota: ");
		double nota1 = scan.nextDouble();

		System.out.println("Entre com a segunda nota: ");
		double nota2 = scan.nextDouble();
		scan.close();
		
		double media = (nota1 + nota2)/2;

		String conceito = "";

		if(media >= 9.0 && media <= 10.0) {
			conceito = "A";
		} else if(media >= 7.5 && media < 9.0) {
			conceito = "B";
		} else if(media >= 6.0 && media < 7.5) {
			conceito = "C";
		} else if(media >= 4.00 && media < 6.0) {
			conceito = "D";
		} else if(media >= 0 && media < 4.00) {
			conceito = "E";
		}

		System.out.println("Primeira nota: " + nota1);
		System.out.println("Segunda nota: " + nota2);
		System.out.println("Média: " + media);
		System.out.println("Conceito: " + conceito);

		switch(conceito) {
		case "A":
		case "B":
		case "C": System.out.println("APROVADO!"); break;
		case "D":
		case "E": System.out.println("REPROVADO!"); break;
		}
	}
}
