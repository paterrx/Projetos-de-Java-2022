import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double [] temp = new double [7];
		String [] dia = {"Domingo", "Segunda" , "Terca" , "Quarta" , "Quinta" , "Sexta" , "Sabado" };
		double media=0;
		for (int cont = 0 ; cont < temp.length ; cont++) {
			System.out.println("Digite a temperatura máxima de " + dia[cont] + ": ");
			temp[cont] = teclado.nextDouble();
			System.out.println();
			media += temp[cont];
		}
		media = media / temp.length;
		for (int cont = 0 ; cont < temp.length ; cont++) {
			if (temp[cont] > media) {
				System.out.println("Dia: " + dia[cont] + ". ");
				System.out.println();
			}
		}
		teclado.close();
	}

}
