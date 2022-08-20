package empresa;

import java.util.InputMismatchException;   //foi feito uma importa��o de um pacote para tratar uma exce��o.
import java.util.Scanner;					// importa��o do pacote scanner utilizado para entrada de dados.

public class Jogador extends Tabuleiro { // esta � a classe filha de Tabuleiro.
	public static void inicioOpcoes() { // foi desenvolvido um menu op��es para escolha do usuario jogador.
		System.out.println("\n MENU DO JOGO:\n"); // e escolha de diferentes op��es de jogo.
		System.out.println("Escolha a dificuldade do jogo:");
		System.out.println(" op��o: 1-Easy\n op��o: 2-Medium\n op��o: 3-Hard");
		while(true) {
		Scanner opcao = new Scanner(System.in); // m�todo de entrada de dados.
		try {
			System.out.println("ESCOLHA UMA OP��O:");
			int escolha = opcao.nextInt(); //entrada de dados do usu�rio
			System.out.println("----------");
			System.out.println("LOADING..."); 
			System.out.println("----------");
			try {Thread.sleep(3000);} catch (Exception e) {} // nessa linha foi acrescentada um fun��o para fazer um suspense no jogo. 
			if(escolha==1) {  //se o usuario escolher a op��o 1 - entrar nessa escolha de jogo.
				System.out.println("voce escolheu a op��o: 1-Easy"); 
				System.out.println("BOA SORTE!!!");
				compJogo1.jogoEasy();
				break;
			}
			if(escolha==2) {  //se o usuario escolher a op��o 2 - entrar nessa escolha de jogo.
				System.out.println("voc� escolheu a op��o: 2-Medium");
				System.out.println("BOA SORTE!!!");
				compJogo2.jogoMedium();
				break;
			}
			if(escolha==3) {  //se o usuario escolher a op��o 3 - entrar nessa escolha de jogo.
				System.out.println("voc� escolheu a op��o: 3-Hard");
				System.out.println("BOA SORTE!!!");
				compJogo3.jogoHard();
				break;
			}
			else if(escolha != 1 || escolha!=2 || escolha!=3) { //esta linha � para controle de entrada de dados pelo usu�rio.
				System.out.println("op��o invalida. Escolha 1, 2, ou 3\n");
				continue;	
			}
			//opcao.close();
		}
		catch(InputMismatchException e) { // esta linha � um controle de dados para direcionar o usu�rio para o jogo.
			System.out.println("ERRO! Digite somente NUMEROS. TENTE NOVAMENTE!");//se digitar outra tecla que n�o as solicitadas, � disparada a mensagem.
		}
			continue;
		}
	}


	public static void numerotab(Tabuleiro tab, char simbolo) {//nessa linha o usu�rio vai interagir com o jogo.
		String usuario; //variaver usu�rio.
		Scanner teclado = new Scanner(System.in); //fun��o Scanner 
		while(true) {
			usuario = teclado.nextLine(); //entrada de dados.
			if (validacao(tab,usuario)) {  //um if para verifica��o da entrada de dados.
				break;
			}else { // se o usu�rio n�o inserir os dados corretos a mensagem � disparada.
				System.out.println(usuario + " ******jogada invalida:****** \n    ### TENTE NOVAMENTE!### ");
			}
		}
		System.out.println("---------------------");
		System.out.println("voc� jogou o numero =" + usuario); //mensagem da entrada de dados do usu�rio, conforme a sua escolha.
		movimento(tab, usuario, 'X'); //o jogo ficou condicionado a op��o "x" sempre para o usu�rio.
		//teclado.close(); // esse comando foi solicitado pela IDE mas da um erro de compila��o.
	}
	
}