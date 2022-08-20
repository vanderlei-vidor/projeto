package empresa;

import java.util.InputMismatchException;   //foi feito uma importação de um pacote para tratar uma exceção.
import java.util.Scanner;					// importação do pacote scanner utilizado para entrada de dados.

public class Jogador extends Tabuleiro { // esta é a classe filha de Tabuleiro.
	public static void inicioOpcoes() { // foi desenvolvido um menu opções para escolha do usuario jogador.
		System.out.println("\n MENU DO JOGO:\n"); // e escolha de diferentes opções de jogo.
		System.out.println("Escolha a dificuldade do jogo:");
		System.out.println(" opção: 1-Easy\n opção: 2-Medium\n opção: 3-Hard");
		while(true) {
		Scanner opcao = new Scanner(System.in); // método de entrada de dados.
		try {
			System.out.println("ESCOLHA UMA OPÇÃO:");
			int escolha = opcao.nextInt(); //entrada de dados do usuário
			System.out.println("----------");
			System.out.println("LOADING..."); 
			System.out.println("----------");
			try {Thread.sleep(3000);} catch (Exception e) {} // nessa linha foi acrescentada um função para fazer um suspense no jogo. 
			if(escolha==1) {  //se o usuario escolher a opção 1 - entrar nessa escolha de jogo.
				System.out.println("voce escolheu a opção: 1-Easy"); 
				System.out.println("BOA SORTE!!!");
				compJogo1.jogoEasy();
				break;
			}
			if(escolha==2) {  //se o usuario escolher a opção 2 - entrar nessa escolha de jogo.
				System.out.println("você escolheu a opção: 2-Medium");
				System.out.println("BOA SORTE!!!");
				compJogo2.jogoMedium();
				break;
			}
			if(escolha==3) {  //se o usuario escolher a opção 3 - entrar nessa escolha de jogo.
				System.out.println("você escolheu a opção: 3-Hard");
				System.out.println("BOA SORTE!!!");
				compJogo3.jogoHard();
				break;
			}
			else if(escolha != 1 || escolha!=2 || escolha!=3) { //esta linha é para controle de entrada de dados pelo usuário.
				System.out.println("opção invalida. Escolha 1, 2, ou 3\n");
				continue;	
			}
			//opcao.close();
		}
		catch(InputMismatchException e) { // esta linha é um controle de dados para direcionar o usuário para o jogo.
			System.out.println("ERRO! Digite somente NUMEROS. TENTE NOVAMENTE!");//se digitar outra tecla que não as solicitadas, é disparada a mensagem.
		}
			continue;
		}
	}


	public static void numerotab(Tabuleiro tab, char simbolo) {//nessa linha o usuário vai interagir com o jogo.
		String usuario; //variaver usuário.
		Scanner teclado = new Scanner(System.in); //função Scanner 
		while(true) {
			usuario = teclado.nextLine(); //entrada de dados.
			if (validacao(tab,usuario)) {  //um if para verificação da entrada de dados.
				break;
			}else { // se o usuário não inserir os dados corretos a mensagem é disparada.
				System.out.println(usuario + " ******jogada invalida:****** \n    ### TENTE NOVAMENTE!### ");
			}
		}
		System.out.println("---------------------");
		System.out.println("você jogou o numero =" + usuario); //mensagem da entrada de dados do usuário, conforme a sua escolha.
		movimento(tab, usuario, 'X'); //o jogo ficou condicionado a opção "x" sempre para o usuário.
		//teclado.close(); // esse comando foi solicitado pela IDE mas da um erro de compilação.
	}
	
}