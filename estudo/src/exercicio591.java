import java.util.Scanner;

public class exercicio591 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
        System.out.println("Digite o valor: ");
        a = teclado.nextInt();
        if (a%2==0) {
            System.out.println();
            System.out.println(a + " = par");
        } else {
            System.out.println();
            System.out.println(a + " = impar");
        }
        teclado.close();
    }
}
