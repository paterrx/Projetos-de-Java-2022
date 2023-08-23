import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int [] x = new int [5];
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		for (int i = 0 ; i < x.length ; i++) {
			System.out.println("Valor -> ");
			x[i] = teclado.nextInt();
			if (maior<x[i])
				maior = x[i];
			if (menor>x[i])
				menor = x[i];
		}
		System.out.println("O maior valor sera: " + maior);
		System.out.println();
		System.out.println("O menor valor sera: " + menor);
		teclado.close();
	}

}
