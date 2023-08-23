import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome, genero;
		double altura, peso;
		System.out.println("Digite o seu nome");
		nome = teclado.nextLine();
		System.out.println("Digite o seu genero (masculino ou feminino)");
		genero = teclado.next();
		if (!genero.equalsIgnoreCase("masculino") && !genero.equalsIgnoreCase("feminino"))
			System.out.println("Esse não é um genero valido");
		else {
			System.out.println("Digite a sua altura em metros");
			altura = teclado.nextDouble();
			if (genero.equalsIgnoreCase("masculino")) 
				peso = 72.7 * altura - 58;
			else 
				peso = 62.1 * altura - 44.7;
			System.out.println("Esse é o seu peso ideal: " + peso);
			System.out.println("Esse é o seu nome: " + nome);
		}
		teclado.close();
	}

}
