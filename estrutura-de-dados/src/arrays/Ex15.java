/*
 * Ler as duas notas bimestrais para um conjunto de 10 alunos.
 * 
 * Armazenar as notas informadas em dois vetores "Nota1" e "Nota2"
 * do tipo real.
 * 
 * Escreva um programa que calcule a média aritmetica simples
 * das notas informadas armazenando o resultado em um vetor "Result"
 * do mesmo tipo e tamanho.
 * 
 * Ao mostrar os resultados exibir a situação de cada aluno. 
 * Se a média calculada for superior ou igual a 7 o aluno estará 
 * aprovado, caso contrário a situação do aluno será reprovada.
 * 
 */

package arrays;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] primeiraNota = new double[5];
		double[] segundaNota = new double[primeiraNota.length];
		double[] resultado = new double[primeiraNota.length];
		
		for(int i=0; i<primeiraNota.length; i++) {		
			System.out.println("Entre a nota 1 do aluno " + (i+1));
			primeiraNota[i] = scan.nextDouble();	
			
			System.out.println("Entre a nota 2 do aluno " + (i+1));
			segundaNota[i] = scan.nextDouble();	
			
			resultado[i] = (primeiraNota[i] + segundaNota[i]) / 2;
		}
			
		System.out.println();
		System.out.print("Notas 1 = ");
		for(int i=0; i<primeiraNota.length; i++) {
			System.out.print(primeiraNota[i] + " / ");
		}
		
		System.out.println();
		System.out.print("Notas 2 = ");
		for(int i=0; i<segundaNota.length; i++) {
			System.out.print(segundaNota[i] + " / ");
		}
			
		System.out.println();
		System.out.println("Resultados = ");
		for(int i=0; i<resultado.length; i++) {			
			if(resultado[i] >= 7){
				System.out.println("Média do aluno " + (i+1) + ": "
						+ "Nota " + resultado[i] + " - APROVADO");
				} else {
				System.out.println("Média do aluno " + (i+1) + ": "
						+ "Nota " + resultado[i] + " - REPROVADO");
				}
		}
		scan.close();
	}
}


