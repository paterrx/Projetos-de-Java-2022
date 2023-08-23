import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor, cont=1, fatorial=1;
		do {
			System.out.println("Digite um numero inteiro e positivo: ");
			valor = teclado.nextInt();	
			if (valor < 0) {
				System.out.println("Informe outro valor. ");
			}
		} while (valor < 0);
		while (cont<=valor) {
			fatorial = fatorial * cont;
			cont++;
		}
		System.out.println(fatorial);
		teclado.close();
	}

}
