import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double preco, desconto, valor;
		System.out.println("Digite o pre�o do produto: ");
		preco = teclado.nextDouble();
		System.out.println("Digite o desconto: ");
		desconto = teclado.nextDouble();
		valor = preco - preco * desconto/100;
		System.out.println("Esse � o valor final descontado: " + valor);
		teclado.close();
	}

}