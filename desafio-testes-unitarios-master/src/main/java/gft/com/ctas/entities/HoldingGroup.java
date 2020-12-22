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
@Table(name="HOLDING_GROUP")
@NamedQuery(name="HoldingGroup.findAll", query="SELECT h FROM HoldingGroup h")
public class HoldingGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HOLDING_GROUP_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HOLDING_GROUP_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="ACTIVITY_ENDING_DATE")
	private Date activityEndingDate;

	@Temporal(TemporalType.DATE)
	@Column(name="ACTIVITY_START_DATE")
	private Date activityStartDate;

	@Column(name="GROUP_NUMBER")
	private BigDecimal groupNumber;

	@Column(name="HOLDING_COMPANY_NAME")
	private String holdingCompanyName;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	
}