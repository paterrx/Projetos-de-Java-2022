import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nome;
		int idade;
		System.out.println("Digite a sua idade");
		idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Digite o seu nome");
		nome = teclado.nextLine();
		teclado.close();
	}

}
