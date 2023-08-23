import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c, resposta;
		do {
			System.out.println("Digite o valor: ");
			a = teclado.nextInt();
			b = a * 10;
			c = a;
			System.out.println("0");
			System.out.println(a);
			while (b>a) {
				a = c + a;
				System.out.println(a);
			}
			System.out.println("\nVoce deseja repetir o codigo? (1=sim ou 2=nao)");
			resposta = teclado.nextInt();
		} while(resposta==1);
		teclado.close();
	}

}
