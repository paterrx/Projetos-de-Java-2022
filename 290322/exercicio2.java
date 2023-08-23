package aula290322;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double preço, desconto, valor, valorfinal;
		System.out.println("Digite o preço do produto: ");
		preço = teclado.nextDouble();
		System.out.println("Digite o desconto: ");
		desconto = teclado.nextDouble();
		valor = preço * (desconto/100.0);
		valorfinal = preço - valor;
		System.out.println("Esse é o valor final descontado: " + valorfinal);
		teclado.close();
	}

}
