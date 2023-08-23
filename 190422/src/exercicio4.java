import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double x, y;
		System.out.println("Digite o valor de x: ");
		x = teclado.nextDouble();
		
		if (x<=5 && x>=-5) {
			System.out.println("O número de x não pode ser processado pelo computador");
		} else {
			y = 8 / Math.sqrt(Math.pow(x, 2) - 25);
			System.out.println("Esse é o valor de y: " + y);			
		}
		teclado.close();
	}

}
