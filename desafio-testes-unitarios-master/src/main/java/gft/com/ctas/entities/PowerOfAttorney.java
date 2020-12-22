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
@Table(name="POWER_OF_ATTORNEY")
@NamedQuery(name="PowerOfAttorney.findAll", query="SELECT p FROM PowerOfAttorney p")
public class PowerOfAttorney implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="POWER_OF_ATTORNEY_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="POWER_OF_ATTORNEY_ID_GENERATOR")
	private long id;

	@Column(name="APPROVAL_DATE")
	private Timestamp approvalDate;

	@Column(name="ASSIGNED_CHARGE_DATE")
	private Timestamp assignedChargeDate;

	@Column(name="DOCUMENTATION_TYPE")
	private String documentationType;

	@Column(name="END_CHARGE_DATE")
	private Timestamp endChargeDate;

	@Column(name="IS_CONDITIONAL")
	private BigDecimal isConditional;

	private String mandatory;

	@Column(name="MAX_LIMIT")
	private BigDecimal maxLimit;

	private String observations;

	@Column(name="ON_BEHALF_DIRECT_TEL")
	private String onBehalfDirectTel;

	@Column(name="ON_BEHALF_DOB")
	private Timestamp onBehalfDob;

	@Column(name="ON_BEHALF_DOCUMENT_PLACE")
	private String onBehalfDocumentPlace;

	@Column(name="ON_BEHALF_EMAIL")
	private String onBehalfEmail;

	@Column(name="ON_BEHALF_NAME")
	private String onBehalfName;

	@Column(name="ON_BEHALF_NIT")
	private BigDecimal onBehalfNit;

	@Column(name="ON_BEHALF_NUMBER")
	private String onBehalfNumber;

	@Column(name="ON_BEHALF_TEL_NUMBER")
	private String onBehalfTelNumber;

	@Column(name="ON_BEHALF_THIS_COMPANY_ONLY")
	private String onBehalfThisCompanyOnly;

	@Column(name="ON_BEHALF_YEARS_IN_COMPANY")
	private BigDecimal onBehalfYearsInCompany;

	@Column(name="POWER_ID")
	private BigDecimal powerId;

	@Column(name="POWER_OF_STATUS")
	private String powerOfStatus;

	@Column(name="POWER_TYPE")
	private BigDecimal powerType;

	@Column(name="REGISTRY_BOOK")
	private BigDecimal registryBook;

	@Column(name="REGISTRY_FOLIO")
	private BigDecimal registryFolio;

	@Column(name="REGISTRY_INCRIPTION_NUMBER")
	private BigDecimal registryIncriptionNumber;

	@Column(name="REGISTRY_NAME")
	private String registryName;

	@Column(name="REQUEST_REGISTRY_DATE")
	private Timestamp requestRegistryDate;

	@Column(name="SESSION_ARTICLE_APPR")
	private String sessionArticleAppr;

	@Column(name="SESSION_ARTICLE_REQ")
	private String sessionArticleReq;

	@Column(name="SIGN_TYPE")
	private String signType;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

}