import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b;
		System.out.println("Digite o primeiro valor: ");
		a = teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = teclado.nextInt();
		if (b<a) {
			System.out.println("O segundo valor nao e menor que o primeiro. ");
		} else {
			if (a<0 || b<0) {
				System.out.println("Um dos valores ou ambos sao negativos. ");
			} else {
				System.out.println(a);
				while (a<b) {
					a = a + 1;
					System.out.println(a);				
				}
			}
		}
		teclado.close();
	}

}
