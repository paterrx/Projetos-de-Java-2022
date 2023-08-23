import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			double prova1, prova2, trabalho1, trabalho2, trabalho3, media;
			
		System.out.println("Digite a nota da sua primeira prova: ");
			prova1 = teclado.nextDouble();
			
		System.out.println("Digite a nota da sua segunda prova: ");
			prova2 = teclado.nextDouble();
			
		System.out.println("Digite a nota do seu primeiro trabalho: ");
			trabalho1 = teclado.nextDouble();
			
		System.out.println("Digite a nota do seu segundo trabalho: ");
			trabalho2 = teclado.nextDouble();
			
		System.out.println("Digite a nota do seu terceiro trabalho: ");
			trabalho3 = teclado.nextDouble();
			media = (prova1+prova2)/100*70 + (trabalho1+trabalho2+trabalho3)/100*30;
		System.out.println("A sua média é: " + media);
			if (media>=6) 
				System.out.println("Aprovado");
			else 
				System.out.println("Reprovado");
		teclado.close();
	}

}
