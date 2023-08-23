package aula290322;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int valor, centena, dezena, unidade, inverso;
		System.out.println("Digite o valor inteiro: ");
		valor = teclado.nextInt();
		centena = valor / 100;
		dezena = valor / 10 % 10;
		unidade = valor % 10;
		inverso = (unidade * 100) + (dezena * 10) + centena;
		System.out.println("O valor invertido é: " + inverso);
		teclado.close();
	}

}
