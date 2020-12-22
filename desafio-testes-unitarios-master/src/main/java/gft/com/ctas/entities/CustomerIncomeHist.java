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
@Table(name="CUSTOMER_INCOME_HIST")
@NamedQuery(name="CustomerIncomeHist.findAll", query="SELECT c FROM CustomerIncomeHist c")
public class CustomerIncomeHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_INCOME_HIST_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_INCOME_HIST_ID_GENERATOR")
	private long id;

	@Column(name="\"ACTION\"")
	private String action;

	@Column(name="BANK_ID")
	private BigDecimal bankId;

	@Column(name="CURRENCY_NT")
	private String currencyNt;

	@Column(name="CUSTOMER_ID")
	private String customerId;

	@Column(name="CUSTOMER_INC_INFO_NT")
	private String customerIncInfoNt;

	@Column(name="CUSTOMER_INCOME")
	private BigDecimal customerIncome;

	@Column(name="CUSTOMER_INCOME_TYPE_NT")
	private String customerIncomeTypeNt;

	private String document;

	@Column(name="FUND_ORIGIN_NT")
	private BigDecimal fundOriginNt;

	@Column(name="IDENTIFICATION_NUMBER_EMPLOYER")
	private String identificationNumberEmployer;

	private BigDecimal income;

	@Column(name="INPUT_DATE")
	private Timestamp inputDate;

	@Column(name="MONTHLY_INCOME")
	private BigDecimal monthlyIncome;

	@Column(name="ORIGIN_INCOME")
	private String originIncome;

	@Column(name="PERIOD_CODE_NT")
	private String periodCodeNt;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STAMP_DATE_TIME_CHANGE")
	private Timestamp stampDateTimeChange;

	@Column(name="STAMP_USER_CHANGE")
	private String stampUserChange;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

}