import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int totalProduto;
		double totalCompra = 0, valorProduto;
		int pagamento;
		
		System.out.println("Quantos produtos sao? ");
		totalProduto = teclado.nextInt();
		for (int cont = 1; cont <= totalProduto ; cont++) {
			System.out.println();
			System.out.println("Qual o valor do produto? ");
			valorProduto = teclado.nextDouble();
			totalCompra = totalCompra + valorProduto;
		}
		System.out.println();
		System.out.println("Total da compra: R$ " + String.format("%.2f", totalCompra));
		System.out.println();
		System.out.println("1 - Pagamento a vista \n2 - Pagamento parcelado");
		pagamento = teclado.nextInt();
		System.out.println();
		if (pagamento == 1) {
			totalCompra *= 0.9;
			System.out.println("Total a pagar a vista: R$ " + String.format("%.2f", totalCompra));
		} else {
			totalCompra *= 1.155;
			System.out.println("Total de duas parcelas de: R$ " + String.format("%.2f", totalCompra / 2));
		}
		teclado.close();
	}

}
