package com.gft.tdd_jokenpo.model;

import static com.gft.tdd_jokenpo.Constants.PEDRA;
import static com.gft.tdd_jokenpo.Constants.TESOURA;

public class Juiz {

	public static String verificar(Jogador jogador1, Jogador jogador2) {

		Opcao opcaoJogador1 = jogador1.getOpcao();
		Opcao opcaoJogador2 = jogador2.getOpcao();

		if (opcaoJogador1.equals(opcaoJogador2)) {
			return "EMPATE";
		}

		if (opcaoJogador1.equals(PEDRA)) {
			if (opcaoJogador2.equals(TESOURA)) {
				setVencedorEPerdedor(jogador1, jogador2);
				return "JOGADOR 1 VENCEU!";
			} else {
				setVencedorEPerdedor(jogador2, jogador1);
				return "JOGADOR 2 VENCEU!";
			}
		}

		return null;
	}

	private static void setVencedorEPerdedor(Jogador vencedor, Jogador perdedor) {
		vencedor.setVencedor(true);
		perdedor.setVencedor(false);
	}

}
