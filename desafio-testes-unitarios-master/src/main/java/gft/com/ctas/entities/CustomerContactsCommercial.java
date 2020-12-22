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
@Table(name="cyberbank_core.CUSTOMER_CONTACTS_COMMERCIAL")
public class CustomerContactsCommercial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_CONTACTS_COMMERCIAL_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_CONTACTS_COMMERCIAL_ID_GENERATOR")
	private long id;

	@Column(name="ACCOUNT_AMOUNT")
	private BigDecimal accountAmount;

	@Column(name="CREDIT_BALANCE")
	private BigDecimal creditBalance;

	@ManyToOne
	@JoinColumn(name = "CURRENCY")
	private Currency currency;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_CONTACS")
	private CustomerContact customerContact;
	
	private String description;

	private BigDecimal monthly;

	@Column(name="OPENING_DATE")
	private Timestamp openingDate;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;
	
}