package com.gft.tdd_jokenpo;

import static com.gft.tdd_jokenpo.Constants.PAPEL;
import static com.gft.tdd_jokenpo.Constants.PEDRA;
import static com.gft.tdd_jokenpo.Constants.TESOURA;
import static com.gft.tdd_jokenpo.model.Juiz.verificar;
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

	private void assertVencedorEPerdedor(Jogador vencedor, Jogador perdedor) {
		assertTrue(vencedor.isVencedor());
		assertFalse(perdedor.isVencedor());
	}

	@Test
	void deveEmpatarCasoOpcaoIgual() throws Exception {
		setarOpcoes(PEDRA, PEDRA);

		assertEquals("EMPATE", Juiz.verificar(jogador1, jogador2));
	}

	@Test
	void pedraDeveGanharDeTesoura() throws Exception {
		setarOpcoes(PEDRA, TESOURA);

		verificar(jogador1, jogador2);

		assertVencedorEPerdedor(jogador1, jogador2);
	}


	@Test
	void pedraDevePerderDePapel() throws Exception {
		setarOpcoes(PEDRA, PAPEL);

		verificar(jogador1, jogador2);

		assertVencedorEPerdedor(jogador2, jogador1);
	}

	@Test
	void tesouraDeveGanharDePapel() throws Exception {

		setarOpcoes(TESOURA, PAPEL);

		verificar(jogador1, jogador2);

		assertVencedorEPerdedor(jogador1, jogador2);
	}

	@Test
	void tesouraDevePerderDePedra() throws Exception {
		setarOpcoes(TESOURA, PEDRA);

		verificar(jogador1, jogador2);

		assertVencedorEPerdedor(jogador2, jogador1);
	}

}
