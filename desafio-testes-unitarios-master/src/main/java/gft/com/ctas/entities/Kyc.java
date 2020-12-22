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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@NamedQuery(name="Kyc.findAll", query="SELECT k FROM Kyc k")
public class Kyc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="KYC_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="KYC_ID_GENERATOR")
	private long id;

	@Column(name="ACCURACY_OF_INFORMATION")
	private BigDecimal accuracyOfInformation;

	@Column(name="ADDRESS_VISIT_REASON")
	private String addressVisitReason;

	@Column(name="ANNUAL_VALUE_EXPECTED")
	private BigDecimal annualValueExpected;

	@Column(name="ATTENTION_POINT")
	private BigDecimal attentionPoint;

	@Column(name="COAF_RESPONSIBLE_CPF")
	private BigDecimal coafResponsibleCpf;

	@Column(name="COAF_RESPONSIBLE_NAME")
	private String coafResponsibleName;

	@Column(name="COUNTRY_RESIDENCE")
	private BigDecimal countryResidence;

	@Column(name="CPF_BEARER")
	private BigDecimal cpfBearer;

	@Column(name="CUSTOMER_VISIT")
	private BigDecimal customerVisit;

	@Column(name="DERIVATIVES_OPERATIONS")
	private BigDecimal derivativesOperations;

	@Column(name="DESC_SEARCH_UPMINER")
	private String descSearchUpminer;

	@Temporal(TemporalType.DATE)
	@Column(name="EMISSION_DATE")
	private Date emissionDate;

	private String estado;

	@Column(name="EXCHANGE_OPERATIONS")
	private BigDecimal exchangeOperations;

	@Column(name="EXPORT_EXCH_VOL_SUBSID_LAST12M")
	private BigDecimal exportExchVolSubsidLast12m;

	@Column(name="EXPORT_EXCHANGE_VOLUME_LAST12M")
	private BigDecimal exportExchangeVolumeLast12m;

	@Column(name="EXPORT_MAKER")
	private BigDecimal exportMaker;

	@Column(name="EXPORT_OFF_SHORE_SUBSIDIARY")
	private String exportOffShoreSubsidiary;

	@Column(name="FINANCIAL_VOLUME_RECEIVED")
	private BigDecimal financialVolumeReceived;

	@Column(name="FINANCIAL_VOLUME_SENT")
	private BigDecimal financialVolumeSent;

	@Column(name="FOREIGN_CURRENT_ACCOUNT")
	private BigDecimal foreignCurrentAccount;

	@Column(name="FUND_ADMINISTRATOR")
	private String fundAdministrator;

	@Column(name="FUND_ADMINISTRATOR_CNPJ")
	private BigDecimal fundAdministratorCnpj;

	@Column(name="HAVE_BEARER_SHARES")
	private BigDecimal haveBearerShares;

	@Column(name="IDENTIFICATION_BEARER_EMISSOR")
	private String identificationBearerEmissor;

	@Column(name="IDENTIFICATION_NUMBER_BEARER")
	private BigDecimal identificationNumberBearer;

	@Column(name="IMPORT_EXCH_VOL_SUBSID_LAST12M")
	private BigDecimal importExchVolSubsidLast12m;

	@Column(name="IMPORT_EXCHANGE_VOLUME_LAST12M")
	private BigDecimal importExchangeVolumeLast12m;

	@Column(name="IMPORT_MAKER")
	private BigDecimal importMaker;

	@Column(name="IMPORT_OFF_SHORE_SUBSIDIARY")
	private String importOffShoreSubsidiary;

	@Column(name="INCOME_AND_VERIFIED_HERITAGE")
	private BigDecimal incomeAndVerifiedHeritage;

	@Column(name="INITIAL_DEPOSIT")
	private BigDecimal initialDeposit;

	@Column(name="INITIAL_DEPOSIT_AMOUNT")
	private BigDecimal initialDepositAmount;

	@Column(name="INVEST_RESOURCE_ORIG_DETAIL")
	private String investResourceOrigDetail;

	@Column(name="INVESTMENT_AMOUNT_EXPECTED")
	private BigDecimal investmentAmountExpected;

	@Column(name="INVESTMENT_OPERATIONS")
	private BigDecimal investmentOperations;

	@Column(name="INVESTOR_NOT_RESIDENT")
	private BigDecimal investorNotResident;

	@Column(name="KYC_TYPE_CHANGE")
	private BigDecimal kycTypeChange;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_VISIT_DATE")
	private Date lastVisitDate;

	@Column(name="LAWFUL_SOURCE_RESOURCES")
	private BigDecimal lawfulSourceResources;

	@Column(name="MAIN_PRODUCT_SERV")
	private String mainProductServ;

	@Column(name="MONEY_LAUNDER_PREVENT_POLICY")
	private BigDecimal moneyLaunderPreventPolicy;

	@Column(name="MONTHLY_MOVEMENT_EXPECTED")
	private BigDecimal monthlyMovementExpected;

	@Column(name="NOT_BE_IN_LIST")
	private BigDecimal notBeInList;

	@Column(name="NUM_OFFSHORE")
	private BigDecimal numOffshore;

	@Column(name="OFF_SHORE_AMOUNT")
	private BigDecimal offShoreAmount;

	@Column(name="OFF_SHORE_CONTROL")
	private BigDecimal offShoreControl;

	@Column(name="OFF_SHORE_NAME")
	private String offShoreName;

	@Column(name="OFF_SHORE_SUBSIDIARY_EXPORT")
	private BigDecimal offShoreSubsidiaryExport;

	@Column(name="OFF_SHORE_SUBSIDIARY_IMPORT")
	private BigDecimal offShoreSubsidiaryImport;

	@Column(name="OFF_SHORE_TXN_BRAZIL_ENTERPR")
	private BigDecimal offShoreTxnBrazilEnterpr;

	@Column(name="OFF_SHORE_TXN_TYPES")
	private String offShoreTxnTypes;

	@Column(name="ORIGEN_JUSTIFY")
	private String origenJustify;

	@Column(name="PPAL_BEARER_NAME")
	private String ppalBearerName;

	@Column(name="PRIVATE_EQUITY_CONTROL")
	private BigDecimal privateEquityControl;

	@Column(name="PROCEDURES_IN_KIND_TXN")
	private String proceduresInKindTxn;

	@Column(name="RAMA_INMOBILIARIA")
	private BigDecimal ramaInmobiliaria;

	@Column(name="REGISTER_TXN_INMOB_GT_VALUE")
	private BigDecimal registerTxnInmobGtValue;

	@Column(name="REVIEW_COMPLIANCE")
	private BigDecimal reviewCompliance;

	@Column(name="RURAL_PRODUCER")
	private BigDecimal ruralProducer;

	@Column(name="SEARCH_UP_MINER")
	private BigDecimal searchUpMiner;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="STOCK_VIEW_IN_VISIT")
	private BigDecimal stockViewInVisit;

	@Column(name="STOCK_VIEW_REASON")
	private String stockViewReason;

	@Column(name="TOP_COUNTRIES")
	private BigDecimal topCountries;

	@Column(name="TOTAL_CAPITAL_PERCENTAGE")
	private BigDecimal totalCapitalPercentage;

	@Column(name="TREASURY_OPERATIONS")
	private BigDecimal treasuryOperations;

	@Column(name="UPDATED_REGISTER_COAF")
	private BigDecimal updatedRegisterCoaf;

	@Column(name="VALUE_ARIS_FROM_EXT")
	private BigDecimal valueArisFromExt;

	@Column(name="VALUE_TED_DOC")
	private BigDecimal valueTedDoc;

	
}