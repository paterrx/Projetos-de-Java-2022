import java.util.Scanner;

public class exercicio593 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont=0;
        double prova, media=0;
        do {
            System.out.println("Digite o valor das provas: ");
            prova = teclado.nextDouble();
            media = media + prova; 
            cont++;
        } while (cont<3);
        media =  media / 3;
        if (media>7.0) {
            System.out.println();
            System.out.println("Aprovado ");
            System.out.println();
            System.out.println("Media -> " + String.format("%.2f", media));
        } else {
            System.out.println("Exame, digite sua nota: ");
            prova = teclado.nextDouble();
            media = (media+prova)/2;
            if (media>=5.0) {
                System.out.println();
                System.out.println("Aprovado ");
                System.out.println();
                System.out.println("Media -> " + String.format("%.2f", media));
            } else {
                System.out.println();
                System.out.println("Reprovado ");
                System.out.println();
                System.out.println("Media -> " + String.format("%.2f", media));
            }
        }
        teclado.close();
    }
}
