/**********************************************************************************
 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
 * igual ao nome de usuario, monstrando uma mensagem de erro e voltando a pedir as 
 * informações.
 **********************************************************************************/
package repeticao;

import java.util.Scanner;

public class Senha {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean infoValida = false;
		String usuario; 
		String senha;

		do {
			System.out.println("Informe o nome do usuário:");
			usuario = scan.next();

			System.out.println("Informe a senha:");
			senha = scan.next();

			if(usuario.equalsIgnoreCase(senha)) {
				System.out.println("Senha igual ao usuario. Digite novamente.");
			} else {
				infoValida = true;
				System.out.println("Senha e usuários válidos!");
			}
		} while(!infoValida);

		scan.close();
	}
}
