package repeticao;

public class Ex17TecnicaDeGauss {
	public static void main(String[] args) {

		System.out.println("Imprima a soma de 1 até 10.");

		int resultado = 0;
		for (int numero = 0; numero <= 10; numero++) {
			resultado += numero;			
		}
		System.out.println(resultado);

		System.out.println();
		System.out.println("Técnica de Gauss");
		int total = ((1 + 10) * 10) / 2;
		System.out.println(total);

		double var = 5000;
		var = var - (var * 0.85);
		System.out.println(var);
	}
}


