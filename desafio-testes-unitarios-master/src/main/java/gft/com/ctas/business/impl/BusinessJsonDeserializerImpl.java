package gft.com.ctas.business.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import gft.com.CtasEnriquecedorApplication;
import gft.com.ctas.business.BusinessJsonDeserializer;
import gft.com.ctas.kafka.message.CtasMessage;
import gft.com.ctas.util.DateDeserializer;

@Component
public class BusinessJsonDeserializerImpl implements BusinessJsonDeserializer {

	private static final Logger log = LoggerFactory.getLogger(CtasEnriquecedorApplication.class);

	private GsonBuilder gsonBuilder = new GsonBuilder();

	@Override
	public CtasMessage jsonDeserializer(String message) {

		log.info("Registrando adapter para corrigir diferencas de data");
		gsonBuilder.registerTypeAdapter(Date.class, new DateDeserializer());

		log.info("Criando objeto gson para cast de json");
		Gson gson = gsonBuilder.create();

		log.info("Efetuando o cast");
		return gson.fromJson(message, new TypeToken<CtasMessage>() {
		}.getType());

	}

}
