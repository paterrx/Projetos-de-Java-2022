import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double a, b, c, sp, area, perimetro;
		System.out.println("Digite o valor do lado a: ");
		a = teclado.nextDouble();
		System.out.println("Digite o valor do lado b: ");
		b = teclado.nextDouble();
		System.out.println("Digite o valor do lado c: ");
		c = teclado.nextDouble();
		sp = (a + b + c) / 2;
		area = Math.sqrt(sp * (sp-a) * (sp-b) * (sp-c));
		perimetro = a + b + c;
		System.out.println("O valor da area é: " + area);
		System.out.println("O valor do perimetro é: " + perimetro);
		teclado.close();
		
	}

}
