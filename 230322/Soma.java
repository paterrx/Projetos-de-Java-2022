package teste;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		// declara��o de variaveis
		int valor1, valor2, total;
		Scanner teclado = new Scanner(System.in);
		
		// entrada de dados
		System.out.println("Digite o primeiro valor ");
		valor1 = teclado.nextInt();
		System.out.println("Digite o segundo valor ");
		valor2 = teclado.nextInt();
		
		// processamento de dados
		total = valor1 + valor2;
		
		// sa�da de dados		
		System.out.print("O total � = " + total);
		
	}

}
