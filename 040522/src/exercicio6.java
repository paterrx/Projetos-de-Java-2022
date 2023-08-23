import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a, b, c;
		System.out.println("Digite o primeiro valor: ");
		a = teclado.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = teclado.nextInt();
		System.out.println("Digite o terceiro valor: ");
		c = teclado.nextInt();
		System.out.println();
		if (a==b && a==c && b==c) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		} else {
			if (a==b || a==c || b==c) {
				if (a==b) {
					if (a>c) {
						System.out.println(a);
						System.out.println(b);
						System.out.println(c);
					} else {
						System.out.println(c);				
						System.out.println(a);
						System.out.println(b);
					}
				}
				if (a==c) {
					if (a>b) {
						System.out.println(a);
						System.out.println(c);
						System.out.println(b);				
					} else {
						System.out.println(b);	
						System.out.println(a);
						System.out.println(c);
					}
				}
				if (b==c) {
					if (b>a) {
						System.out.println(b);
						System.out.println(c);
						System.out.println(a);				
					} else {
						System.out.println(a);								
						System.out.println(b);
						System.out.println(c);
					}
				}
			} else {
				if (a>b && a>c) {
					System.out.println(a);
					if (b>c) {
						System.out.println(b);
						System.out.println(c);
					} else {
						System.out.println(c);
						System.out.println(b);
					}
				} else if (b>a && b>c) {
					System.out.println(b);
					if (a>c) {
						System.out.println(a);
						System.out.println(c);
					} else {
						System.out.println(c);
						System.out.println(a);
					}
				} else if (c>a && c>b) {
					System.out.println(c);
					if (a>b) {
						System.out.println(a);
						System.out.println(b);
					} else {
						System.out.println(b);
						System.out.println(a);
					}
				}
			}
		}
		teclado.close();
	}

}
