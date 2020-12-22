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
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Behavior implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="BEHAVIOR_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BEHAVIOR_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FROM")
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TO")
	private Date dateTo;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_REFINANCING_DATE")
	private Date lastRefinancingDate;

	@Column(name="PERIOD_UNITS_NUMBER")
	private BigDecimal periodUnitsNumber;

	private BigDecimal rating;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="UNPAID_OPERATION_ID")
	private String unpaidOperationId;
}