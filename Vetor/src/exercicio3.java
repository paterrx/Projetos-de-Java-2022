import java.util.Random;

public class exercicio3 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int [] x = new int [5];
		int total;
		for (int i = 0 ; i < x.length ; i++) {
			x[i] = gerador.nextInt(1, 50);
			System.out.print(x[i] + " ");
		}
		System.out.println("\n");
		for (int i = 0 ; i <= x.length - 1 ; i++) {
			total = 0;
			for (int j = 1 ; j <= x[i] ; j++) 
				if (x[i] % j == 0)
					total++;
			if (total == 2) 
				System.out.print(x[i] + " ");
		}
	}

}
