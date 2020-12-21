package com.gft.tdd_jokenpo.service.verificador;

import static com.gft.tdd_jokenpo.Constants.JOGADOR_1_VENCEU;
import static com.gft.tdd_jokenpo.Constants.JOGADOR_2_VENCEU;
import static com.gft.tdd_jokenpo.Constants.PEDRA;
import static com.gft.tdd_jokenpo.Constants.TESOURA;
import static com.gft.tdd_jokenpo.service.util.AppUtils.setVencedorEPerdedor;

import com.gft.tdd_jokenpo.Constants;
import com.gft.tdd_jokenpo.model.Jogador;
import com.gft.tdd_jokenpo.model.Opcao;

public class VerificadorPedra extends VerificadorDeJokenpo {

	public VerificadorPedra(VerificadorDeJokenpo proximo) {
		super(proximo);
	}

	@Override
	protected String verificar(Jogador jogador1, Jogador jogador2) {
		Opcao opcaoJogador1 = jogador1.getOpcao();
		Opcao opcaoJogador2 = jogador2.getOpcao();

		if (opcaoJogador1.equals(PEDRA)) {
			if (opcaoJogador2.equals(TESOURA)) {
				setVencedorEPerdedor(jogador1, jogador2);
				return JOGADOR_1_VENCEU;
			} else {
				setVencedorEPerdedor(jogador2, jogador1);
				return JOGADOR_2_VENCEU;
			}
		} else {
			return Constants.PROXIMO;
		}

	}

}
