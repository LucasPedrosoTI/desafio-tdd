package com.gft.ctas.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import gft.com.ctas.business.BusinessEnrichment;
import gft.com.ctas.business.impl.BusinessEnrichmentImpl;
import gft.com.ctas.business.impl.BusinessJsonDeserializerImpl;
import gft.com.ctas.entities.Customer;
import gft.com.ctas.entities.PersonType;
import gft.com.ctas.kafka.message.After;
import gft.com.ctas.kafka.message.CtasMessage;
import gft.com.ctas.repository.CustomerRepository;

public class BusinessEnrichmentTest {

	private static final String TESTE = "{}";

	@Mock
	private CustomerRepository customerRepository;

	@Mock
	private BusinessJsonDeserializerImpl deserializer = new BusinessJsonDeserializerImpl();

	@InjectMocks
	private BusinessEnrichment businessEnrichment;

	private CtasMessage ctasMessage;
	private After after;
	private Customer customer;

	@BeforeEach
	public void setup() throws Exception {
		ctasMessage = new CtasMessage();
		after = new After();
		businessEnrichment = new BusinessEnrichmentImpl();
		customer = new Customer();

		MockitoAnnotations.openMocks(this);
	}

	private void mockDeserializer() {
		when(deserializer.jsonDeserializer(TESTE)).thenReturn(ctasMessage);
	}

	private void assertEnrichmentInfo() {
		assertEquals(ctasMessage, businessEnrichment.enrichmentInfo(TESTE));
	}

	@Test
	void deveRetornarCtaMessageSemMudancaQuandoAfterNull() throws Exception {

		mockDeserializer();

		assertEnrichmentInfo();
	}



	@Test
	void deveRetornarCtaMessageSemMudancaQuandoCustomerNull() throws Exception {
		ctasMessage.setAfter(after);

		mockDeserializer();
		when(customerRepository.findByOperationId(null, null)).thenReturn(null);

		assertEnrichmentInfo();
	}

	@Test
	void deveEnriquecerACtasMessage() throws Exception {
		PersonType personType = new PersonType();
		personType.setId(1);

		after.setOperationId(TESTE);
		after.setSubProduct(1);

		customer.setIdentificationNumber(TESTE);
		customer.setCustomerId(TESTE);
		customer.setPersonType(personType);

		ctasMessage.setAfter(after);

		mockDeserializer();
		when(customerRepository.findByOperationId(TESTE, 1)).thenReturn(customer);

		assertEnrichmentInfo();
	}


}
