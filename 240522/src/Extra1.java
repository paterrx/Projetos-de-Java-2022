import java.util.Scanner;

public class Extra1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int quantidade, cont = 1;
		String nome;
		double altura, peso, imc;
		System.out.println("Qual a quantidade de pacientes? ");
		quantidade = teclado.nextInt();
		while (cont<=quantidade) {
			teclado.nextLine();
			System.out.println("Paciente: " + cont);
			System.out.println("Nome: ");
			nome = teclado.nextLine();
			System.out.println("Altura (em metros): ");
			altura = teclado.nextDouble();
			System.out.println("Peso (em quilos): ");
			peso = teclado.nextDouble();
			imc = peso / (altura * altura);
			System.out.println("imc = " + imc);
			System.out.println("Nome = " + nome);
			cont++;
		}
		teclado.close();
	}

}
