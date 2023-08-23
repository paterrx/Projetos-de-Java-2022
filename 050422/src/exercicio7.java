import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double real, dolar, euro;
		System.out.println("Digite o valor em reais: ");
		real = teclado.nextDouble();
		dolar = 4.75 * real;
		euro = 5.22 * real;
		System.out.println("Esse é o valor em dólar: " + dolar);
		System.out.println("Esse é o valor em euro: " + euro);
		teclado.close();
	}

}
