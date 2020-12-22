package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CUSTOMER_FATCA_ADDITIONAL")
@NamedQuery(name="CustomerFatcaAdditional.findAll", query="SELECT c FROM CustomerFatcaAdditional c")
public class CustomerFatcaAdditional implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_FATCA_ADDITIONAL_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_FATCA_ADDITIONAL_ID_GENERATOR")
	private long id;

	@Column(name="ANSWER_NUMBER")
	private BigDecimal answerNumber;

	@Column(name="IDENTIFICATION_NUMBER")
	private String identificationNumber;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;


}