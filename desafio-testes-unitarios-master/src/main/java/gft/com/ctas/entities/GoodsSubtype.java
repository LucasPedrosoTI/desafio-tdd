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
@Table(name="GOODS_SUBTYPE")
@NamedQuery(name="GoodsSubtype.findAll", query="SELECT g FROM GoodsSubtype g")
public class GoodsSubtype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GOODS_SUBTYPE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GOODS_SUBTYPE_ID_GENERATOR")
	private long id;

	@Column(name="ALLOW_CHANGE_DATA")
	private BigDecimal allowChangeData;

	@Column(name="ALLOW_CHANGE_PERIODS")
	private BigDecimal allowChangePeriods;

	@Column(name="CAPACITY_PERCENT")
	private BigDecimal capacityPercent;

	private String description;

	@Column(name="GOODS_SUBTYPE_ID")
	private BigDecimal goodsSubtypeId;

	@Column(name="INSPECTION_PERIOD")
	private BigDecimal inspectionPeriod;

	@Column(name="MAX_AFECTATION_PERCENT")
	private BigDecimal maxAfectationPercent;

	@Column(name="MAX_AMOUNT")
	private BigDecimal maxAmount;

	@Column(name="MAX_SENIORITY")
	private BigDecimal maxSeniority;

	private String nemotecnico;

	@Column(name="REQUIRED_IMAGE")
	private BigDecimal requiredImage;

	@Column(name="REVALUATION_PERIOD")
	private BigDecimal revaluationPeriod;

	@Column(name="SHORT_DESCRIPTION")
	private String shortDescription;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_ADDITIONAL_DATA")
	private String stampAdditionalData;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="SYSTEM_USER_CORE")
	private String systemUserCore;

}