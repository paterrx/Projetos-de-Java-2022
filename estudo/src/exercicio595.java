import java.util.Scanner;

public class exercicio595 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String tipo;
        double compra, valorfinal, parcela = 0, diferenca;
        System.out.println("Valor da compra: ");
        compra = teclado.nextDouble();
        System.out.println();
        do {
            tipo = teclado.nextLine();
            System.out.println("Digite a opcao de pagamento: (pagAvista, pagCheque, pagParcelado)");
            tipo = teclado.nextLine();
            System.out.println();
            System.out.println("Voce digitou uma opcao de pagamento invalida. ");
        } while (!tipo.equalsIgnoreCase("pagAvista") && !tipo.equalsIgnoreCase("pagCheque")
                && !tipo.equalsIgnoreCase("pagParcelado"));
        if (tipo.equalsIgnoreCase("pagAvista")) {
            valorfinal = compra - compra * 15 / 100;
        } else if (tipo.equalsIgnoreCase("pagCheque")) {
            valorfinal = compra - compra * 10 / 100;
        } else {
            System.out.println();
            System.out.println("Digite a quantidade de parcelas: (3, 6 ou 12)");
            parcela = teclado.nextDouble();
            if (parcela == 3) {
                valorfinal = compra - compra * 5 / 100;
            } else if (parcela == 6) {
                valorfinal = compra;
            } else {
                valorfinal = compra + compra * 8 / 100;
            }
        }
        diferenca = valorfinal - compra;
        System.out.println();
        System.out.println("Valor da compra -> R$" + compra);
        System.out.println();
        System.out.println("Valor de pagamento -> R$" + valorfinal);
        System.out.println();
        if (valorfinal < compra) {
            System.out.println("Desconto -> R$" + diferenca);
        } else {
            System.out.println("Juros -> R$" + diferenca);
        }
        System.out.println();
        if (parcela == 3) {
            parcela = valorfinal / 3;
            System.out.println("Serao 3 parcelas de -> R$" + String.format("%.2f", parcela));
        } else if (parcela == 6) {
            parcela = valorfinal / 6;
            System.out.println("Serao 6 parcelas de -> R$" + String.format("%.2f", parcela));
        } else if (parcela == 12) {
            parcela = valorfinal / 12;
            System.out.println("Serao 12 parcelas de -> R$" + String.format("%.2f", parcela));
        }
        teclado.close();
    }
}
