import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Informe um valor inteiro e positivo ");
			numero = teclado.nextInt();
			if (numero <= 0)
				System.out.println("Valor invalido. ");
		} while (numero<=0);
		for (int cont = -numero ; cont <= numero ; cont++) 
			if (cont != 0 && numero % cont == 0) 
				System.out.println(cont + "\t");
		teclado.close();
	}

}
