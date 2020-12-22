package gft.com.ctas.business;

import com.google.gson.GsonBuilder;

import gft.com.ctas.kafka.message.CtasMessage;


/**
 * Classe responsavel por deserealizar mensagem vinda do Kafka
 * 
 * @since 20/07/2020
 * @author henriquevergara
 * @see GsonBuilder
 * 
 */
public interface BusinessJsonDeserializer {
	
	/**
	 * Metodo de deserializacao de string para o objeto ctas-contas
	 * 
	 * @param String
	 * @return CtasMessage
	 */
	public CtasMessage jsonDeserializer(String message);

}
