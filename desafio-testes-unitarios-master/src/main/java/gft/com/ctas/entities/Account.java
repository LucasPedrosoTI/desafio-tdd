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
@Table(name = "cyberbank_core.ACCOUNT")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ACCOUNT_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACCOUNT_ID_GENERATOR")
	private long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name="ACCRUAL_SUSPENDED_DATE")
	private Date accrualSuspendedDate;

	@Column(name="ACCUM_PENDING_TXN")
	private BigDecimal accumPendingTxn;

	@Column(name="ACTIVATE_FORM")
	private BigDecimal activateForm;

	@Column(name="APPLIED_BALANCE")
	private BigDecimal appliedBalance;

	@Column(name="AUTHORIZATION_REASON")
	private BigDecimal authorizationReason;

	@Column(name="AVAILABLE_BAL_PROCESS_TIME")
	private Timestamp availableBalProcessTime;

	@Column(name="AVAILABLE_BAL_PROCESS_TYPE")
	private BigDecimal availableBalProcessType;

	@Column(name="BALANCE_TODAY")
	private BigDecimal balanceToday;

	@Column(name="BALANCE_YESTERDAY")
	private BigDecimal balanceYesterday;

	@ManyToOne
	@JoinColumn(name = "BANK")
	private Bank bank;
	
	@ManyToOne
	@JoinColumn(name = "BANK_ACTIVITY_CODE")
	private BankActivityCode bankActivityCode;
	
	@Column(name="BLOCKED_BALANCE")
	private BigDecimal blockedBalance;

	@ManyToOne
	@JoinColumn(name = "BRANCH")
	private Branch branch;
	
	@Column(name="BUK_NUMBER")
	private String bukNumber;

	@ManyToOne
	@JoinColumn(name = "BUSINESS_SECTOR")
	private BusinessSector businessSector;
	
	@ManyToOne
	@JoinColumn(name = "CENTRAL_BANK_ACTIVITY_CODE")
	private CentralBankActivityCode centralBankActicityCode;
	
	@ManyToOne
	@JoinColumn(name = "CHANNEL")
	private Channel channel;
	
	@Column(name="CHECK_DIGIT_OUT")
	private BigDecimal checkDigitOut;

	@Temporal(TemporalType.DATE)
	@Column(name="CHECK_TEMPORARY_RECEIVERSHIP")
	private Date checkTemporaryReceivership;

	@Column(name="CHECKS_ALLOWED_FLAG")
	private BigDecimal checksAllowedFlag;

	@Column(name="CHECKS_OTHERS_TERMS")
	private BigDecimal checksOthersTerms;

	@Column(name="CHECKS24_HRS")
	private BigDecimal checks24Hrs;

	@Column(name="CHECKS48_HRS")
	private BigDecimal checks48Hrs;

	@Column(name="CHECKS72_HRS")
	private BigDecimal checks72Hrs;

	@Column(name="CHECKS96_HRS")
	private BigDecimal checks96Hrs;

	@Column(name="CLOSED_CODE")
	private BigDecimal closedCode;

	@Temporal(TemporalType.DATE)
	@Column(name="CLOSED_DATE")
	private Date closedDate;

	@Column(name="CLOSED_DESCRIPTION_MOTIVE")
	private String closedDescriptionMotive;

	@Column(name="CNT_CHK_FORMAL_REJECT_MTD")
	private BigDecimal cntChkFormalRejectMtd;

	@Column(name="CNT_CHK_FORMAL_REJECT_YTD")
	private BigDecimal cntChkFormalRejectYtd;

	@Column(name="CNT_CHK_JUSTIFIED_YTD")
	private BigDecimal cntChkJustifiedYtd;

	@Column(name="CNT_CHK_REJECT_MTD")
	private BigDecimal cntChkRejectMtd;

	@Column(name="CNT_CHK_REJECT_YTD")
	private BigDecimal cntChkRejectYtd;

	@Column(name="CNT_NORMAL_STT")
	private BigDecimal cntNormalStt;

	@Column(name="CNT_ONP_YTD")
	private BigDecimal cntOnpYtd;

	@Column(name="CNT_SPECIAL_STT")
	private BigDecimal cntSpecialStt;

	@Column(name="CNT_STOP_PAYMENTS_YTD")
	private BigDecimal cntStopPaymentsYtd;

	@Column(name="CNT_WITHDRAWAL")
	private BigDecimal cntWithdrawal;

	@Column(name="COMPENSATION_GROUP")
	private BigDecimal compensationGroup;

	@Column(name="CR_RESTRICTION")
	private BigDecimal crRestriction;

	@ManyToOne
	@JoinColumn(name = "CURRENCY")
	private Currency currency;
	
	@Column(name="CUSTOMER_NUMBER_DECLARED")
	private BigDecimal customerNumberDeclared;

	@Column(name="CUSTOMER_NUMBER_FOR_INSURANCE")
	private BigDecimal customerNumberForInsurance;

	@Column(name="CUSTOMER_NUMBER_REACHED")
	private BigDecimal customerNumberReached;

	@Temporal(TemporalType.DATE)
	@Column(name="DATA_COMPLETE_CUSTOMER")
	private Date dataCompleteCustomer;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OF_CLOSURE")
	private Date dateOfClosure;

	@Column(name="DB_BAL_ALLOWED_FLAG")
	private BigDecimal dbBalAllowedFlag;

	@Temporal(TemporalType.DATE)
	@Column(name="DB_BALANCE_START_DATE")
	private Date dbBalanceStartDate;

	@Column(name="DB_BALANCE_TO_ACCRUAL")
	private BigDecimal dbBalanceToAccrual;

	@Column(name="DB_BALANCE_TOTAL_DAYS")
	private BigDecimal dbBalanceTotalDays;

	@Column(name="DB_DAYS_WITHOUT_AGREEMENT")
	private BigDecimal dbDaysWithoutAgreement;

	@Column(name="DB_RESTRICTION")
	private BigDecimal dbRestriction;

	@Column(name="DEBIT_MODE_TYPE")
	private BigDecimal debitModeType;

	@Column(name="DEP_AVAILABLE_TODAY")
	private BigDecimal depAvailableToday;

	@Column(name="DEPOSIT_RESTRICTION")
	private BigDecimal depositRestriction;

	@Column(name="DEPOSITS_OTHER_TERMS")
	private BigDecimal depositsOtherTerms;

	@Column(name="DEPOSITS24_HRS")
	private BigDecimal deposits24Hrs;

	@Column(name="DEPOSITS48_HRS")
	private BigDecimal deposits48Hrs;

	@Column(name="DEPOSITS72_HRS")
	private BigDecimal deposits72Hrs;

	@Column(name="DEPOSITS96_HRS")
	private BigDecimal deposits96Hrs;

	@Column(name="DOC_AMOUNT")
	private BigDecimal docAmount;

	@Column(name="DONOT_DORMANT_FLAG")
	private BigDecimal donotDormantFlag;

	@Column(name="FORCED_STT_FLAG")
	private BigDecimal forcedSttFlag;
	
	@Column(name="INHIBIT_CHECKBOOK_FLAG")
	private BigDecimal inhibitCheckbookFlag;

	@Column(name="INPUT_DATE")
	private Timestamp inputDate;

	@ManyToOne
	@JoinColumn(name = "INSURANCE_CODE")
	private InsuranceCode insuranceCode;
	
	@Column(name="INTERBRANCH_ALLOWED")
	private BigDecimal interbranchAllowed;

	@ManyToOne
	@JoinColumn(name = "ISO_PRODUCT")
	private IsoProductType isoProductType;
	
	@Temporal(TemporalType.DATE)
	@Column(name="LAST_ACCRUAL_DATE")
	private Date lastAccrualDate;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_DATE_EMITTED")
	private Date lastDateEmitted;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_HISTORY_PROCESS")
	private Date lastHistoryProcess;

	@Column(name="LAST_MOV_BAL_DATE")
	private Timestamp lastMovBalDate;

	@Column(name="LAST_PAGE_EMITTED")
	private BigDecimal lastPageEmitted;

	@Column(name="LAST_PAGE_GENERATED")
	private BigDecimal lastPageGenerated;

	@Column(name="LAST_PROCESS_DATE")
	private Timestamp lastProcessDate;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_STAT_PROCESS")
	private Date lastStatProcess;

	@Column(name="LAST_STT_BALANCE")
	private BigDecimal lastSttBalance;

	@Column(name="LAST_TXN_2DATE")
	private Timestamp lastTxn2date;

	@Column(name="LAST_TXN_DATE")
	private Timestamp lastTxnDate;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_TXN_EXT_CR_DATE")
	private Date lastTxnExtCrDate;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_TXN_EXT_DB_DATE")
	private Date lastTxnExtDbDate;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_TXN_INT_CR_DATE")
	private Date lastTxnIntCrDate;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_TXN_INT_DB_DATE")
	private Date lastTxnIntDbDate;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_WITHDRAWAL_DATE")
	private Date lastWithdrawalDate;

	@Column(name="LINE_STT_NUMBER")
	private BigDecimal lineSttNumber;

	@Column(name="LINK_TO_PACKAGE")
	private BigDecimal linkToPackage;

	@Column(name="MIN_DAYS_FOR_CHECKS")
	private BigDecimal minDaysForChecks;

	@Column(name="MOVEMENT_BALANCE")
	private BigDecimal movementBalance;

	private String name;

	@Column(name="NETTING_GROUP")
	private BigDecimal nettingGroup;

	@Column(name="NICK_NAME")
	private String nickName;

	@Column(name="NOTICE_OF_CLOSURE_FLAG")
	private BigDecimal noticeOfClosureFlag;

	@Temporal(TemporalType.DATE)
	@Column(name="OLDEST_VALUED_DATE_TXN")
	private Date oldestValuedDateTxn;

	@Column(name="OPENING_CODE_MOTIVE")
	private BigDecimal openingCodeMotive;

	@Temporal(TemporalType.DATE)
	@Column(name="OPENING_DATE")
	private Date openingDate;

	@Column(name="OPENING_DESCRIPTION_MOTIVE")
	private String openingDescriptionMotive;

	@Column(name="OPERATION_ID")
	private String operationId;

	@Column(name="OTHER_CR_OTHER_TERMS")
	private BigDecimal otherCrOtherTerms;

	@Column(name="OTHER_CR24_HRS")
	private BigDecimal otherCr24Hrs;

	@Column(name="OTHER_CR48_HRS")
	private BigDecimal otherCr48Hrs;

	@Column(name="OTHER_CR72_HRS")
	private BigDecimal otherCr72Hrs;

	@Column(name="OTHER_CR96_HRS")
	private BigDecimal otherCr96Hrs;

	@Column(name="OTHER_DB_OTHER_TERMS")
	private BigDecimal otherDbOtherTerms;

	@Column(name="OTHER_DB24_HRS")
	private BigDecimal otherDb24Hrs;

	@Column(name="OTHER_DB48_HRS")
	private BigDecimal otherDb48Hrs;

	@Column(name="OTHER_DB72_HRS")
	private BigDecimal otherDb72Hrs;

	@Column(name="OTHER_DB96_HRS")
	private BigDecimal otherDb96Hrs;
	
	@ManyToOne
	@JoinColumn(name = "PACK_SUBPRODUCT")
	private Subproduct packSubProduct;

	@Column(name="PACK_MAIN_ACCOUNT")
	private BigDecimal packMainAccount;

	@Column(name="PACK_OPERATION_ID")
	private String packOperationId;

	@Column(name="POSITIONING_GROUP")
	private BigDecimal positioningGroup;

	@Column(name="PRICE_LIST_PROFILE")
	private BigDecimal priceListProfile;
	
	@ManyToOne
	@JoinColumn(name = "product")
	private Product product;
	
	@Column(name="RESERVE_BALANCE")
	private BigDecimal reserveBalance;

	@Column(name="SHADOW_FLAG")
	private BigDecimal shadowFlag;

	@Column(name="SHORT_NAME")
	private String shortName;

	@Column(name="SITUATION_CODE")
	private BigDecimal situationCode;

	@Column(name="SPECIAL_FEES")
	private BigDecimal specialFees;

	@Column(name="SPECIAL_RATES")
	private BigDecimal specialRates;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;
	
	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;
	
	@ManyToOne
	@JoinColumn(name = "STT_PERIOD")
	private Period sttPeriod;
	
	@Column(name="STT_TYPE")
	private BigDecimal sttType;

	@Column(name="SUB_CURRENCY_IS_OBLIGATORY")
	private BigDecimal subCurrencyIsObligatory;

	@ManyToOne
	@JoinColumn(name = "SUBPRODUCT")
	private Subproduct subProduct;
	
	@Column(name="SYSTEM_USER_CORE")
	private String systemUserCore;

	@Column(name="TIPOLOGY_CODE")
	private BigDecimal tipologyCode;

	@Column(name="TODAY_CASH_DEPOSITS")
	private BigDecimal todayCashDeposits;

	@Column(name="TODAY_CASH_WITHDRAWAL")
	private BigDecimal todayCashWithdrawal;

	@Column(name="TODAY_DEPOSITS_OTHER_TERMS")
	private BigDecimal todayDepositsOtherTerms;

	@Column(name="TODAY_DEPOSITS24_HRS")
	private BigDecimal todayDeposits24Hrs;

	@Column(name="TODAY_DEPOSITS48_HRS")
	private BigDecimal todayDeposits48Hrs;

	@Column(name="TODAY_DEPOSITS72_HRS")
	private BigDecimal todayDeposits72Hrs;

	@Column(name="TODAY_DEPOSITS96_HRS")
	private BigDecimal todayDeposits96Hrs;

	@Column(name="TODAY_OTHER_CR")
	private BigDecimal todayOtherCr;

	@Column(name="TODAY_OTHER_DB")
	private BigDecimal todayOtherDb;

	@Column(name="TODAY24_HRS_DB")
	private BigDecimal today24HrsDb;

	@Column(name="TOMORROW_AGREEMENTS")
	private BigDecimal tomorrowAgreements;

	@Column(name="TOMORROW_BLOCKED")
	private BigDecimal tomorrowBlocked;

	@Column(name="TOMORROW_CR")
	private BigDecimal tomorrowCr;

	@Column(name="TOMORROW_DB")
	private BigDecimal tomorrowDb;

	@Column(name="TOTAL_AGREEMENTS")
	private BigDecimal totalAgreements;

	@Column(name="TOTAL_DB_ACCRUED_INTEREST")
	private BigDecimal totalDbAccruedInterest;

	@Column(name="UPDATE_DATE")
	private Timestamp updateDate;

	@Column(name="USE_OF_SIGNATURE")
	private BigDecimal useOfSignature;

	@ManyToOne
	@JoinColumn(name = "VAT_CATEGORY")
	private VatCategory vatCategory;
	
	@Column(name="VERIF_HIST_BAL_FLAG")
	private BigDecimal verifHistBalFlag;

	@Column(name="WITHDRAWAL_RESTRICTION")
	private BigDecimal withdrawalRestriction;

	@Column(name="YESTERDAY_CR")
	private BigDecimal yesterdayCr;

	@Column(name="YESTERDAY_DB")
	private BigDecimal yesterdayDb;

}