package com.gft.tdd_jokenpo.service.verificador;

import com.gft.tdd_jokenpo.Constants;
import com.gft.tdd_jokenpo.model.Jogador;
import com.gft.tdd_jokenpo.model.Opcao;

public class VerificadorEmpate extends VerificadorDeJokenpo {

	public VerificadorEmpate(VerificadorDeJokenpo proximo) {
		super(proximo);
	}

	@Override
	protected String verificar(Jogador jogador1, Jogador jogador2) {

		Opcao opcaoJogador1 = jogador1.getOpcao();
		Opcao opcaoJogador2 = jogador2.getOpcao();

		return opcaoJogador1.equals(opcaoJogador2) ? Constants.EMPATE : Constants.PROXIMO;
	}

}
