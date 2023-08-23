import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double n1, n2, cont;
		System.out.println("Digite o valor 1: ");
		n1 = teclado.nextDouble();
		System.out.println("Digite o proximo valor: ");
		n2 = teclado.nextDouble();
		cont = 1;
		while (cont<5) {
			if (n1>n2) {
				System.out.println("Digite o proximo valor: ");
				n2 = teclado.nextDouble();
			} else {
				System.out.println("Digite o proximo valor: ");
				n1 = teclado.nextDouble();
			}
			cont++;
		}
		if (n1>n2) {
			System.out.println("Esse e o maior valor: " + n1);
		} else {
			System.out.println("Esse e o maior valor: " + n2);
		}
		teclado.close();
	}

}
