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
@Table(name="cyberbank_core.CUSTOMER_CONTACTS")
public class CustomerContact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_CONTACTS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_CONTACTS_ID_GENERATOR")
	private long id;

	@ManyToOne
	@JoinColumn(name = "ACCOUNT")
	private Account account;
	
	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@ManyToOne
	@JoinColumn(name = "BANK")
	private Bank bank;
	
	@ManyToOne
	@JoinColumn(name = "CHARACTERISTIC")
	private Characteristic characteristic;
	
	private String comments;
	
	@ManyToOne
	@JoinColumn(name = "CONTACT_CUSTOMER")
	private Customer contactCustomer;
	
	@ManyToOne
	@JoinColumn(name = "CONTACT_TYPE")
	private ContactType contactType;
	
	@ManyToOne
	@JoinColumn(name = "COMPANY_BUSINESS")
	private CompanyBusiness companyBussiness;
	
	@ManyToOne
	@JoinColumn(name = "COUNTRY")
	private Country country;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER")
	private Customer customer;

	@Column(name="FORNECEDORES_PERCENT")
	private BigDecimal fornecedoresPercent;

	@ManyToOne
	@JoinColumn(name = "FUNCTION_CORE")
	private FunctionCore functionCore;
	
	@Column(name="INSTITUTION_NAME")
	private String institutionName;

	@Column(name="IS_CUSTOMER")
	private BigDecimal isCustomer;

	@Column(name="MONTH_YEAR_CONSUMPTION")
	private String monthYearConsumption;

	@Column(name="MONTHLY_AVERAGE_CONSUMPTION")
	private BigDecimal monthlyAverageConsumption;
	
	@ManyToOne
	@JoinColumn(name = "OPERATOR")
	private Operator operator;
	
	@ManyToOne
	@JoinColumn(name = "PRODUCT")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "RELATION_TYPE")
	private RelationType relationType;

	@Column(name="SPACE_FOR_ADDRESS")
	private String spaceForAddress;

	@Column(name="SPACE_FOR_NAME")
	private String spaceForName;

	@Column(name="SPACE_FOR_OTHER_COMUNICATION")
	private String spaceForOtherComunication;

	@Column(name="SPACE_FOR_PHONE")
	private String spaceForPhone;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;
	
	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;

	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;
	
	@Column(name="YEARS_OF_KNOWING")
	private BigDecimal yearsOfKnowing;

}