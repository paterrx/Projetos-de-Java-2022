import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] Temperatura = new double [7];
		String[] dia = {"Domingo","Segunda","Terça", "Quarta", "Quinta", "Sexta" ,"Sabado"};
		
		for(int i = 0 ; i< dia.length ; i++) {
			System.out.print("Temperatura do (a) " +dia[i] + " ");
			Temperatura[i] = teclado.nextDouble();
		}
		for( int i = 0; i < Temperatura.length; i++) {
			System.out.print(String.format("%-7s",dia[i])+ " ");
			for (int j = 1 ; j <= Temperatura[i]; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
		teclado.close();
	}

}