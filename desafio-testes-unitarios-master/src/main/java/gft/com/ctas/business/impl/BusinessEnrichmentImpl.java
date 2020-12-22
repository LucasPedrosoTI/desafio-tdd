package gft.com.ctas.business.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import gft.com.CtasEnriquecedorApplication;
import gft.com.ctas.business.BusinessEnrichment;
import gft.com.ctas.entities.Customer;
import gft.com.ctas.kafka.message.CtasMessage;
import gft.com.ctas.repository.CustomerRepository;

@Component
public class BusinessEnrichmentImpl implements BusinessEnrichment {

	private static final Logger log = LoggerFactory.getLogger(CtasEnriquecedorApplication.class);

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private BusinessJsonDeserializerImpl businessJsonDeserializerImpl = new BusinessJsonDeserializerImpl();
	
	public CtasMessage enrichmentInfo(String message) {

		log.info("Desererializando mensagem");
		CtasMessage ctasMessage = businessJsonDeserializerImpl.jsonDeserializer(message);

		log.info("Obtendo dados para enriquecimento");
		if (ctasMessage.getAfter() != null) {
			Customer customer = customerRepository.findByOperationId(ctasMessage.getAfter().getOperationId(),
					ctasMessage.getAfter().getSubProduct());
			log.info("Enriquecendo com mais informações da base de dados");
			if (customer != null) {
				ctasMessage.setIdentificationNumber(customer.getIdentificationNumber());
				ctasMessage.setCustomerId(customer.getCustomerId());
				ctasMessage.setPersonType(customer.getPersonType().getId());
				log.info("Mensagem enriquecida com mais informações da base de dados");
			}
		}

		log.info("Mensagem pronta para envio");
		return ctasMessage;
	}
}
