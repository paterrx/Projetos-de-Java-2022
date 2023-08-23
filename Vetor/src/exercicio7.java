import java.util.Random;

public class exercicio7 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int [] vetor = new int [10];
		boolean achei;
		for (int i = 0 ; i < vetor.length ; ) {
			vetor [i] = gerador.nextInt(vetor.length);
			achei = false;
			for (int j = 0 ; j < i ; j++) {
				if (vetor[j] == vetor[i]) {
					achei = true;	
					break;
				}
			}
			if (!achei) {
				System.out.print(vetor[i] + " ");
				i++;
			}
		}
	}

}
