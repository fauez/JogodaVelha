package JogodaVelha;



public class ComputadorC extends Computador{
	
	int jogada;
	
	
	public ComputadorC(String computador, int jogada) {
		super(computador);
		this.jogada = jogada; 
		
	
	}
	
	public int jogada() {
		return jogada--;
	}


}
