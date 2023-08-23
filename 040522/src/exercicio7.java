import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cargo;
		double salario;
		int tempo;
		System.out.println("Digite o seu cargo na empresa: ");
		cargo = teclado.nextLine();
		System.out.println("Digite o seu salario em reais: ");
		salario = teclado.nextDouble();
		System.out.println("Digite a quanto tempo esta na empresa: (anos)");
		tempo = teclado.nextInt();
		if (!cargo.equalsIgnoreCase("gerente") && !cargo.equalsIgnoreCase("engenheiro") && !cargo.equalsIgnoreCase("tecnico")) {
			salario = salario * 1.05;
			System.out.println("Voce teve um aumento de 5%, seu salario agora e: " + salario);
		} else {
			if (cargo.equalsIgnoreCase("gerente")) {
				if (tempo>=5) {
					salario = salario * 1.10;
					System.out.println("Voce teve um aumento de 10%, seu salario agora e: " + salario);
				}
				else if (tempo<5 && tempo>=3) {
					salario = salario * 1.09;
					System.out.println("Voce teve um aumento de 9%, seu salario agora e: " + salario);
				} else {
					salario = salario * 1.08;
					System.out.println("Voce teve um aumento de 8%, seu salario agora e: " + salario);
				}
			} else if (cargo.equalsIgnoreCase("engenheiro")) {
				if (tempo>=5) {
					salario = salario * 1.11;
					System.out.println("Voce teve um aumento de 11%, seu salario agora e: " + salario);
				} else if (tempo<5 && tempo>=3) {
					salario = salario * 1.10;
					System.out.println("Voce teve um aumento de 10%, seu salario agora e: " + salario);
				} else {
					salario = salario * 1.09;
					System.out.println("Voce teve um aumento de 9%, seu salario agora e: " + salario);
				}
			} else {
				if (tempo>=5) {
					salario = salario * 1.12;
					System.out.println("Voce teve um aumento de 12%, seu salario agora e: " + salario);
				} else if (tempo<5 && tempo>=3) {
					salario = salario * 1.11;
					System.out.println("Voce teve um aumento de 11%, seu salario agora e: " + salario);
				} else {
					salario = salario * 1.10;
					System.out.println("Voce teve um aumento de 10%, seu salario agora e: " + salario);
				}
			}
		}
		teclado.close();
	}

}
