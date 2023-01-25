package e3;

import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
		String jogador1 = "Papel";
		//String jogador2 = "Tesoura";
		
		String[] opcoes = { "Pedra", "Papel", "Tesoura" }; 
		String maquina = opcoes[new Random().nextInt(opcoes.length)]; //parte pega na internet
		
		if(jogador1 == maquina) {
			System.out.println(jogador1 + " : " + maquina);
			System.out.println("Empate");	
		}else if(jogador1 == "Papel" && maquina == "Pedra") {
			System.out.println(jogador1 + " : " + maquina);
			System.out.println("Jogador 1 ganhou");
		}else if(jogador1 == "Pedra" && maquina == "Tesoura") {
			System.out.println(jogador1 + " : " + maquina);
			System.out.println("Jogador 1 ganhou");
		}else if(jogador1 == "Tesoura" && maquina == "Papel") {
			System.out.println(jogador1 + " : " + maquina);
			System.out.println("Jogador 1 ganhou");
		}else {
			System.out.println(jogador1 + " : " + maquina);
			System.out.println("Jogador 2 ganhou");
		}
		

	}

}
