import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dias;
		double valor;
		System.out.println("Digite quantos dias você permaneceu no hotel: ");
		dias = teclado.nextInt();
		if (dias>15) {
			valor = dias * 250 + dias * 15.5;
			System.out.println("Esse é o valor a ser pago: " + valor);
		}
		if (dias<15) {
			valor = dias * 250 + dias * 58;
			System.out.println("Esse é o valor a ser pago: " + valor);
		}
		if (dias==15) {
			valor = dias * 250 + dias * 36;
			System.out.println("Esse é o valor a ser pago: " + valor);
		}
		teclado.close();
	}

}
