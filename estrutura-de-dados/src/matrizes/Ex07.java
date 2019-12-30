package matrizes;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][][] compromissos = new String[12][31][8]; 

		boolean sair = false;
		int opcao;	
		while(!sair){

			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para consultar compromisso.");
			System.out.println("Digite 0 para sair.");

			opcao = scan.nextInt();

			if(opcao == 1) {

				boolean mesValido = false;
				int mes = 0;
				while(!mesValido){
					System.out.println("Entre com o m�s.");
					mes = scan.nextInt();
					if(mes > 0 && mes <= 12) {
						mesValido = true;
					}else {
						System.out.println("M�s inv�lido. Digite novamente.");
					}
				}

				boolean diaValido = false;
				int dia = 0;
				while(!diaValido){
					System.out.println("Entre com o dia do m�s.");
					dia = scan.nextInt();
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido. Digite novamente.");
					}
				}

				boolean horaValida = false;
				int hora = 0;
				while(!horaValida){
					System.out.println("Entre com a hora.");
					hora = scan.nextInt();
					if(hora > 0 && hora <= 8) {
						horaValida = true;
					} else {
						System.out.println("Hora inv�lida. Digite novamente.");
					}
				}	

				dia--;
				mes--;
				System.out.println("Digite o compromisso.");
				compromissos [mes][dia][hora] = scan.next();	

			}  else if(opcao == 2) {

				boolean mesValido = false;
				int mes = 0;
				while(!mesValido){
					System.out.println("Entre com o m�s.");
					mes = scan.nextInt();
					if(mes > 0 && mes <= 12) {
						mesValido = true;
					}else {
						System.out.println("M�s inv�lido. Digite novamente.");
					}
				}

				boolean diaValido = false;
				int dia = 0;
				while(!diaValido){
					System.out.println("Entre com o dia do m�s.");
					dia = scan.nextInt();
					if(dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido. Digite novamente.");
					}
				}

				boolean horaValida = false;
				int hora = 0;
				while(!horaValida){
					System.out.println("Entre com a hora.");
					hora = scan.nextInt();
					if(hora > 0 && hora <= 8) {
						horaValida = true;
					} else {
						System.out.println("Hora inv�lida. Digite novamente.");
					}
				}	

				dia--;
				mes--;
				System.out.println("Digite o compromisso.");
				System.out.println(compromissos[mes][dia][hora]);	

			}else if(opcao == 0) {
				sair = true;
			}else {
				System.out.println("Op��o inv�lida. Digite novamente.");
			}
		}
		scan.close();
	}
}









