import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double m, c, i;
		int n;
		System.out.println("Digite o capital investido: ");
		c = teclado.nextDouble();
		System.out.println("Digite quantos meses foram investidos: ");
		n = teclado.nextInt();
		System.out.println("Digite a taxa de juros (0 - 100%): ");
		i = teclado.nextDouble();
		m = c * Math.pow(1 + i/100, n);
		System.out.println("Esse é o montante total: " + m);
		teclado.close();
	}

}
