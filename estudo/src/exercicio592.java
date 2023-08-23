import java.util.Scanner;

public class exercicio592 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
        System.out.println("Digite o valor: ");
        a = teclado.nextInt();
        System.out.println();
        System.out.println(a);
        if (a%3==0) {
            System.out.println("Esse numero e multiplo de 3. ");
        }
        if (a%7==0) {
            System.out.println("Esse numero e multiplo de 7. ");
        }
        teclado.close();
    }
}
