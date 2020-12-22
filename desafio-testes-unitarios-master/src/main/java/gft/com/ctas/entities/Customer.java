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
@Table(name = "cyberbank_core.CUSTOMER")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_ID_GENERATOR")
	private long id;

	@ManyToOne
	@JoinColumn(name = "ATTENTION_SEGMENT")
	private AttentionSegment attentionSegment;
	
	@Temporal(TemporalType.DATE)
	@Column(name="ADDITION_DATE")
	private Date additionDate;

	@ManyToOne
	@JoinColumn(name = "BANK_ACTIVITY_CODE")
	private BankActivityCode bankActivityCode;	
	
	@ManyToOne
	@JoinColumn(name = "BANK_ACTIVITY_SECOND")
	private BankActivityCode bankActivitySecond;
	
	@ManyToOne
	@JoinColumn(name = "BANK_LINK_TYPE")
	private BankLinkType bankLinkType;
	
	@ManyToOne
	@JoinColumn(name = "BUSINESS_SECTOR")
	private BusinessSector businessSector;
	
	@ManyToOne
	@JoinColumn(name = "ORIGINATING_BRANCH")
	private Branch branch;
	
	@ManyToOne
	@JoinColumn(name = "CENTRAL_BANK_ACTIVITY_CODE")
	private CentralBankActivityCode centralBankActivityCode;
	
	@ManyToOne
	@JoinColumn(name = "CENTRAL_BK_ACTIVITY_SECOND")
	private CentralBankActivityCode centralBkActivitySecond;
	
	@ManyToOne
	@JoinColumn(name = "CHANNEL")
	private Channel channel;
	
	@ManyToOne
	@JoinColumn(name = "CLASSIFICATION_CODE")
	private ClassificationCode classificationCode;
	
	@ManyToOne
	@JoinColumn(name = "CONDITION")
	private Condition condition;
	
	@Column(name="CONFIDENTIAL_FLAG")
	private BigDecimal confidentialFlag;

	@ManyToOne
	@JoinColumn(name = "CONTACT_BANK")
	private ContactBank contactBank;
	
	@ManyToOne
	@JoinColumn(name = "RESIDENCE_CODE")
	private Country country;
	
	@Column(name="CREDIT_STATUS_DATE")
	private Timestamp creditStatusDate;
	
	@ManyToOne
	@JoinColumn(name = "CREDIT_STATUS")
	private CreditStatus creditStatus;

	@ManyToOne
	@JoinColumn(name = "CUSTOMER_TYPE")
	private CustomerType customerType;
	
	@Column(name="CRM_INFO")
	private String crmInfo;

	@Column(name="CUSTOMER_ID")
	private String customerId;

	@ManyToOne
	@JoinColumn(name = "DEPARTMENT")
	private Department department;
	
	@Column(name="DEPENDENTS_F")
	private BigDecimal dependentsF;

	@Column(name="DEPENDENTS_M")
	private BigDecimal dependentsM;

	private String description;

	@ManyToOne
	@JoinColumn(name = "EPAY_PERSON_TYPE")
	private EpayPersonType epayPersonType;
	
	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRY_DATE_CRM_INFO")
	private Date expiryDateCrmInfo;

	@Column(name="FIRST_NAME1")
	private String firstName1;

	@Column(name="FIRST_NAME2")
	private String firstName2;

	@Column(name="IDENTIFICATION_NUMBER")
	private String identificationNumber;
	
	@ManyToOne
	@JoinColumn(name = "IDENTIFICATION_TYPE")
	private IdentificationType identificationType;

	@ManyToOne
	@JoinColumn(name = "INSTITUTION")
	private Institution instituition;
	
	@Column(name="IS_DUPLICATED")
	private BigDecimal isDuplicated;

	@Column(name="IS_EMPLOYEE")
	private BigDecimal isEmployee;

	@Column(name="LAST_NAME1")
	private String lastName1;

	@Column(name="LAST_NAME2")
	private String lastName2;

	private String name;

	@Column(name="NAME_SHORT")
	private String nameShort;
	
	@ManyToOne
	@JoinColumn(name = "ORIGIN_CUSTOMER")
	private OriginCustomer originCustomer;

	private BigDecimal pep;

	@ManyToOne
	@JoinColumn(name = "PERSON_TYPE")
	private PersonType personType;
	
	@Temporal(TemporalType.DATE)
	@Column(name="PURGE_DATE")
	private Date purgeDate;
	
	@ManyToOne
	@JoinColumn(name = "PURGE_REASON")
	private PurgeReason purgeReason;
	
	@ManyToOne
	@JoinColumn(name = "PRIMARY_PRODUCT")
	private Product primaryProduct;
	
	@ManyToOne
	@JoinColumn(name = "RESPONSABILITY_OFFICER")
	private Officer responsabilityOfficer;

	@ManyToOne
	@JoinColumn(name = "SEGMENT")
	private Segment segment;
	
	@Temporal(TemporalType.DATE)
	@Column(name="SENIORITY_BANK")
	private Date seniorityBank;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;
	
	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;
	
	@ManyToOne
	@JoinColumn(name = "SUBSIDIARY")
	private Subsidiary subsidiary;
	
	@Column(name="STATUS_DATE")
	private Timestamp statusDate;
	
	@ManyToOne
	@JoinColumn(name = "PRIMARY_SUBPRODUCT")
	private Subproduct subProduct;
	
	@ManyToOne
	@JoinColumn(name = "SYSTEM_USER_CORE")
	private SystemUserCore systemUserCore; 

}