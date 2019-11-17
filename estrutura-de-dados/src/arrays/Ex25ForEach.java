package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ex25ForEach {

	public static void main(String[] args) {

		Random numeroRandom = new Random();

		System.out.println("Imprime todos os elementos pares da lista!");
		List<Integer> list = Arrays.asList(numeroRandom.nextInt(100));
		list.forEach(n -> {
		       if (n % 2 == 0) {
		             System.out.println(n);
		       }   else {
		    	   System.out.println("é impar.");
		       }
		});

	}
}


