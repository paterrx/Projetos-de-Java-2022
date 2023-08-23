import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double f, c;
		System.out.println("Digite o valor em celsius: ");
		c = teclado.nextDouble();
		f = 9.0 / 5 * c + 32;
		System.out.println("Esse é o valor em farenheit: " + String.format("%.2f", f));
		teclado.close();
	}

}
