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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "cyberbank_core.SUBPRODUCT")
public class Subproduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SUBPRODUCT_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SUBPRODUCT_ID_GENERATOR")
	private long id;

	@Column(name="ACCEPT_OTHER_CURRENCY")
	private BigDecimal acceptOtherCurrency;

	@Column(name="ACCOUNTING_STRIP")
	private BigDecimal accountingStrip;

	@Column(name="AUTOM_NBR_ACCT_FLAG")
	private BigDecimal automNbrAcctFlag;

	@Column(name="AUTOM_NBR_ACCT_MODE")
	private BigDecimal automNbrAcctMode;

	@Column(name="BATCH_PROCESS_FLAG")
	private BigDecimal batchProcessFlag;

	@Column(name="CHECK_DIGIT")
	private BigDecimal checkDigit;

	@Column(name="CRM_INFO")
	private String crmInfo;

	@Temporal(TemporalType.DATE)
	@Column(name="CRM_INFO_EXPIRY_DATE")
	private Date crmInfoExpiryDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FROM")
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TO")
	private Date dateTo;

	@Column(name="IS_ALLOWED_CLOSURE")
	private BigDecimal isAllowedClosure;

	@Column(name="IS_CONDITION_UPDATE_ALLOWED")
	private BigDecimal isConditionUpdateAllowed;

	@Column(name="IS_FOR_ALL_BRANCHES")
	private BigDecimal isForAllBranches;

	@Column(name="IS_FORCED_BUSINESS_SECTOR")
	private BigDecimal isForcedBusinessSector;

	@Column(name="IS_FUNDS_SETTLEMENT_ALLOWED")
	private BigDecimal isFundsSettlementAllowed;

	@Column(name="IS_INTERBRANCH_ALLOWED")
	private BigDecimal isInterbranchAllowed;

	@Column(name="IS_PACKAGES_ALLOWED")
	private BigDecimal isPackagesAllowed;

	@Column(name="LONG_DESC")
	private String longDesc;

	private String nemotecnico;

	@Column(name="OFFICIAL_ID")
	private String officialId;

	@Column(name="SHORT_DESC")
	private String shortDesc;

	@Column(name="SPECIAL_COMISSION_FLAG")
	private BigDecimal specialComissionFlag;

	@Column(name="SPECIAL_CR_INTEREST_FLAG")
	private BigDecimal specialCrInterestFlag;

	@Column(name="SPECIAL_DB_INTEREST_FLAG")
	private BigDecimal specialDbInterestFlag;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="STT_DAY_NBR")
	private BigDecimal sttDayNbr;

	@Column(name="STT_DAY_WEEK_1")
	private BigDecimal sttDayWeek1;

	@Column(name="STT_DAY_WEEK_2")
	private BigDecimal sttDayWeek2;

	@Column(name="STT_DAY_WEEK_3")
	private BigDecimal sttDayWeek3;

	@Column(name="STT_INTERVAL")
	private BigDecimal sttInterval;

	@Column(name="STT_ISSUE_FLAG")
	private BigDecimal sttIssueFlag;

	@Column(name="STT_MAX_LINES")
	private BigDecimal sttMaxLines;

	@Column(name="STT_MONTH_NBR")
	private BigDecimal sttMonthNbr;

	@Column(name="STT_ORDER")
	private BigDecimal sttOrder;

	@Column(name="SUBPRODUCT_ID")
	private String subproductId;

	@Column(name="SYSTEM_USER_CORE")
	private String systemUserCore;

	@Column(name="VALUED_DATE_INT_MAX_DAYS")
	private BigDecimal valuedDateIntMaxDays;

	@Column(name="VALUED_DATE_INT_MODE")
	private BigDecimal valuedDateIntMode;

	@Column(name="VALUED_DATE_TXN_ALLOWED")
	private BigDecimal valuedDateTxnAllowed;

	@Column(name="VALUED_DATE_TXN_MAX_DAYS")
	private BigDecimal valuedDateTxnMaxDays;

	@Column(name="VALUED_DATE_TXN_MODE")
	private BigDecimal valuedDateTxnMode;

	@Column(name="WARRANTY_REQ_FLAG")
	private BigDecimal warrantyReqFlag;
	
}