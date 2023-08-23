import java.util.Random;

public class exercicio9 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int [] x = new int [10];
		int aux;
		System.out.println("Antes de Ordenar");
		for (int i = 0 ; i < x.length ; i++) {
			x[i] = gerador.nextInt(10);
			System.out.print(x[i] + ". ");
		}
		for (int j = 0 ; j <= x.length ; j++) 
			for (int i = 0 ; i < x.length - 1; i++) 
				if (x[i] > x[i+1] && i < 9) {
					aux = x[i];
					x[i] = x[i+1];
					x[i+1] = aux;
				} 		
		System.out.println("\n\nDepois de Ordenar");
		for (int i = 0 ; i < x.length ; i++) 
			System.out.print(x[i] + ". ");
	}

}
