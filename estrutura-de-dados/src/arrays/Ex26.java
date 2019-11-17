package arrays;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		//Criar um array String para colocar a lista.
		String[] gatos = {"PrimeiroGato", "SegundoGato", "TerceiroGato", "QuartoGato"};		
		String[] verbos = {"ignora", "mia para", "brinca com ", "beija"};			
		String[] donos = {"dono1", "dono2", "dono3"};
		
		//Tranformar o comprimento em int para o math.random calcular.
		int gatosLenght = gatos.length;
		int verbosLenght = verbos.length;
		int donosLenght = donos.length;
		
		//Fazer conversao do math.random
		int gatosRand = (int) (Math.random() * gatosLenght);
		int verbosRand = (int) (Math.random() * verbosLenght);
		int donosRand = (int) (Math.random() * donosLenght);
		
		//
		String frase = gatos[gatosRand] + " " + verbos[verbosRand] + " " + donos[donosRand];
				
		System.out.println(frase);
	
	}

}
