package empresa;                                       
													//coment�rios:
public class Tabuleiro {     //esta � a classe m�e das classes Jogador e Computador.                        
	  static char[][]mat = {{' ',' ',' '},           //nessa linha � a matriz do jogo 
			 				{' ',' ',' '},			//foi utilizado o tipo primitivo char "como � um jogo de um �nico caracter.
			 				{' ',' ',' '}};         
	  
	public void visualizar() {                                                     //foi criado o m�todo de vizualizar o matriz do jogo.
		System.out.println("---------------------------------------");
		System.out.println(   mat[2][0] + " |" + mat[2][1] + " |" + mat[2][2]);    // matriz com tr�s linhas e tr�s colunas.
		System.out.println("--+--+--");
		System.out.println(   mat[1][0] + " |" + mat[1][1] + " |" + mat[1][2]);
		System.out.println("--+--+--");
		System.out.println(   mat[0][0] + " |" + mat[0][1] + " |" + mat[0][2]);
		System.out.println("---------------------------------------");
	}
	
	public static void instrucoes() { // este m�todo � uma introdu��o do jogo para que o usu�rio tem as instru��es de como jogar ou como o jogo foi desenvolvido.
		System.out.println("=====>Instru��es para jogar:<=====\n");
		System.out.println("No jogo da velha, o jogador tem como objetivo fazer uma sequ�ncia de tr�s s�mbolos iguais, \n"
				         +"tanto nas linhas verticais, como nas linhas horizontais e nas duas diagonais, quem completar    \n"
				         +" primeiro � o vencedor.\n" );
		System.out.println(" 7   8   9");
		System.out.println(" 4   5   6");
		System.out.println(" 1   2   3");
		System.out.println("----------------------------------");
		System.out.println(" A imagem acima � meramente ilustrativa, os comandos do jogo est�o \n "
				         +"(espelhados) com o teclado do computador, quando voc� pressionar uma \n  "
				         + "tecla dos n�meros, vai aparecer o respectivo s�mbolo no campo indicado.\n"
				         + "OBS: O s�mbolo X sempre ser� do usu�rio." );
	}
	public static void movimento(Tabuleiro tab, String posicao, char simbolo) {
		switch(posicao) {                   //este m�todo verifica se o usuario digitou uma tecla v�lida programada para o jogo.
			case "1":						//na respectiva posi��o.
				mat[0][0] = simbolo;
				break;
			case "2":
				mat[0][1] = simbolo;
				break;
			case "3":
				mat[0][2] = simbolo;
				break;
			case "4":
				mat[1][0] = simbolo;
				break;
			case "5":
				mat[1][1] = simbolo;
				break;
			case "6":
				mat[1][2] = simbolo;
				break;
			case "7":
				mat[2][0] = simbolo;
				break;
			case "8":
				mat[2][1] = simbolo;
				break;
			case "9":
				mat[2][2] = simbolo;
				break;	
			default:
				System.out.println("TECLA INV�LIDA: DIGITE NOVAMENTE!!!");				
			}
	}
	public static boolean validacao(Tabuleiro tab, String posicao) {
		switch(posicao) {				//este m�todo coloca o simbolo na posi��o indicado pelo usuario ou computador.
		 	case "1":
		 		if(mat[0][0] == ' ') {
		 			return true;
		 		}else {
		 			return false;
		 		}
		 	case "2":
		 		if(mat[0][1] == ' ') {
		 			return true;
		 		}else {
		 			return false;
		 		}
		 	case "3":
		 		if(mat[0][2] == ' ') {
		 			return true;
		 		}else {
		 			return false;
		 		}
		 	case "4":
		 		if(mat[1][0] == ' ') {
					return true;
				}else {
					return false;
				}
		 	case "5":
				if(mat[1][1] ==' ') {
					return true;
				}else {
					return false;
				}
		 	case "6":
				if(mat[1][2] == ' ') {
					return true;
				}else {
					return false;
				}
		 	case "7":
				if(mat[2][0] == ' ') {
					return true;
				}else {
					return false;
				}
		 	case "8":
				if(mat[2][1] == ' ') {
					return true;
				}else {
					return false;
				}
		 	case "9":
				if(mat[2][2] == ' ') {
					return true;
				}else {
					return false;
				}
		default:
			return false;			
		}	
	}
	public boolean verificarJogo(Tabuleiro tab) {   // este m�todo verifica se o jogador "X"completou a sequencia exigida pelo jogo.
		if(ateste(tab, 'X')) {                      // se isso ocorrer ele para o jogo e dispara a mensagem.
			tab.visualizar();
			System.out.println("#*#*#*# VOC� VENCEU!!! #*#*#*# \n #*#*#*# PARAB�NS!!! #*#*#*#");
			return true;
			
		}
		if(ateste(tab, 'O')) {             //// este m�todo verifica se o jogador "O" completou a sequencia exigida pelo jogo.
			tab.visualizar();             // se isso ocorrer ele para o jogo e dispara a mensagem.
			System.out.println(" o computador venceu. \n ### GAME OVER. ###");
			return true;
		}
		for (int i = 0 ; i < mat.length ; i++) {   // este m�todo percore as linhas e colunas para verificar os simbolos.
			for(int j=0 ; j< mat[i].length ; j++) {
				if (mat[i][j] == ' ') {
					return false;
				}
			}
		}
		tab.visualizar(); // caso n�o ocorra as situa��es anteriores esta mensagem � disparada.
		System.out.println("o jogo terminou EMPATADO!!");
		return true;
	}
	public static boolean ateste(Tabuleiro tab, char simbolo) { // este � o m�todo para verificar os simbolos iguais ( caracterizando vitorias, derrotas e empates desenvolvidos no jogo ).
		
		if((mat[0][0] == simbolo && mat[0][1] == simbolo && mat[0][2] == simbolo) ||
		   (mat[1][0] == simbolo && mat[1][1] == simbolo && mat[1][2] == simbolo) ||
		   (mat[2][0] == simbolo && mat[2][1] == simbolo && mat[2][2] == simbolo) ||
		   (mat[0][0] == simbolo && mat[1][0] == simbolo && mat[2][0] == simbolo) ||
		   (mat[0][1] == simbolo && mat[1][1] == simbolo && mat[2][1] == simbolo) ||
		   (mat[0][2] == simbolo && mat[1][2] == simbolo && mat[2][2] == simbolo) ||
		   (mat[0][0] == simbolo && mat[1][1] == simbolo && mat[2][2] == simbolo) ||
		   (mat[0][2] == simbolo && mat[1][1] == simbolo && mat[2][0] == simbolo)) {
			return true;
		}
		return false;
	}	
}
	
			
			
	

