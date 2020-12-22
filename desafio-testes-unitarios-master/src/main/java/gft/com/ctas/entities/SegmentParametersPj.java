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
@Table(name="SEGMENT_PARAMETERS_PJ")
@NamedQuery(name="SegmentParametersPj.findAll", query="SELECT s FROM SegmentParametersPj s")
public class SegmentParametersPj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEGMENT_PARAMETERS_PJ_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEGMENT_PARAMETERS_PJ_ID_GENERATOR")
	private long id;

	@Column(name="ASSETS_DATA")
	private BigDecimal assetsData;

	@Column(name="BILLING_DATA")
	private BigDecimal billingData;

	@Column(name="DEFAULT_VALUE")
	private BigDecimal defaultValue;

	@Column(name="EMPLOYEES_DATA")
	private BigDecimal employeesData;

	@Column(name="HIGHER_ASSETS")
	private BigDecimal higherAssets;

	@Column(name="HIGHER_BILLINGS")
	private BigDecimal higherBillings;

	@Column(name="HIGHER_EMPLOYEES")
	private BigDecimal higherEmployees;

	@Column(name="HIGHER_INVESTMENT")
	private BigDecimal higherInvestment;

	@Column(name="HOLDING_COMPANY")
	private BigDecimal holdingCompany;

	@Column(name="LONG_DESC")
	private String longDesc;

	@Column(name="LOWER_ASSETS")
	private BigDecimal lowerAssets;

	@Column(name="LOWER_BILLINGS")
	private BigDecimal lowerBillings;

	@Column(name="LOWER_EMPLOYEES")
	private BigDecimal lowerEmployees;

	@Column(name="LOWER_INVESTMENT")
	private BigDecimal lowerInvestment;

	private String nemotecnico;

	@Column(name="\"SEGMENT\"")
	private BigDecimal segment;

	@Column(name="SHORT_DESC")
	private String shortDesc;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

}