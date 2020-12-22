package com.gft.tdd_jokenpo.service.verificador;

import static com.gft.tdd_jokenpo.Constants.JOGADOR_1_VENCEU;
import static com.gft.tdd_jokenpo.Constants.JOGADOR_2_VENCEU;
import static com.gft.tdd_jokenpo.Constants.PAPEL;
import static com.gft.tdd_jokenpo.Constants.PEDRA;
import static com.gft.tdd_jokenpo.Constants.PROXIMO;
import static com.gft.tdd_jokenpo.service.util.AppUtils.setVencedorEPerdedor;

import com.gft.tdd_jokenpo.model.Jogador;
import com.gft.tdd_jokenpo.model.Opcao;

public class VerificadorPapel extends VerificadorDeJokenpo {

	public VerificadorPapel(VerificadorDeJokenpo proximo) {
		super(proximo);
	}

	@Override
	protected String verificar(Jogador jogador1, Jogador jogador2) {
		Opcao opcaoJogador2 = jogador2.getOpcao();
		Opcao opcaoJogador1 = jogador1.getOpcao();

		if (opcaoJogador1.equals(PAPEL)) {
			if (opcaoJogador2.equals(PEDRA)) {
				setVencedorEPerdedor(jogador1, jogador2);
				return JOGADOR_1_VENCEU;
			} else {
				setVencedorEPerdedor(jogador2, jogador1);
				return JOGADOR_2_VENCEU;
			}
		} else {
			return PROXIMO;
		}

	}

}
