package com.gft.tdd_jokenpo.service.util;

import com.gft.tdd_jokenpo.model.Jogador;

public class AppUtils {

	private AppUtils() {}

	public static void setVencedorEPerdedor(Jogador vencedor, Jogador perdedor) {
		vencedor.setVencedor(true);
		perdedor.setVencedor(false);
	}
}
