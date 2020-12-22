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
@Table(name="GENERIC_GOODS")
@NamedQuery(name="GenericGood.findAll", query="SELECT g FROM GenericGood g")
public class GenericGood implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GENERIC_GOODS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GENERIC_GOODS_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="ACTUAL_LAST_DATE")
	private Date actualLastDate;

	@Column(name="ACTUAL_VALUE")
	private BigDecimal actualValue;

	@Temporal(TemporalType.DATE)
	@Column(name="ADQUISITION_DATE")
	private Date adquisitionDate;

	@Column(name="ALLOW_WARRANTY")
	private BigDecimal allowWarranty;

	@Temporal(TemporalType.DATE)
	@Column(name="APPRAISAL_LAST_DATE")
	private Date appraisalLastDate;

	@Column(name="APPRAISAL_VALUE")
	private BigDecimal appraisalValue;

	private BigDecimal appraiser;

	@Temporal(TemporalType.DATE)
	@Column(name="AVAILABLE_LAST_DATE")
	private Date availableLastDate;

	@Column(name="AVAILABLE_VALUE")
	private BigDecimal availableValue;

	@Column(name="CAPACITY_VALUE")
	private BigDecimal capacityValue;

	private String comments;

	@Column(name="CUSTOMER_HERITAGE_LOCATION")
	private String customerHeritageLocation;

	@Temporal(TemporalType.DATE)
	@Column(name="DECLARE_LAST_DATE")
	private Date declareLastDate;

	@Column(name="DECLARE_VALUE")
	private BigDecimal declareValue;

	private String expert;

	@Column(name="EXPERT_COMPANY")
	private String expertCompany;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRY_DATE")
	private Date expiryDate;

	@Column(name="GOODS_NUMBER")
	private BigDecimal goodsNumber;

	@Column(name="GOODS_QUANTITY")
	private BigDecimal goodsQuantity;

	@Column(name="HERITAGE_CODE")
	private String heritageCode;

	@Column(name="INSPECTION_PERIOD")
	private BigDecimal inspectionPeriod;

	@Column(name="INSURANCE_AMOUNT")
	private BigDecimal insuranceAmount;

	@Column(name="INSURANCE_BENEFICIARY")
	private String insuranceBeneficiary;

	@Column(name="INSURANCE_CERTIFICATE")
	private String insuranceCertificate;

	@Temporal(TemporalType.DATE)
	@Column(name="LEGAL_LAST_DATE")
	private Date legalLastDate;

	@Column(name="LEGAL_VALUE")
	private BigDecimal legalValue;

	@Column(name="MANUFACTURE_YEAR")
	private BigDecimal manufactureYear;

	@Temporal(TemporalType.DATE)
	@Column(name="MARKET_LAST_DATE")
	private Date marketLastDate;

	@Column(name="MARKET_VALUE")
	private BigDecimal marketValue;

	@Column(name="MODEL_TRADEMARK")
	private String modelTrademark;

	@Column(name="RESTRICTION_PERCENT")
	private BigDecimal restrictionPercent;

	@Column(name="SALE_APPLICABLE")
	private BigDecimal saleApplicable;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Temporal(TemporalType.DATE)
	@Column(name="STATUS_DATE")
	private Date statusDate;

	private String trademark;

	@Column(name="VALUATION_REFERENCE")
	private String valuationReference;


}