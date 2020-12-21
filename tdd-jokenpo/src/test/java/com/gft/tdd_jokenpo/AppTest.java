package com.gft.tdd_jokenpo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.tdd_jokenpo.model.Jogador;
import com.gft.tdd_jokenpo.model.Juiz;
import com.gft.tdd_jokenpo.model.Opcao;

class AppTest {

	private static final Opcao PEDRA = Opcao.PEDRA;
	private static final Opcao TESOURA = Opcao.TESOURA;
	private static final Opcao PAPEL = Opcao.PAPEL;

	Jogador jogador1;

	Jogador jogador2;

	@BeforeEach
	public void setup() throws Exception {
		jogador1 = Jogador.builder().build();
		jogador2 = Jogador.builder().build();
	}

	private void setarOpcoes(Opcao opcao1, Opcao opcao2) {
		jogador1.setOpcao(opcao1);
		jogador2.setOpcao(opcao2);
	}

	@Test
	void deveEmpatarCasoOpcaoIgual() throws Exception {
		setarOpcoes(PEDRA, PEDRA);

		assertEquals("EMPATE", Juiz.verificar(jogador1, jogador2));
	}

	@Test
	void pedraDeveGanharDeTesoura() throws Exception {
		setarOpcoes(PEDRA, TESOURA);

		assertTrue(jogador1.isVencedor());
		assertFalse(jogador2.isVencedor());
	}

}
