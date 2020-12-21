package com.gft.tdd_jokenpo;

import static com.gft.tdd_jokenpo.Constants.PEDRA;
import static com.gft.tdd_jokenpo.Constants.TESOURA;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.tdd_jokenpo.model.Jogador;
import com.gft.tdd_jokenpo.model.Juiz;
import com.gft.tdd_jokenpo.model.Opcao;

class AppTest {



	Jogador jogador1;

	Jogador jogador2;

	@BeforeEach
	public void setup() throws Exception {
		jogador1 = Jogador.builder().build();
		jogador2 = Jogador.builder().build();
	}

	private void setarOpcoes(Opcao opcaoJogador1, Opcao opcaoJogador2) {
		jogador1.setOpcao(opcaoJogador1);
		jogador2.setOpcao(opcaoJogador2);
	}

	@Test
	void deveEmpatarCasoOpcaoIgual() throws Exception {
		setarOpcoes(PEDRA, PEDRA);

		assertEquals("EMPATE", Juiz.verificar(jogador1, jogador2));
	}

	@Test
	void pedraDeveGanharDeTesoura() throws Exception {
		setarOpcoes(PEDRA, TESOURA);

		Juiz.verificar(jogador1, jogador2);

		assertTrue(jogador1.isVencedor());
		assertFalse(jogador2.isVencedor());
	}

}
