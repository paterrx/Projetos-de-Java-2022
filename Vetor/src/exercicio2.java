import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int [] x = new int [5];
		int par = 0;
		for (int i = 0 ; i < x.length ; i++) {
			System.out.println("Valor -> ");
			x[i] = teclado.nextInt();
			if (x[i] % 2 == 0)
				par++;
		}
		System.out.println("Sao: " + par + " numeros pares. ");
		System.out.println();
		System.out.println("Sao: " + (x.length - par) + " numeros impares. ");
		teclado.close();
	}

}
