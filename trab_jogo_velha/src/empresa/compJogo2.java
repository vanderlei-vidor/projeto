package empresa;

public class compJogo2 extends Computador{
	 public static void jogoMedium() {//este é o método do jogo quando chamado ele irá executar o segundo nível.
			
										// com a interação com o usuário.	
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
