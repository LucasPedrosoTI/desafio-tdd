package com.gft.tdd_jokenpo.service.verificador;

import static com.gft.tdd_jokenpo.Constants.PROXIMO;

import com.gft.tdd_jokenpo.model.Jogador;

public abstract class VerificadorDeJokenpo {

	private VerificadorDeJokenpo proximo;

	protected VerificadorDeJokenpo(VerificadorDeJokenpo proximo) {
		this.proximo = proximo;
	}

	public String resultado(Jogador jogador1, Jogador jogador2) {
		String resultado = verificar(jogador1, jogador2);

		return resultado.equals(PROXIMO) ? proximo.resultado(jogador1, jogador2) : resultado;

	}

	protected abstract String verificar(Jogador jogador1, Jogador jogador2);
}
