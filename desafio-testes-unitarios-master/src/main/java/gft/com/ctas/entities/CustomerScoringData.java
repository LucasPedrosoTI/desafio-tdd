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
@Table(name="cyberbank_core.CUSTOMER_SCORING_DATA")
public class CustomerScoringData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_SCORING_DATA_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_SCORING_DATA_ID_GENERATOR")
	private long id;

	private BigDecimal age;

	private BigDecimal amount;

	@Column(name="APROVED_AMOUNT")
	private BigDecimal aprovedAmount;

	@Column(name="BUSINESS_EXPIRIENCE")
	private BigDecimal businessExpirience;

	@Column(name="COMMERCIAL_ONE")
	private BigDecimal commercialOne;

	@Column(name="COMMERCIAL_TWO")
	private BigDecimal commercialTwo;

	@Column(name="CREDIT_HISTORY")
	private BigDecimal creditHistory;

	@Column(name="CREDIT_TYPE")
	private BigDecimal creditType;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_GROUP_CICLE")
	private CustomerGroupCicle customerGroupCicle;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FROM")
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TO")
	private Date dateTo;

	private BigDecimal employments;

	private BigDecimal expirience;

	@Column(name="FAMILY_SIZE")
	private BigDecimal familySize;

	@Column(name="FLAT_NUMBER")
	private BigDecimal flatNumber;

	private BigDecimal front;

	@Column(name="HOUSE_TYPE")
	private BigDecimal houseType;

	@Column(name="LOAN_DESTINY")
	private BigDecimal loanDestiny;

	@Column(name="MARITAL_STATUS")
	private BigDecimal maritalStatus;

	private BigDecimal maturaty;

	@Column(name="MAX_AMOUNT_BURO")
	private BigDecimal maxAmountBuro;

	@Column(name="PERSONAL_ONE")
	private BigDecimal personalOne;

	@Column(name="PERSONAL_TWO")
	private BigDecimal personalTwo;

	@Column(name="RESIDENCE_AGE")
	private BigDecimal residenceAge;

	private BigDecimal roof;

	@Column(name="ROOM_NUMBER")
	private BigDecimal roomNumber;

	@Column(name="SEARCH_QUANTITY")
	private BigDecimal searchQuantity;

	@Column(name="SEX_CODE")
	private BigDecimal sexCode;

	@Column(name="SHOP_TYPE")
	private BigDecimal shopType;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;
	
	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;

	@Temporal(TemporalType.DATE)
	@Column(name="STATUS_DATE")
	private Date statusDate;
	
	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;

	@Column(name="\"TYPE\"")
	private BigDecimal type;

	@Column(name="VERIFICATION_AMOUNT")
	private BigDecimal verificationAmount;

	@Column(name="\"ZONE\"")
	private BigDecimal zone;

}