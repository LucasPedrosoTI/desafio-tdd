package com.gft.tdd_jokenpo.model;

public class Juiz {

	public static String verificar(Jogador jogador1, Jogador jogador2) {

		Opcao opcaoJogador1 = jogador1.getOpcao();
		Opcao opcaoJogador2 = jogador2.getOpcao();

		if (opcaoJogador1.equals(opcaoJogador2)) {
			return "EMPATE";
		}

		return null;
	}

}
