import java.util.Scanner;

public class exercicio510 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont=0;
        double a, media=0;
        do {
            System.out.println("Digite o valor: ");
            a = teclado.nextInt();
            media = media + a;
            cont++;
        } while (cont<=850);
        media = media/850;
        System.out.println();
        System.out.println(media);
        teclado.close();
    }

}