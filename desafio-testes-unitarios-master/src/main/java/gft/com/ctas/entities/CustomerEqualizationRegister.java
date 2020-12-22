package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="cyberbank_core.CUSTOMER_EQUALIZATION_REGISTER")
public class CustomerEqualizationRegister implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_EQUALIZATION_REGISTER_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_EQUALIZATION_REGISTER_ID_GENERATOR")
	private long id;

	@ManyToOne
	@JoinColumn(name = "CIPHER_SYSTEM")
	private CipherSystem cipherSystem;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "EQUALIZATION_DIVERG_TYPE")
	private EqualizationDivergType equalizationDivergType;
	
	@Column(name="EQUALIZATION_TIME")
	private Timestamp equalizationTime;

	@Column(name="FIELD_NAME")
	private String fieldName;

	@Column(name="IS_NEW_DIVERGENCE")
	private BigDecimal isNewDivergence;


}