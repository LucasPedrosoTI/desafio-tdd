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
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="TAX_IDENTIFICATION")
@NamedQuery(name="TaxIdentification.findAll", query="SELECT t FROM TaxIdentification t")
public class TaxIdentification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TAX_IDENTIFICATION_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TAX_IDENTIFICATION_ID_GENERATOR")
	private long id;

	private BigDecimal customer;

	@Column(name="GROSS_INCOME_EXCEPTION_RATE")
	private BigDecimal grossIncomeExceptionRate;

	@Column(name="GROSS_INCOME_JURISDICTION")
	private BigDecimal grossIncomeJurisdiction;

	@Column(name="GROSS_INCOME_TAX_EX_DECREE")
	private String grossIncomeTaxExDecree;

	@Temporal(TemporalType.DATE)
	@Column(name="GROSS_INCOME_TAX_EX_EXPIRY")
	private Date grossIncomeTaxExExpiry;

	@Column(name="GROSS_INCOME_TAX_EXEMPT_FLAG")
	private BigDecimal grossIncomeTaxExemptFlag;

	@Column(name="GROSS_INCOME_TAX_FLAG")
	private BigDecimal grossIncomeTaxFlag;

	@Column(name="GROSS_INCOME_TAX_TYPE")
	private BigDecimal grossIncomeTaxType;

	@Column(name="INCOME_TAX_FLAG")
	private BigDecimal incomeTaxFlag;

	@Column(name="PROFIT_EXCEPTION_DECREE")
	private String profitExceptionDecree;

	@Temporal(TemporalType.DATE)
	@Column(name="PROFIT_TAX_EXCEPTION_EXPIRY")
	private Date profitTaxExceptionExpiry;

	@Column(name="PROFIT_TAX_EXCEPTION_FLAG")
	private BigDecimal profitTaxExceptionFlag;

	@Column(name="PROFIT_TAX_EXCEPTION_RATE")
	private BigDecimal profitTaxExceptionRate;

	@Column(name="PROFIT_TAX_INFLATION_ADJUSTMEN")
	private String profitTaxInflationAdjustmen;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="SYSTEM_USER_CORE")
	private String systemUserCore;

	@Column(name="VAT_EXCEPTION_DECREE")
	private String vatExceptionDecree;

	@Temporal(TemporalType.DATE)
	@Column(name="VAT_EXCEPTION_EXPIRY_DATE")
	private Date vatExceptionExpiryDate;

	@Column(name="VAT_EXCEPTION_RATE")
	private BigDecimal vatExceptionRate;

	@Column(name="VAT_EXEMPT_FLAG")
	private BigDecimal vatExemptFlag;

	@Column(name="VAT_EXEMPT_PERCEPTION_FLAG")
	private BigDecimal vatExemptPerceptionFlag;
	
}