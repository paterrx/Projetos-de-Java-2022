package aula290322;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double pre�o, desconto, valor, valorfinal;
		System.out.println("Digite o pre�o do produto: ");
		pre�o = teclado.nextDouble();
		System.out.println("Digite o desconto: ");
		desconto = teclado.nextDouble();
		valor = pre�o * (desconto/100.0);
		valorfinal = pre�o - valor;
		System.out.println("Esse � o valor final descontado: " + valorfinal);
		teclado.close();
	}

}
