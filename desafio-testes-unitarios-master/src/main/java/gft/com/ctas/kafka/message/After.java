package gft.com.ctas.kafka.message;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
@Component
public class After {

	@SerializedName("ID")
	private Integer id;
	@SerializedName("SUBPRODUCT")
	private Integer subProduct;
	@SerializedName("BRANCH")
	private BigDecimal branch;
	@SerializedName("OPERATION_ID")
	private String operationId;
	@SerializedName("ISO_PRODUCT")
	private BigDecimal isoProduct;
	@SerializedName("PRODUCT_IS_OWN")
	private BigDecimal productIsOwn;
	@SerializedName("BUSINESS_SECTOR")
	private BigDecimal businessSector;
	@SerializedName("SOURCE_SUBPRODUCT")
	private BigDecimal sourceSubproduct;
	@SerializedName("SOURCE_BRANCH")
	private BigDecimal sourceBranch;
	@SerializedName("SOURCE_OPERATION_ID")
	private String sourceOperationId;
	@SerializedName("SOURCE_ISO_PRODUCT")
	private BigDecimal sourceIsoProduct;
	@SerializedName("MSG_TYPE_ID")
	private BigDecimal msgTypeId;
	@SerializedName("TRANSACTION_REASON")
	private BigDecimal transactionReason;
	@SerializedName("PURE_ACTION")
	private BigDecimal pureAction;
	@SerializedName("TXN_ACTION_CODE")	
	private BigDecimal txnActionCode;
	@SerializedName("TXN_DESCRIPTION")
	private String txnDescription;
	@SerializedName("REFERENCE_NUMBER")
	private BigDecimal referenceNumber;
	@SerializedName("MOV_INTERNAL_SEQUENCE_NUM")
	private BigDecimal movInternalSequenceNum;
	@SerializedName("CHILD_SEQUENCE_NBR")
	private BigDecimal childSequenceNbr;
	@SerializedName("ORIGINAL_REFERENCE_NUMBER")
	private BigDecimal originalReferenceNumber;
	@SerializedName("TRACE_NUMBER")
	private BigDecimal traceNumber;
	@SerializedName("MOV_AUTH_NUM")
	private String movAuthNum;
	@SerializedName("MOV_ATTENTION_NUM")
	private BigDecimal movAttentionNum;
	@SerializedName("CHECK_NUMBER")
	private String checkNumber;
	@SerializedName("AMOUNT")
	private BigDecimal amount;
	@SerializedName("ORIGINAL_AMOUNT")
	private BigDecimal originalAmount;
	@SerializedName("MOV_DISPENSED_AMOUNT")
	private BigDecimal movDispensedAmount;
	@SerializedName("MOV_ADD_AMOUNT_1")
	private BigDecimal movAddAmount1;
	@SerializedName("MOV_ADD_AMOUNT_2")
	private BigDecimal movAddAmount2;
	@SerializedName("BUSINESS_DATE")
	private Date businessDate;
	@SerializedName("MOV_ACQ_BUSINESS_DATE")
	private Date movAcqBusinessDate;
	@SerializedName("ISSUE_BUSINESS_DATE")
	private Date issueBusinessDate;
	@SerializedName("SOURCE_DATE")
	private Date sourceDate;
	@SerializedName("SOURCE_TIME")
	private Date sourceTime;
	@SerializedName("VALUED_DATE")
	private Date valuedDate;
	@SerializedName("MOV_TRANSMITION_DATE")
	private Date movTransmitionDate;
	@SerializedName("MOV_TRANSMITION_TIME")
	private BigDecimal movTransmitionTime;
	@SerializedName("MOV_TMST_IN_AUTH")
	private BigDecimal movTmstInAuth;
	@SerializedName("MOV_TMST_IN_PRE")
	private BigDecimal movTmstInPre;
	@SerializedName("MOV_TMST_OUT_AUTH")
	private BigDecimal movTmstOutAuth;
	@SerializedName("MOV_TMST_OUT_PRE")
	private BigDecimal movTmstOutPre;
	@SerializedName("IMPUTATION_DATE")
	private Date imputationDate;
	@SerializedName("IMPUTATION_TIME")
	private Date imputationTime;
	@SerializedName("USER_ID")
	private BigDecimal userId;
	@SerializedName("SUPERVISOR_USER")
	private BigDecimal supervisorUser;
	@SerializedName("MOV_BANK_SUPERVISOR_PROFILE")
	private String movBankSupervisorProfile;
	@SerializedName("MOV_BANK_USER_PROFILE")
	private String movBankUserProfile;
	@SerializedName("MOV_BANK_SUPERVISOR")
	private String movBankSupervisor;
	@SerializedName("TERMINAL_UNIT_ID")
	private BigDecimal terminalUnitId;
	@SerializedName("TERMINAL")
	private BigDecimal terminal;
	@SerializedName("TERMINAL_TYPE")
	private BigDecimal terminalType;
	@SerializedName("CHANNEL")
	private BigDecimal channel;
	@SerializedName("ORIGIN_BRANCH")
	private BigDecimal originBranch;
	@SerializedName("MOV_COUNTABLE_BRANCH")
	private BigDecimal movCountableBranch;
	@SerializedName("MOV_LOCATION_ID")
	private BigDecimal movLocationId;
	@SerializedName("SERVICE")
	private BigDecimal service;
	@SerializedName("QUOT_APPLIED")
	private BigDecimal quotApplied;
	@SerializedName("CONVERTED_AMOUNT")
	private BigDecimal convertedAmount;
	@SerializedName("EXCHANGE_TICKET_ID")
	private BigDecimal exchangeTicketId;
	@SerializedName("CURRENCY_CODE")
	private BigDecimal currencyCode;
	@SerializedName("CURRENCY_CODE_OUT")
	private BigDecimal currencyCodeOut;
	@SerializedName("MOV_CUSTOMER")
	private BigDecimal movCustomer;
	@SerializedName("MOV_ACCESS_ID")
	private String movAccessId;
	@SerializedName("MOV_CATEGORY_ID")
	private BigDecimal movCategoryId;
	@SerializedName("MOV_ACQUIRER")
	private String movAcquirer;
	@SerializedName("MOV_ISSUER")
	private String movIssuer;
	@SerializedName("MOV_ORIGINATOR")
	private String movOriginator;
	@SerializedName("MOV_AFFECTED_BALANCE")
	private BigDecimal movAffectedBalance;
	@SerializedName("MOV_DET_AVAIL_BALANCE")
	private BigDecimal movDetAvailBalance;
	@SerializedName("REVERSAL_FLAG")
	private BigDecimal reversalFlag;
	@SerializedName("REVERSAL_NUMBER")
	private BigDecimal reversalNumber;
	@SerializedName("REVERSAL_USER")
	private BigDecimal reversalUser;
	@SerializedName("REVERSAL_DATE")
	private Date reversalDate;
	@SerializedName("REVERSAL_TIME")
	private Date reversalTime;
	@SerializedName("REVERSAL_REASON")
	private BigDecimal reversalReason;
	@SerializedName("HISTORY_PASS")
	private BigDecimal historyPass;
	@SerializedName("IS_CASH")
	private BigDecimal isCash;
	@SerializedName("IS_SITER")
	private BigDecimal isSiter;
	@SerializedName("POST_PENDING")
	private BigDecimal postPending;
	@SerializedName("OFF_LINE_FORM_ID")
	private BigDecimal offLineFormId;
	@SerializedName("AMOUNT_TYPE")
	private BigDecimal amountType;
	@SerializedName("MOMENT_CODE")
	private BigDecimal momentCode;
	@SerializedName("TERM_CODE")
	private BigDecimal termCode;
	@SerializedName("KEY_OTHER_SYSTEM")
	private String keyOtherSystem;
	@SerializedName("MOV_NEW_STATUS")
	private BigDecimal movNewStatus;
	@SerializedName("MOV_OLD_STATUS")
	private BigDecimal movOldStatus;
	@SerializedName("MOV_PAYMENTS")
	private BigDecimal movPayments;
	@SerializedName("MOV_RESP_CODE")
	private BigDecimal movRespCode;
	@SerializedName("MOV_RESPONDER")
	private BigDecimal movResponder;
	@SerializedName("MOV_TRACKI")
	private String movTracki;
	@SerializedName("MOV_TRACKII")
	private String movTrackii;
	@SerializedName("MOV_ADD_DATA_MSG")
	private String movAddDataMsg;
	@SerializedName("MOV_ADD_DATA_DB")
	private String movAddDataDb;
	@SerializedName("MOV_CRM_INFO_SEND")
	private String movCrmInfoSend;
	@SerializedName("MOV_CRM_INFO_RECV")
	private String movCrmInfoRecv;
	@SerializedName("STATUS")
	private BigDecimal status;
	@SerializedName("STATUS_DATE")
	private Date statusDate;
	@SerializedName("STATUS_REASON")
	private Integer statusReason;
	@SerializedName("STAMP_USER")
	private BigDecimal stampUser;
	@SerializedName("STAMP_ADDITIONAL")
	private String stampAdditional;
	@SerializedName("STAMP_DATE_TIME")
	private Date stampDateTime;
	@SerializedName("DEPENDENCY")
	private BigDecimal dependency;
	@SerializedName("OPERATION_CURRENCY_CODE")
	private BigDecimal operationCurrencyCode;
	@SerializedName("SOURCE_CURRENCY_CODE")
	private BigDecimal sourceCurrencyCode;
	@SerializedName("CUSTOMER_SESSION_NUMBER")
	private BigDecimal customerSessionNumber;
	@SerializedName("TRANSACTION_NUMBER")
	private BigDecimal transactionNumber;
	@SerializedName("TEAM")
	private String team;
	@SerializedName("PRTY")
	private BigDecimal prty;
	@SerializedName("COMMENTS")
	private String comments;
	@SerializedName("CATEGORY")
	private BigDecimal category;
	@SerializedName("DATE_FROM")
	private Date dateFrom;
	@SerializedName("DATE_TO")
	private Date dateTo;
	@SerializedName("ROOT_SUBPRODUCT")
	private BigDecimal rootSubproduct;
	@SerializedName("ROOT_BRANCH")
	private BigDecimal rootBranch;
	@SerializedName("ROOT_OPERATION_ID")
	private String rootOperationId;
	@SerializedName("ROOT_ISO_PRODUCT")
	private BigDecimal rootIsoProduct;
	@SerializedName("ROOT_CURRENCY")
	private BigDecimal rootCurrency;
	@SerializedName("BALANCE_POST_TRANSACTION")
	private BigDecimal balancePostTransaction;
}
