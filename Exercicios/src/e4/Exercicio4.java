package e4;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("Informe dois valores: ");
		 int valor1 = sc.nextInt();
		 int valor2 = sc.nextInt();
		 
		 System.out.println("Informe uma operação + - * /");
		 String op = sc.next();
		
		 switch(op) {
		 	case "+" :
		 		System.out.println(valor1 + " + " + valor2 + " = " + (valor1 + valor2) );
			 break;
		 	
		 	case "-":
		 		System.out.println(valor1 + " - " + valor2 + " = " + (valor1 - valor2) );
		 		break;
		 		
		 	case "*":
		 		System.out.println(valor1 + " * " + valor2 + " = " + (valor1 * valor2) );
		 		break;
		 		
		 	case "/":
		 		System.out.println(valor1 + " / " + valor2 + " = " + (valor1 / valor2) );
		 		break;
		 		
		 	default:
		 		System.out.println("Operação invalida");
		 }
		 
		
		
	}
}
