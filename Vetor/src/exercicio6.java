import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int salas;
		double AlunosAcima = 0;
		double mediatotal = 0;
		System.out.println("Digite quantas salas serao analisadas. ");
		salas = teclado.nextInt();
		System.out.println();
		for (int cont = 1 ; cont <= salas ; cont++) {
			System.out.println("Digite quantos alunos estao na sala. #" + cont);
			int [] media = new int [teclado.nextInt()];
			System.out.println();
			for (int cont2 = 0 ; cont2 < media.length ; cont2++) {
				System.out.println("Digite a media final do aluno. #" + (cont2+1));
				media[cont2] = teclado.nextInt();
				System.out.println();
				mediatotal += media[cont2];
			}
			mediatotal = mediatotal / media.length;
			for (int cont2 = 0 ; cont2 < media.length ; cont2++) 
				if (media[cont2] > mediatotal)
					AlunosAcima++;
			AlunosAcima = AlunosAcima * 100 / media.length;
			System.out.println("Essa e a porcentagem de alunos acima da media da sala: " 
			+ String.format("%.3f", AlunosAcima) + "%. ");
			System.out.println();
			mediatotal = 0;
			AlunosAcima = 0;
		}
		teclado.close();
	}

}
