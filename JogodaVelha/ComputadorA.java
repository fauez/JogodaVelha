package JogodaVelha;

import java.util.Random;

//Class filha respons�vel para gerenciamento das jogadas do computadorA onde faz de forma rand�mica 
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

