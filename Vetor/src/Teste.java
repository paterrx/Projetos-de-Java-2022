import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int [] x = new int [5];
		for (int i = 0 ; i < x.length ; i++) {
			System.out.println("Valor -> ");
			x[i] = teclado.nextInt();
		}
		teclado.close();
	}

}
