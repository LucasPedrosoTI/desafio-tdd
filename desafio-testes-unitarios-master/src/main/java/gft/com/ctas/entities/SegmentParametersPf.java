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
@Table(name="SEGMENT_PARAMETERS_PF")
@NamedQuery(name="SegmentParametersPf.findAll", query="SELECT s FROM SegmentParametersPf s")
public class SegmentParametersPf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEGMENT_PARAMETERS_PF_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEGMENT_PARAMETERS_PF_ID_GENERATOR")
	private long id;

	@Column(name="BUSINESS_ACTIVITY")
	private BigDecimal businessActivity;

	@Column(name="DEFAULT_VALUE")
	private BigDecimal defaultValue;

	private BigDecimal employee;

	@Column(name="FINANCIAL_INDEPENDENCE")
	private BigDecimal financialIndependence;

	@Column(name="HIGHER_AGE")
	private BigDecimal higherAge;

	@Column(name="HIGHER_INCOMES")
	private BigDecimal higherIncomes;

	@Column(name="HIGHER_INVESTMENT")
	private BigDecimal higherInvestment;

	@Column(name="HIGHER_MORTGAGE_PERCENT")
	private BigDecimal higherMortgagePercent;

	@Column(name="LONG_DESC")
	private String longDesc;

	@Column(name="LOWER_AGE")
	private BigDecimal lowerAge;

	@Column(name="LOWER_INCOMES")
	private BigDecimal lowerIncomes;

	@Column(name="LOWER_INVESTMENT")
	private BigDecimal lowerInvestment;

	@Column(name="LOWER_MORTGAGE_PERCENT")
	private BigDecimal lowerMortgagePercent;

	private BigDecimal mortgage;

	private String nemotecnico;

	private BigDecimal paretto;

	private BigDecimal resident;

	private BigDecimal retired;

	@Column(name="SEGMENT")
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