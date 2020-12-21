package com.gft.tdd_jokenpo.model;

public class Juiz {

	public static String verificar(Jogador jogador1, Jogador jogador2) {

		if (jogador1.getOpcao().equals(jogador2.getOpcao())) {
			return "EMPATE";
		}

		return null;
	}

}
