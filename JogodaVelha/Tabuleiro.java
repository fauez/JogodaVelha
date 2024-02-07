package JogodaVelha;

public class Tabuleiro {
	//Matriz que vai gerar o tabuleiro
	private String[][] m = {
							{"1","2","3"},
							{"4","5","6"},
							{"7","8","9"}
							};
	
	//Class que é responsável por gerar o tabuleiro
	public String Mostrar (){
		
		for(int ln=0; ln<3;ln++) {
			for(int cl=0;cl<3;cl++) {
				System.out.printf("[ "+ m[ln][cl]+ " ]");
			}
			System.out.println("\n");
		}	
		return null;
	} 
	//----------------------------------------------
	// Class que valida as jogadas caso saia um valor repetido ou inválido
	public boolean Validar(String x) {
		for(int ln=0; ln<3;ln++ ) {
			for(int cl=0;cl<3;cl++) {
				if(m[ln][cl].equals(x)) {
					return true;
					
				}
			}
			
		}
		return false;
	}
	
	//----------------------------------------------
	
	//Class onde é gerenciada as jogadas
	
	public void jogadas(String x, String y) {
		if(x.equals("1")){
			m[0][0] = y;
		}else if(x.equals("2")) {
			m[0][1] = y;
		}else if(x.equals("3")) {
			m[0][2] = y;
		}else if(x.equals("4")) {
			m[1][0] = y;
		}else if(x.equals("5")) {
			m[1][1] = y;
		}else if(x.equals("6")) {
			m[1][2] = y;
		}else if(x.equals("7")) {
			m[2][0] = y;
		}else if(x.equals("8")) {
			m[2][1] = y;
		}else if(x.equals("9")) {
			m[2][2] = y;
		}
		
	}
	//Class onde são feitas as jogadas onde informa o resultado se ganhou, foi derrotado ou houve empate
	public String Ganhador(int jgs, String nome ) {
		String[] T = new String[8];
		String vencedor = "null";
		if(jgs == 9) {
			vencedor =  "<<<<< "+ nome +", Você EMPATOU!>>>>>"; 
			
		}
		// jogadas horizontais
		T[0] = m[0][0] + m[0][1] + m[0][2];
		T[1] = m[1][0] + m[1][1] + m[1][2];
		T[2] = m[2][0] + m[2][1] + m[2][2];
		// jogadas Verticais
		T[3] = m[0][0] + m[1][0] + m[2][0];
		T[4] = m[0][1] + m[1][1] + m[2][1];
		T[5] = m[0][2] + m[1][2] + m[2][2];
		// jogadas diagonais
		T[6] = m[0][0] + m[1][1] + m[2][2];
		T[7] = m[0][2] + m[1][1] + m[2][0];
		
		for(int i=0; i<T.length; i++) {
			if(T[i].equals("XXX")) {
				vencedor = "$$$$$$ "+ nome +" Ganhou!!!!!";
				
			}else if(T[i].equals("OOO")) {
				vencedor = "<<<<< "+ nome +", Você foi derrotado!>>>>>";
			}
		}
		return vencedor;
	}
	//------------------------------------------------------
	
	
	
}
