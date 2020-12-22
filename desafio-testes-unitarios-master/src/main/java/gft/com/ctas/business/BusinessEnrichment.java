package gft.com.ctas.business;

import com.google.gson.GsonBuilder;

import gft.com.ctas.kafka.message.CtasMessage;

/**
 * Classe responsavel por enriquecer o objeto com mais informacoes
 * 
 * @since 20/07/2020
 * @author henriquevergara
 * @see GsonBuilder
 * 
 */
public interface BusinessEnrichment {

	/**
	 * Metodo de enriquecimento de mensagem para o Kafka
	 * 
	 * @param String
	 * @return CtasMessage
	 */
	public CtasMessage enrichmentInfo(String message);

}
