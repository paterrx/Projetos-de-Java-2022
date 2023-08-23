import java.util.Scanner;


public class media {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
			double nota1, nota2, media;
		System.out.print("Digite sua primeira nota: ");
		
			nota1 = teclado.nextDouble();
		
		System.out.print("Digite sua segunda nota: ");
	
			nota2 = teclado.nextDouble();
			media = (nota1+nota2)/2;
		
		System.out.println("Essa é a sua média: " + media);
		
			if (media>=6) 
				System.out.println("Aprovado");
			else 
				System.out.println("Reprovado");
			
		teclado.close();
	}

}
