package com.gft.tdd_jokenpo.model;

import com.gft.tdd_jokenpo.service.verificador.VerificadorDeJokenpo;
import com.gft.tdd_jokenpo.service.verificador.VerificadorEmpate;
import com.gft.tdd_jokenpo.service.verificador.VerificadorPapel;
import com.gft.tdd_jokenpo.service.verificador.VerificadorPedra;
import com.gft.tdd_jokenpo.service.verificador.VerificadorTesoura;

public class Juiz {

	private VerificadorDeJokenpo verificador;

	private Juiz(Builder builder) {
		this.verificador = builder.verificador;
	}

	public String verificar(Jogador jogador1, Jogador jogador2) {

		return verificador.resultado(jogador1, jogador2);

	}

	public static Juiz build() {
		Builder builder = new Builder();

		return builder.build();
	}

	public static final class Builder {
		private VerificadorDeJokenpo verificador;

		private Builder() {
			verificador = new VerificadorEmpate(
					new VerificadorPedra(
							new VerificadorPapel(
									new VerificadorTesoura(null))));
		}

		public Juiz build() {
			return new Juiz(this);
		}
	}

}
