package JogodaVelha;

import java.util.Random;

//Class filha responsável para gerenciamento das jogadas do computadorA onde faz de forma randômica 
public class ComputadorA extends Computador {
	String computador;
	public ComputadorA(String computador) {
		super(computador);
	}
	//Retorna dos valores para o tabuleiro
	public int jogada() {
		Random gerador = new Random();
		return gerador.nextInt(9);
	}
}

