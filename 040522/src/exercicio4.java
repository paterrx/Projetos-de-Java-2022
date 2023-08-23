import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a, b, c, delta, x1;
		System.out.println("Digite o valor de a: ");
		a = teclado.nextDouble();
		if (a==0) {
			System.out.println("Essa não é uma equação de segundo grau");
		}
		else {
			System.out.println("Digite o valor de b: ");
			b = teclado.nextDouble();
			System.out.println("Digite o valor de c: ");
			c = teclado.nextDouble();
			delta = b * b - 4 * a * c;
		if (delta>=0) {
			x1 = (-b + Math.sqrt(delta))/(2*a);
			System.out.println("Essas são as raízes da equação: ");
			System.out.println(x1);
			x1 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println(x1);
		}
		if (delta<0)
			System.out.println("Essa equação não tem raiz real");
		}
		teclado.close();
	}

}
