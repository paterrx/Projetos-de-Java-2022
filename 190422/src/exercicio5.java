import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double lado1, lado2, lado3;
		System.out.println("Digite o primeiro valor: ");
		lado1 = teclado.nextDouble();
		System.out.println("Digite o segundo valor: ");
		lado2 = teclado.nextDouble();
		System.out.println("Digite o terceiro valor");
		lado3 = teclado.nextDouble();
		if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
			System.out.println("Este é um triângulo");
		} else {
			System.out.println("Esse não é um triângulo");
		}
		teclado.close();
	}

}
