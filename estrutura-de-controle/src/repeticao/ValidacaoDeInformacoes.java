/***************************************************************
 * Faça um programa que leia e valide as seguintes informações:
 * 		a) nome: maior que 3 caracteres;
 * 		b) idade: entre 0 e 150;
 * 		c) salario: maior que 0;
 * 		d) sexo: "f" ou "m";
 * 		e) estado civil: "s", "c", "v", "d".
 ****************************************************************/

package repeticao;

import java.util.Scanner;

public class ValidacaoDeInformacoes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infoValida = false; //flag	

		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;

		do {
			System.out.println("Entre com o seu nome completo:");
			nome = scan.nextLine();

			if(nome.length() > 3) {
				infoValida = true;
			}  else {
				infoValida = false;
			}
		} while(!infoValida); 

		infoValida = false;
		do {
			System.out.println("Entre com a sua idade:");
			idade = scan.nextInt();

			if(idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				infoValida = false;
			}	
		} while(!infoValida);

		infoValida = false;
		do {
			System.out.println("Entre com seu salário:");
			salario = scan.nextDouble();

			if(salario > 0) {
				infoValida = true;
			} else {
				infoValida = false;
			}	
		} while(!infoValida);

		infoValida = false;
		do {
			System.out.println("Entre com o seu sexo F/M:");
			sexo = scan.next();

			if(sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")){
				infoValida = true;
			}  else {
				infoValida = false;
			}
		} while(!infoValida);

		infoValida = false;
		do {
			System.out.println("Entre com seu estado civil (s, c, v, d):");
			estadoCivil = scan.next();

			if(estadoCivil.equalsIgnoreCase("s") ||
					estadoCivil.equalsIgnoreCase("c") ||		
					estadoCivil.equalsIgnoreCase("v") ||
					estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			}	
		} while(!infoValida);
		
		scan.close();

		System.out.println("");
		System.out.println("As seguintes informações foram coletadas:");
		System.out.println("Nome: " + nome + ".");
		System.out.println("Idade: " + idade + " anos.");
		System.out.println("Salário: R$ " + salario);

		switch(sexo) {
		case "f": 
		case "F": System.out.println("Sexo: Feminino.");  break;
		case "m": 
		case "M": System.out.println("Sexo: Masculino.");  break;
		}

		switch(estadoCivil) {
		case "s": 
		case "S": System.out.println("Estado civil: Solteiro(a).");  break;
		case "c":
		case "C": System.out.println("Estado civil: Casado(a).");  break;
		case "v": 
		case "V": System.out.println("Estado civil: Viúvo(a)."); break;
		case "d": 
		case "D": System.out.println("Estado civil: Divorciado(a).");  break;
		}

	}
}
