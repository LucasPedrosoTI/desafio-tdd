package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cyberbank_core.BANK")
public class Bank implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="BANK_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BANK_ID_GENERATOR")
	private long id;

	@OneToMany(mappedBy = "bank", fetch = FetchType.LAZY)
	private List<Account> accounts;
	
	@Column(name="BANK_ID")
	private BigDecimal bankId;

	@Column(name="CENTRAL_BANK_ACCOUNT")
	private BigDecimal centralBankAccount;

	@Column(name="CENTRAL_BANK_CODE")
	private BigDecimal centralBankCode;

	@Column(name="CENTRAL_BANK_REPORTING_NAME")
	private String centralBankReportingName;
	
	@ManyToOne
	@JoinColumn(name="COUNTRY_SWIFT")
	private CountrySwift countrySwift; 

	@ManyToOne
	@JoinColumn(name = "CUSTOMER")
	private Customer customer;
	
	@Column(name="EXTERNAL_CORRESPONDENT")
	private BigDecimal externalCorrespondent;

	@Column(name="FINANTIAL_INSTITUTION_TYPE")
	private BigDecimal finantialInstitutionType;

	@ManyToOne
	@JoinColumn(name = "INSTITUTION")
	private Institution institution;
	
	@Column(name="INTERNAL_CORRESPONDENT")
	private BigDecimal internalCorrespondent;

	@Column(name="LONG_DESC")
	private String longDesc;

	private String nemotecnico;

	@Column(name="OFFICIAL_ID")
	private String officialId;

	@Column(name="SHORT_DESC")
	private String shortDesc;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;
	
	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;
	
	@Column(name="SWIFT_CODE")
	private BigDecimal swiftCode;

}