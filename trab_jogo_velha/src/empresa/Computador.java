package empresa;

import java.util.Random; // foi utilizado a importação da função random.

public class Computador extends Tabuleiro { // classe filha de Tabuleiro.
	static Tabuleiro tab = new Tabuleiro();  // estanciando os objetos.
	static Computador comp1 = new Computador(); // estanciando os objetos.
	static Computador comp2 = new Computador(); // estanciando os objetos.
	static Computador comp3 = new Computador(); // estanciando os objetos.
	Random sorteio = new Random(); // foi instanciada para utilização da função random.
	
	int computador1;   //declaração das variaveis como inteiros para os níveis do jogo.
	int computador2;
	int computador3;
	
	public void compu1(Tabuleiro tab){ //método para o primeiro nível do jogo.
	while (true) {
		computador1 = sorteio.nextInt(9) +1;  // essa função gera numeros aleatórios de 1 a 9.
		if (validacao (tab , Integer.toString(computador1))){ //essa linha faz a validação da jogada e converte um numero em uma string para acrescentar no tabuleiro do jogo.
			break;
		}
	}
	System.out.println("o computador jogou o numero: " + computador1); //nessa linha é a declaração da jogada do computador.
	movimento(tab, Integer.toString(computador1), 'O');//o jogo ficou condicionado a opção "O" sempre para o computador.
	}                                                  // e acontece a conversão do simbolo para string.
	public void compu2(Tabuleiro tab) {////método para o segundo nível do jogo.
	while(true) {
		computador2 = 3;
		if (validacao (tab , Integer.toString(computador2))) {// aqui é o movimento do outros computador condicionado a uma jogada que eu escolhi.
			break;
		}
		computador2 = 1;
		if (validacao (tab , Integer.toString(computador2))) {
			break;
		}
		computador2 = 9;
		if (validacao (tab , Integer.toString(computador2))) {
			break;
		}
		computador2 = 2;
		if (validacao (tab , Integer.toString(computador2))) {
			break;
		}
		computador2 = 6;
		if (validacao (tab , Integer.toString(computador2))) {
			break;
		}
		computador2 = 8;
		if (validacao (tab , Integer.toString(computador2))) {
			break;
		}
		computador2 = 7;
		if (validacao (tab , Integer.toString(computador2))) {
			break;
		}
		computador2 = 4;
		if (validacao (tab , Integer.toString(computador2))) {
			break;
		}
		computador2 = 5;
		if (validacao (tab , Integer.toString(computador2))) {
			break;
		}
	}
	System.out.println("o computador jogou o numero: " + computador2); // idem item acima.
	movimento(tab, Integer.toString(computador2), 'O');
	
}
	public void compu3(Tabuleiro tab) {//método para o terceiro nível do jogo.
		while(true) {
			computador3 = 5;
			if (validacao (tab , Integer.toString(computador3))) {
				break;
			}
			computador3 = 7;
			if (validacao (tab , Integer.toString(computador3))) {
				break;
			}
			computador3 = 3;
			if (validacao (tab , Integer.toString(computador3))) {
				break;
			}
			computador3 = 1;
			if (validacao (tab , Integer.toString(computador3))) {
				break;
			}
			computador3 = 2;
			if (validacao (tab , Integer.toString(computador3))) {
				break;
			}
			computador3 = 4;
			if (validacao (tab , Integer.toString(computador3))) {
				break;
			}
			computador3 = 9;
			if (validacao (tab , Integer.toString(computador3))) {
				break;
			}
			computador3 = 8;
			if (validacao (tab , Integer.toString(computador3))) {
				break;
			}
			computador3 = 6;
			if (validacao (tab , Integer.toString(computador3))) {
				break;
		}
	}
		System.out.println("o computador jogou o numero: " + computador3);
	movimento(tab, Integer.toString(computador3), 'O');
	}
}


