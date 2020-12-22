package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name="INFO_SOCIO_ENVIRONMENTAL")
@NamedQuery(name="InfoSocioEnvironmental.findAll", query="SELECT i FROM InfoSocioEnvironmental i")
public class InfoSocioEnvironmental implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="INFO_SOCIO_ENVIRONMENTAL_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="INFO_SOCIO_ENVIRONMENTAL_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="ADDITION_DATE")
	private Date additionDate;

	@Column(name="ADDITIONAL_ENVMTL_COMMENT")
	private String additionalEnvmtlComment;

	@Column(name="ADDITIONAL_INST_COMMENT")
	private String additionalInstComment;

	@Column(name="ADDITIONAL_SOCIAL_COMMENT")
	private String additionalSocialComment;

	@Temporal(TemporalType.DATE)
	@Column(name="ANALISYS_DATE")
	private Date analisysDate;

	@Column(name="DESC_LICENSE_UNRESOLVED")
	private String descLicenseUnresolved;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRATION_DATE")
	private Date expirationDate;

	@Column(name="IS_ALL_REQ_LICENSE_REGULARIZED")
	private BigDecimal isAllReqLicenseRegularized;

	@Column(name="IS_APPROVED")
	private BigDecimal isApproved;

	@Column(name="IS_CURRENT")
	private BigDecimal isCurrent;

	@Column(name="IS_DOCUMENTATION_SENT")
	private BigDecimal isDocumentationSent;

	@Column(name="IS_EMPLOYEE_BENEF_PROGRAM")
	private BigDecimal isEmployeeBenefProgram;

	@Column(name="IS_GENERATED_RESID_EFFLUENT")
	private BigDecimal isGeneratedResidEffluent;

	@Column(name="IS_NOT_LICENSE_REQUIRED")
	private BigDecimal isNotLicenseRequired;

	@Column(name="IS_PLANNED_REDUCTION_WASTE")
	private BigDecimal isPlannedReductionWaste;

	@Column(name="IS_REQ_ENV_LICENSE")
	private BigDecimal isReqEnvLicense;

	@Column(name="IS_REQ_GRANTING_WATER_RESORCE")
	private BigDecimal isReqGrantingWaterResorce;

	@Column(name="IS_REQ_OPERATION_LICENSE")
	private BigDecimal isReqOperationLicense;

	@Column(name="IS_REQ_SENDING_DOCUMENTATION")
	private BigDecimal isReqSendingDocumentation;

	@Column(name="IS_REQUIRED_CAR")
	private BigDecimal isRequiredCar;

	@Column(name="IS_REQUIRED_CCIR")
	private BigDecimal isRequiredCcir;

	@Column(name="IS_REQUIRED_CQBIO")
	private BigDecimal isRequiredCqbio;

	@Column(name="IS_REQUIRED_CTF")
	private BigDecimal isRequiredCtf;

	@Column(name="IS_REQUIRED_PMF")
	private BigDecimal isRequiredPmf;

	@Column(name="IS_SOC_ENV_FINE")
	private String isSocEnvFine;

	@Column(name="IS_SOC_ENV_INFRINGEMENT_AUTO")
	private BigDecimal isSocEnvInfringementAuto;

	@Column(name="IS_SOC_ENV_INQUIRY")
	private BigDecimal isSocEnvInquiry;

	@Column(name="IS_SOC_ENV_SUPLIER_CRITERIA")
	private BigDecimal isSocEnvSuplierCriteria;

	@Column(name="IS_SOCIO_ENV_COMMITMENT")
	private BigDecimal isSocioEnvCommitment;

	@Column(name="RESPONSIBLE_ANALYST_LOGIN")
	private String responsibleAnalystLogin;

	@Column(name="SOCIO_ENV_FINE_VALUE")
	private BigDecimal socioEnvFineValue;

}