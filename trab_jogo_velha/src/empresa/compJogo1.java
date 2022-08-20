package empresa;

public class compJogo1 extends Computador{
	public static void jogoEasy() { //este é o método do jogo quando chamado ele irá executar o primeiro nível.
		
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
			comp1.compu1(tab);
			if(tab.verificarJogo(tab)) {
			break;
			}
			tab.visualizar();
			}
		}
	}
