import java.util.Scanner;

public class exercicio11v2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, divisores=0;
		do {
			System.out.println("Informe um valor inteiro e positivo ");
			numero = teclado.nextInt();
			if (numero <= 0)
				System.out.println("Valor invalido. ");
		} while (numero<=0);
		for (int cont = 2 ; cont < numero ; cont++) 
			if (numero % cont == 0) {
				divisores++;
				break;
			}
		if (divisores==0)
			System.out.println("Este numero e primo. ");
		else
			System.out.println("Este numero nao e primo. ");
		teclado.close();
	}

}
