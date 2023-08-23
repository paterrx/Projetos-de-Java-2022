import java.util.Scanner;

public class exercicio594 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int livros;
        double cA, cB;
        System.out.println("Digite a quantidade de livros: ");
        livros = teclado.nextInt();
        cA = 0.25 * livros + 7.50;
        cB = 0.50 * livros + 2.50;
        if (cA==cB) {
            System.out.println("As duas opcoes de desconto sao iguais -> R$" + cA);
        } else if (cA<cB) {
            System.out.println("Melhor opcao de desconto -> cA = R$" + cA);
        } else {
            System.out.println("Melhor opcao de desconto -> cB = R$" + cB);
        }
        teclado.close();
    }
}