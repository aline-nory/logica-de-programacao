/**
 * Agenda da Aline:
 * 
 * O programa deve indicar o dia do mes atraves de um menu
 * cada dia tem 24h
 * fun��o de consultar a agenda o dia e a hora
 * fun��o de inserir
 * 
 */


package matrizes;

import java.util.Scanner;

public class Ex07Agenda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] compromissos = new String[31][24];
		
		boolean sair = false;
		int opcao; //poderia ser um byte tbm
		while(!sair) {
			
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para consultar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			opcao = scan.nextInt();
			
			if(opcao == 1) { //adicionar
				
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido) {
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
				while(!horaValida) {
					System.out.println("Entre com o hora do compromisso.");
					hora = scan.nextInt();
					if(hora > 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inv�lido. Digite novamente.");
					}
				}
				
				dia--; //Pq se vc quer acessar a pos 20 na vdd vc quer a pos 19.
				System.out.println("Digite o compromisso.");
				compromissos [dia][hora] = scan.next();
				
			} else if(opcao == 2) { //consultar
				
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido) {
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
				while(!horaValida) {
					System.out.println("Entre com o hora do compromisso.");
					hora = scan.nextInt();
					if(hora > 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inv�lido. Digite novamente.");
					}
				}
				
				dia--; 
				System.out.println("O compromisso agendado � ");
				System.out.println(compromissos [dia][hora]);
				
			}else if(opcao == 0) {
				sair = true;
			}else {
				System.out.println("Op��o inv�lida. Digite novamente.");
			}
		}
		
		
	}

}
