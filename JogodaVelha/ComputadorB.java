package JogodaVelha;

//Class filha responsável para gerenciamento das jogadas do computadorB é a soma seqüencial da posição iniciando 0 ate 9 
public class ComputadorB extends Computador{
	int jogada;
	public ComputadorB(String computador, int jogada) {
		super(computador);
		this.jogada = jogada; 
	}
	//Retorna dos valores para o tabuleiro
	public int jogada() {
      return jogada++;

	}


}
