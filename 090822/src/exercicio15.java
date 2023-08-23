import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double y = 0;
		int n, fat = 1;
		System.out.println("Valor de n (inteiro e positivo) -> ");
		n = teclado.nextInt();
		for (int cont = 1 ; cont <= n ; cont++) {
			fat = fat * cont;
			y = y + (double) cont / fat;
		}
		System.out.println("Valor de y -> " + String.format("%.2f", y));
		teclado.close();
	}

}
