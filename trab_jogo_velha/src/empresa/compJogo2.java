package empresa;

public class compJogo2 extends Computador{
	 public static void jogoMedium() {//este � o m�todo do jogo quando chamado ele ir� executar o segundo n�vel.
			
										// com a intera��o com o usu�rio.	
		while(true) {
			System.out.println("---------------------------------------");
			System.out.println("DIGITE UM NUMERO DO TECLADO PARA JOGAR:");
			tab.visualizar();
			Jogador.numerotab(tab, 'X');
			if(tab.verificarJogo(tab)) {
				break;
			}
			tab.visualizar();
			comp2.compu2(tab);
			if(tab.verificarJogo(tab)) {
			break;
			}
			tab.visualizar();	
			}				
		}
	}
