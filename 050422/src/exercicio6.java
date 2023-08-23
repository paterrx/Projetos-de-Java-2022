import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int binario, unidade, dezena, centena, milhar, dmilhar, cmilhar, bilhar, dbilhar, cbilhar, trilhar;
		double decimal;
		System.out.print("Digite o valor em binário: ");
		binario  = teclado.nextInt();
			
//			cquintilhar = (int) (binario / (1 * Math.pow(10, 17))     );
//			dquintilhar = (int) (binario / (1 * Math.pow(10, 16)) % 10);
//			quintilhar  = (int) (binario / (1 * Math.pow(10, 15)) % 10);
//			cquadrilhar = (int) (binario / (1 * Math.pow(10, 14)) % 10);
//			dquadrilhar = (int) (binario / (1 * Math.pow(10, 13)) % 10);
//			quadrilhar  = (int) (binario / (1 * Math.pow(10, 12)) % 10);
//			ctrilhar    = (int) (binario / (1 * Math.pow(10, 11)) % 10);
//			dtrilhar    = (int) (binario / (1 * Math.pow(10, 10)) % 10);
			trilhar     = (int) (binario / (1 * Math.pow(10, 9 )) % 10);
			cbilhar     = (int) (binario / (1 * Math.pow(10, 8 )) % 10);
			dbilhar     = (int) (binario / (1 * Math.pow(10, 7 )) % 10);
			bilhar      = (int) (binario / (1 * Math.pow(10, 6 )) % 10);
			cmilhar     = (int) (binario / (1 * Math.pow(10, 5 )) % 10);
			dmilhar     = (int) (binario / (1 * Math.pow(10, 4 )) % 10);
			milhar      = (int) (binario / (1 * Math.pow(10, 3 )) % 10);
			centena     = (int) (binario / (1 * Math.pow(10, 2 )) % 10);
			dezena      = (int) (binario / (1 * Math.pow(10, 1 )) % 10);
			unidade     = binario % 10;
		
		decimal = trilhar * Math.pow(2, 9) + cbilhar * Math.pow(2, 8) + dbilhar * Math.pow(2, 7) + bilhar * Math.pow(2, 6) + cmilhar * 		Math.pow(2, 5) + dmilhar * Math.pow(2, 4) + milhar * Math.pow(2, 3) + centena * Math.pow(2, 2) + dezena * Math.pow(2, 1) + unidade 		* Math.pow(2, 0);
		
		System.out.print("Esse é o valor em decimal: " + decimal);
		teclado.close();
	}
	
}