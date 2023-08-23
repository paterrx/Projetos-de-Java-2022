import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cont;
		double renda, cpf, salario, dependentes, ir=0;
		System.out.println("Quantas pessoas serao analisadas o IR? ");
		cont = teclado.nextInt();
		if (cont<=0) {
			System.out.println("Voce digitou um numero de pessoas invalido. ");
		} else {
			System.out.println("Digite o salario minimo atual: ");
			salario = teclado.nextDouble();
			do {
				System.out.println("Digite o seu cpf: (apenas numeros)");
				cpf = teclado.nextDouble();
				System.out.println("Digite o seu numero de dependentes: ");
				dependentes = teclado.nextDouble();
				System.out.println("Digite a sua renda mensal: ");
				renda = teclado.nextDouble();
				dependentes = salario * (dependentes / 100 + 1) - salario;
				renda = renda - dependentes;
				if (renda<2*salario) {
					ir = 0;
				} else if (renda<3*salario) {
					ir = renda * 5 / 100;
				} else if (renda<5*salario) {
					ir = renda * 10 / 100;
				} else if (renda<7*salario) {
					ir = renda * 15 / 100;
				} else {
					ir = renda * 20 / 100;
				}
				System.out.println("Voce deve pagar uma aliquota equivalente a: " + String.format("%.2f", ir));
				System.out.println("CPF: " + cpf);
				System.out.println();
				cont--;
			} while (cont>0);
		}
		teclado.close();
	}

}
