import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x, y, z;
		System.out.println("Digite o primeiro valor: ");
		x = teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		y = teclado.nextInt();
		if (x<0 || y<0) {
			System.out.println("Um dos valores e um inteiro negativo. ");
		} else {
			z = x * y;
			System.out.println(z);
		}
		teclado.close();
	}

}
