import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		System.out.println("Digite o primeiro valor: ");
		a = teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = teclado.nextInt();
		System.out.println("Digite o terceiro valor: ");
		c = teclado.nextInt();
		if (a != b && a != c && b != c) {
			if (a<b && a<c)
				System.out.println("Esse � o menor valor: " + a);
			if (b<a && b<c)
				System.out.println("Esse � o menor valor: " + b);
			if (c<a && c<b)
				System.out.println("Esse � o menor valor: " + c);
		}
		else {
			System.out.println("Todos os valores n�o s�o diferentes entre si");
		}
		teclado.close();
	}

}
