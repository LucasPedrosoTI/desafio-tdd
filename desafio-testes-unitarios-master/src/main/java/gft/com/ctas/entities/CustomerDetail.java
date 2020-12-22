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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="cyberbank_core.CUSTOMER_DETAIL")
public class CustomerDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_DETAIL_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_DETAIL_ID_GENERATOR")
	private long id;

	@Column(name="ADHERENCE_TO_REGISTER")
	private BigDecimal adherenceToRegister;

	@Column(name="AUTHORIZE_BACEN")
	private BigDecimal authorizeBacen;

	@Column(name="AUTHORIZE_PCAM")
	private BigDecimal authorizePcam;

	@Column(name="BRANCH_CLOSING_HOURS")
	private Timestamp branchClosingHours;

	@Column(name="BRANCH_OPENING_HOURS")
	private Timestamp branchOpeningHours;
	
	@ManyToOne
	@JoinColumn(name = "BUSINESS_SEGMENT")
	private BusinessSegment businessSegment;

	@Column(name="CAMPAIGN_ORIGINATION")
	private String campaignOrigination;

	private String cetip;

	@Column(name="COD_OPER_CVM")
	private String codOperCvm;
	
	@ManyToOne
	@JoinColumn(name = "COOPERATION_LEVEL")
	private CooperationLevel coopLevel;
	
	@ManyToOne
	@JoinColumn(name = "COMMUNICATION_TYPE")
	private CommunicationType communicationType;

	@OneToOne
	@JoinColumn(name = "CUSTOMER")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_TARGET")
	private CustomerTarget customerTarget;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_ORIGINATION")
	private CustomerOrigination customerOrigination;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_CHANGE_OPTIN_POSITIVE")
	private Date dateChangeOptinPositive;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FROM_FINANCIAL_SYSTEM")
	private Date dateFromFinancialSystem;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OPTIN_POSITIVE_REGISTER")
	private Date dateOptinPositiveRegister;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_RENOVACION")
	private Date dateRenovacion;

	@Column(name="DATE_UPDATE_SEGMENT_LEGAL")
	private Timestamp dateUpdateSegmentLegal;

	private BigDecimal dda;

	@Column(name="DIGITAL_CERTIFICATE")
	private BigDecimal digitalCertificate;
	
	@ManyToOne
	@JoinColumn(name = "EML_SECTOR")
	private EmlSector emlSector;

	@Column(name="IS_INFORMATION_FATCA")
	private BigDecimal isInformationFatca;

	@Column(name="IS_INFORMATION_PEP")
	private BigDecimal isInformationPep;

	@Column(name="IS_OPTIN_POSITIVE_REGISTER")
	private BigDecimal isOptinPositiveRegister;

	@Column(name="IS_RELATED")
	private BigDecimal isRelated;

	@Temporal(TemporalType.DATE)
	@Column(name="OVERDUE_RENOVATION_DATE")
	private Date overdueRenovationDate;
	
	@ManyToOne
	@JoinColumn(name = "OFFICIAL_ECONOMIC_SECTOR")
	private OfficialEconomicSector officialEconomicSector;
	
	@ManyToOne
	@JoinColumn(name = "OPPORTUNITY_TYPE")
	private OpportunityType oportunityType;
	
	@ManyToOne
	@JoinColumn(name = "PROVIDER_SERVICE_TYPE")
	private ProviderServiceType providerServiceType;

	@Column(name="\"SEGMENT\"")
	private BigDecimal segment;

	private String selic;

	@Column(name="STAFF_CLOSING_HOURS")
	private Timestamp staffClosingHours;

	@Column(name="STAFF_OPENING_HOURS")
	private Timestamp staffOpeningHours;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;
	
	@ManyToOne
	@JoinColumn(name = "SEGMENT",insertable = false, updatable = false)
	private CustomerParamSegmento customerParamSegment;
	
	@ManyToOne
	@JoinColumn(name= "SEGMENT_LEGAL")
	private SegmentLegal segmentLegal;
	
	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;
	
	@ManyToOne
	@JoinColumn(name = "SUGEF_POSITION")
	private SugefPosition sugefPos;
	
	@ManyToOne
	@JoinColumn(name ="SUGEF_POSITION_TYPE")
	private SugefPositionType sugefPosType;
	
	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;

	@Column(name="TREATMENT_NAME")
	private String treatmentName;
	
	@ManyToOne
	@JoinColumn(name = "TAX_DOCUMENT_TYPE")
	private TaxDocumentType taxDocumentType;
	
	@ManyToOne
	@JoinColumn(name = "TREATMENT_TYPE")
	private Treatment treatment;
	
	@ManyToOne
	@JoinColumn(name = "USER_UPDATE_SEGMENT_LEGAL")
	private SystemUserCore systemUserCoreSegmentLegal;

	@Column(name="VISIT_INFORMATION")
	private String visitInformation;
}