package e5;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		int n = entrada.nextInt();
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println( n + "x" + i + " = " + i * n);
			
		}

	}

}
