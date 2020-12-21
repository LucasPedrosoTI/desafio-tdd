package com.gft.tdd_jokenpo.model;


public class Jogador {

	private Opcao opcao;

	public Opcao getOpcao() {
		return opcao;
	}

	public void setOpcao(Opcao opcao) {
		this.opcao = opcao;
	}

	private Jogador(Builder builder) {
		this.opcao = builder.opcao;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private Opcao opcao;

		private Builder() {}

		public Builder withOpcao(Opcao opcao) {
			this.opcao = opcao;
			return this;
		}

		public Jogador build() {
			return new Jogador(this);
		}
	}

}
