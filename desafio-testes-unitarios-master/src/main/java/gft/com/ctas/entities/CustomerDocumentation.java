package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="cyberbank_core.CUSTOMER_DOCUMENTATION")
public class CustomerDocumentation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_DOCUMENTATION_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_DOCUMENTATION_ID_GENERATOR")
	private long id;

	@Column(name="ANALISYS_DATE")
	private Timestamp analisysDate;

	private BigDecimal condition;

	@ManyToOne
	@JoinColumn(name = "COUNTRY")
	private Country country;
	
	@ManyToOne
	@JoinColumn(name = "CURRENCY")
	private Currency currency;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER")
	private Customer customer;
	
	@Column(name="CUSTOMER_DOCUMENTATION_ID")
	private BigDecimal customerDocumentationId;

	@Column(name="DESCRIPTION_VALUE")
	private String descriptionValue;

	@Column(name="DOC_AMMOUNT")
	private BigDecimal docAmmount;

	@Column(name="DOC_SENIORITY")
	private BigDecimal docSeniority;

	@Column(name="DOC_VERSION")
	private BigDecimal docVersion;

	@Column(name="EXPIRATION_DATE")
	private Timestamp expirationDate;

	@Column(name="HERITAGE_CODE")
	private String heritageCode;

	@ManyToOne
	@JoinColumn(name = "INSTITUTION")
	private Institution institution;
	
	private BigDecimal linetype;

	@Column(name="MAX_DELAY_IN_DAYS")
	private BigDecimal maxDelayInDays;

	@Column(name="OK_BANK_LAWYER")
	private BigDecimal okBankLawyer;

	@ManyToOne
	@JoinColumn(name = "ANALISYS_USER")
	private Officer officer;
	
	@Column(name="PRESENTATION_DATE")
	private Timestamp presentationDate;

	@Column(name="REQUERIMENT_TYPE")
	private BigDecimal requerimentType;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Temporal(TemporalType.DATE)
	@Column(name="STATUS_DATE")
	private Date statusDate;

	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;
	
	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;
	
	@ManyToOne
	@JoinColumn(name = "SUBPROD_DOCUMENTATION")
	private SubprodDocumentation subprodDocumentation;
}