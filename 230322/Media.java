package teste;

import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {

		// declaração de variaveis
		double nota1, nota2, nota3, media;
		Scanner teclado = new Scanner(System.in);
		
		// entrada de dados
		System.out.println("Digite o primeiro valor ");
		nota1 = teclado.nextDouble();
		System.out.println("Digite o segundo valor ");
		nota2 = teclado.nextDouble();
		System.out.println("Digite o terceiro valor ");
		nota3 = teclado.nextDouble();
		
		// processamento de dados
		media = (nota1 + nota2 + nota3) / 3;
		
		// saída de dados		
		System.out.print("A média é = " + media);
		
	}

}
