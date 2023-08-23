import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double total, totalfinal, valoreconomizado;
		
		System.out.println("Total das compras: ");
		total = teclado.nextDouble();
		
			if (total>1000) 
				valoreconomizado = total * 15 / 100;
			else 
				valoreconomizado = total * 8 / 100;
			
		totalfinal = total - valoreconomizado;
		System.out.println("Total a pagar: R$" + totalfinal + "\r\n" + "Valor economizado: R$" + valoreconomizado);
		teclado.close();
	}

}
