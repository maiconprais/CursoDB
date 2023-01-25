package e2;

public class Exercicio2 {

	public static void main(String[] args) {
		String nome = "Cerveja";
		double preco = 5.10;
		int quant = 51;
		double valorT = 0 ,valorSemD = 0;
		
		valorSemD = quant * preco;
		
		if (quant <= 10) {
			valorT = valorSemD;
			System.out.println(" Produto comprado: " + nome + "\n Valor Total = " + valorT);
		} else if (quant >= 11 && quant <= 20) {
			valorT = valorSemD - ((valorSemD) * 0.10); //10% desconto
			System.out.println(" Produto comprado: " + nome + "\n Valor Total = " + valorT);
		} else if (quant >= 21 && quant <= 50) {
			valorT = valorSemD - ((valorSemD) * 0.20); //20% desconto
			System.out.println(" Produto comprado: " + nome + "\n Valor Total = " + valorT);
		} else {
			valorT = valorSemD - ((valorSemD) * 0.25); //25% desconto
			System.out.println(" Produto comprado: " + nome + "\n Valor Total = " + valorT);
		}

	}

}
