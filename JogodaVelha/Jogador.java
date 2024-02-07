package JogodaVelha;

import java.util.Scanner;
// Class jogador
public class Jogador {
	
	int hjogada;
	// Class Aqui inicia construtor 
	int opcao;
	public Jogador(int hjogada) {
		super();
		this.hjogada=hjogada;
	

	}
	// Class jogador recebe as jogadas e retorna a posição escolhida pelo jogador 
	public int hjogada() {
	
		Scanner opc = new Scanner(System.in);
		this.opcao = opc.nextInt(); ;
		return opcao;
	}

}
