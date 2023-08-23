import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b=0, c;
		System.out.println("Digite o fatorial: ");
		a = teclado.nextInt();
		if (a<0) {
			System.out.println("O número digitado é negativo e não pode ser um fatorial. ");
		} else {
			b = a;
			c = a;
			while (c>0) {
				c = c - 1;
				b = b * (c);
			}
			System.out.println(b);
		}
		teclado.close();
	}

}
