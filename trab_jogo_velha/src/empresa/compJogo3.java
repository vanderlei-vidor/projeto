package empresa;

public class compJogo3 extends Computador {
	public static void jogoHard() {//este é o método do jogo quando chamado ele irá executar o terceiro nível.
		
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
			comp3.compu3(tab);
			if(tab.verificarJogo(tab)) {
			break;
			}
			tab.visualizar();	
			}				
		}
	}
