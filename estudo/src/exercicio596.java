import java.util.Scanner;

public class exercicio596 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hora1, hora2, soma, diferenca;
        System.out.println("Digite o 1. intervalo de tempo: (somente numeros)");
        hora1 = teclado.nextInt();
        System.out.println();
        System.out.println("Digite o 2. intervalo de tempo: (somente numeros)");
        hora2 = teclado.nextInt();
        soma = hora1+hora2;
        diferenca = hora1-hora2;
        System.out.println();
        System.out.println("Soma dos intervalos -> " + soma);
        System.out.println();
        System.out.println("Diferenca dos intervalos -> " + diferenca);
        teclado.close();
    }
}
