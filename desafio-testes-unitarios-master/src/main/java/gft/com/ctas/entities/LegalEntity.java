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
@Table(name="LEGAL_ENTITY")
@NamedQuery(name="LegalEntity.findAll", query="SELECT l FROM LegalEntity l")
public class LegalEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LEGAL_ENTITY_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LEGAL_ENTITY_ID_GENERATOR")
	private long id;

	@Column(name="ACTIVITY_DESCRIPTION")
	private String activityDescription;

	@Temporal(TemporalType.DATE)
	@Column(name="ACTIVITY_START_DATE")
	private Date activityStartDate;

	@Temporal(TemporalType.DATE)
	@Column(name="BOARD_OF_DIRECTORS_EXPIRY")
	private Date boardOfDirectorsExpiry;

	@Column(name="CENTRAL_BANK_REPORTING_NAME")
	private String centralBankReportingName;

	@Column(name="COMMERCIAL_NAME")
	private String commercialName;

	@Column(name="COMPANY_SIZE")
	private String companySize;

	@Column(name="COMPANY_SIZE_POINTS")
	private String companySizePoints;

	@Column(name="FISCAL_BALANCE_ENDING_MONTH")
	private BigDecimal fiscalBalanceEndingMonth;

	@Temporal(TemporalType.DATE)
	@Column(name="FISCAL_ENDING_BALANCE_DATE")
	private Date fiscalEndingBalanceDate;

	@Column(name="FOLIO_NUMBER")
	private BigDecimal folioNumber;

	@Column(name="INCORPORATION_DATE")
	private Timestamp incorporationDate;

	@Temporal(TemporalType.DATE)
	@Column(name="LEGAL_EXPIRY_DATE")
	private Date legalExpiryDate;

	@Temporal(TemporalType.DATE)
	@Column(name="LEGAL_START_DATE")
	private Date legalStartDate;

	@Temporal(TemporalType.DATE)
	@Column(name="MANAGEMENT_CHANGE_DATE")
	private Date managementChangeDate;

	@Column(name="OTHER_BUSINESS_SECTOR")
	private String otherBusinessSector;

	@Column(name="OTHER_COMPANY_CATEGORY")
	private String otherCompanyCategory;

	@Column(name="OTHER_COMPANY_TYPE")
	private String otherCompanyType;

	@Column(name="OTHER_INT_BUSINESS_DETAIL")
	private String otherIntBusinessDetail;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	private String underactivity;


}