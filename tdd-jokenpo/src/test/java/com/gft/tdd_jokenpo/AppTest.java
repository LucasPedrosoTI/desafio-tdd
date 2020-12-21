package com.gft.tdd_jokenpo;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

	@Test
	void deveEmpatarCasoOpcaoIgual() throws Exception {
		jogador1.setOpcao(Opcao.PEDRA);
		jogador2.setOpcao(Opcao.PEDRA);

		assertEquals("EMPATE", Juiz.verificar(jogador1, jogador2));
	}

}
