package JogodaVelha;

//Class filha respons�vel para gerenciamento das jogadas do computadorB � a soma seq�encial da posi��o iniciando 0 ate 9 
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
