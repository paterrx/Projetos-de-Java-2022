import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double y = 0;
		int n;
		System.out.println("Valor de n (inteiro e positivo) -> ");
		n = teclado.nextInt();
		for (int cont = 1 ; cont <= n ; cont++) {
			if (cont % 2 == 0) 
				y = y - 1.0 / cont; 
			else 
				y = y + 1.0 / cont;
		}
		System.out.println("Valor de y -> " + String.format("%.2f", y));
		teclado.close();
	}

}
