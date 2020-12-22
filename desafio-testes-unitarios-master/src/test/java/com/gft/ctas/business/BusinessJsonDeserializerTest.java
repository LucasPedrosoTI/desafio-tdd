package com.gft.ctas.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import gft.com.ctas.business.impl.BusinessJsonDeserializerImpl;
import gft.com.ctas.kafka.message.CtasMessage;

public class BusinessJsonDeserializerTest {

	@Test
	void deveDeserealizar() throws Exception {
		BusinessJsonDeserializerImpl deserializer = new BusinessJsonDeserializerImpl();

		assertEquals(new CtasMessage(), deserializer.jsonDeserializer("{}"));
	}
}
