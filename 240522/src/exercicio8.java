import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n, y=0;
		System.out.println("Digite o valor inicial. ");
		n = teclado.nextInt();
		do {
			y = y + n / Math.sqrt(n);
		} while (n<0);
		teclado.close();
	}

}
