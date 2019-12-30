package arrays;

public class Ex26 {
	public static void main(String[] args) {

		String[] gatos = {"PrimeiroGato", "SegundoGato", "TerceiroGato", "QuartoGato"};		
		String[] verbos = {"ignora", "mia para", "brinca com ", "arranha"};			
		String[] donos = {"o dono1", "o dono2", "o dono3"};
		
		//Transformar o comprimento em int para o math.random calcular.
		int gatosLenght = gatos.length;
		int verbosLenght = verbos.length;
		int donosLenght = donos.length;
		
		//Fazer a conversao do math.random
		int gatosRand = (int) (Math.random() * gatosLenght);
		int verbosRand = (int) (Math.random() * verbosLenght);
		int donosRand = (int) (Math.random() * donosLenght);

		String frase = gatos[gatosRand] + " " + verbos[verbosRand] + " " + donos[donosRand];
				
		System.out.println(frase);	
	}
}
