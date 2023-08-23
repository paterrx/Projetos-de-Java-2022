import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double total=0, valor;
		String pagamento;
		for (String condicao = null ; condicao.equalsIgnoreCase("nao");) {
			System.out.println("Digite o preco do produto. ");
			valor = teclado.nextDouble();
			total = total + valor;			
			condicao = teclado.nextLine();
			System.out.println("Deseja adicionar outro produto? (sim ou nao)");
			condicao = teclado.nextLine();				
		}
		System.out.println("Esse e o total da compra: " + String.format("%.2f", total));
		do {
			System.out.println();
			System.out.println("Qual sera a forma de pagamento? (A vista 10% desconto / Duas vezes + 15.5%)");
			System.out.println("Digite 1x ou 2x. ");
			pagamento = teclado.nextLine();			
		} while (!pagamento.equalsIgnoreCase("1x") || !pagamento.equalsIgnoreCase("2x"));
		if (pagamento.equalsIgnoreCase("1x")) {
			total =  total - (total*1.10);
			System.out.println("A compra ficou: " + String.format("%.2f", total));
		} else {
			total = total + (total*1.15);
			System.out.println("A compra ficou: " + String.format("%.2f", total));
		}
		teclado.close();
	}

}
