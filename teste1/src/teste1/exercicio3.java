package teste1;

public class exercicio3 {

	public static void main(String[] args) {
		int a, b;
		a = 0;
		b = 0;
		while (a<=500) {
			a = a + 1;
			if (a % 2 != 0 ) {
				if (a % 3 == 0) {
					b = a + b;
				}
			}
		}
		System.out.println(b);
	}

}
