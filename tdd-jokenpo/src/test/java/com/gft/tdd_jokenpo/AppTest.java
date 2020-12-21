package com.gft.tdd_jokenpo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gft.tdd_jokenpo.model.Jogador;
import com.gft.tdd_jokenpo.model.Juiz;
import com.gft.tdd_jokenpo.model.Opcao;

class AppTest {

	@Test
	void pedraDeveEmpatarComPedra() throws Exception {
		Jogador jogador1 = Jogador.builder()
				.withOpcao(Opcao.PEDRA)
				.build();

		Jogador jogador2 = Jogador.builder()
				.withOpcao(Opcao.PEDRA)
				.build();

		assertEquals("EMPATE", Juiz.verificar(jogador1, jogador2));
	}

}
