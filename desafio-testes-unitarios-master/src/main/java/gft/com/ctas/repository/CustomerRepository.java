package gft.com.ctas.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import gft.com.ctas.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
	
	@Query(value = "select * from cyberbank_core.customer where id = ?1", nativeQuery = true)
	public Customer getById(Long id);
		
	@Query(value = "select C.* from CYBERBANK_CORE.CUSTOMER_IDENTIFICATION CI JOIN CYBERBANK_CORE.IDENTIFICATION_TYPE IT ON CI.IDENTIFICATION_TYPE = IT.ID JOIN CYBERBANK_CORE.CUSTOMER C ON CI.CUSTOMER = C.ID JOIN CYBERBANK_CORE.PERSON_TYPE PT ON C.PERSON_TYPE = PT.ID JOIN CYBERBANK_CORE.CUSTOMER_OPERATION CO ON CO.CUSTOMER = C.ID WHERE IT.NEMOTECNICO IN ('CPF','CNPJ') AND CO.OPERATION_ID= :operationId AND CO.SUBPRODUCT= :subProduct", nativeQuery = true)
	public Customer findByOperationId(String operationId, Integer subProduct );
	
}
