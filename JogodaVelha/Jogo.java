package JogodaVelha;

import java.util.Scanner;


public class Jogo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		// Aqui instanciamos tabuleiro e o jogador humano e declamos as variavels
		Tabuleiro tab = new Tabuleiro();
		Jogador humano = new Jogador(0);
		String posicao;
		String jogador1;
		String computador;
		

		int valida = 0, Jogadas = 0; // Essas variaveis fazem as contagem das jogadas e se valida
		
		System.out.println("#######<<* Jogo da Velha *>>######");
		
		// Aqui é inserido o nomedo do jogador humano
		System.out.print("Qual Seu nome Jogador: ");
		String jdor = ler.next();
		System.out.println("\n");
		
		// Iniciamos aqui a escolha dos niveis do computador vai jogar temos ComputadorA nivel 1, ComputadorB nivel 2, ComputadorC nivel 3
		System.out.print("Escolha seu adiversario Nivel 1, Nivel 2 ou Nivel 3: ");
		int opcao = ler.nextInt();
		
		Computador comp;
		if(opcao == 1) {
				System.out.println("Ola Sou seu Adversario Computador A: ");
				comp = new ComputadorA(null);
				jogador1= jdor;
				computador= "A";
				
				
		}
		else if(opcao==2) {
				System.out.println("Ola Sou seu Adversario Computador B: ");
				comp = new ComputadorB(null, 0);
				jogador1= jdor;
				computador= "B";
				
		}
		else {	
			
				System.out.println("Ola Sou seu Adversario Computador C: ");
				comp = new ComputadorC(null, 9);
				jogador1= jdor;
				computador= "C";
				
		}
		
		
		
		while(true) {
			
			System.out.println("#######<<* Jogo da Velha *>>######");
			tab.Mostrar();
			do {// Inicia Jogador 1
				
				System.out.print( jogador1 +" , aguardando jogada: ");
				posicao = String.valueOf(humano.hjogada());
				while(!tab.Validar(posicao)) {
					System.out.println("Jogada invalida - Agudando jogada: ");
					System.out.println("Jogador 1, aguardando jogada");
					posicao = ler.next();
					valida = 0;
					
					
				}
				tab.jogadas(posicao, "X");
				valida = 1;
				
			}while(valida==0);// finalizada jogador 1
			
			Jogadas++;
			valida = 0;
			
			tab.Mostrar();
			if(!tab.Ganhador(Jogadas,jogador1).equals("null")) {
				break;
				
			}
			do {// Inicia Jogador 2
					
				    System.out.println("################################################");
				
					posicao = String.valueOf(comp.jogada());
					while(!tab.Validar(posicao)) {
						posicao = String.valueOf(comp.jogada());
						valida = 0;
					}
					tab.jogadas(posicao, "O");
					
					tab.Mostrar();
					valida = 1;
					
				}while(valida==0);// finalizada jogador 2
			Jogadas++;
			valida = 0;
			if(!tab.Ganhador(Jogadas,computador).equals("null")) {
				break;
				
			}
		}//--------------------------
		System.out.println(tab.Ganhador(Jogadas,jogador1));
		
		
	
	}


		
		
}

