package gft.com.ctas.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Data;
import javax.persistence.Entity;

@Data
@Entity
@Table(name="AGE_INTERVAL")
public class AgeInterval implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="AGE_INTERVAL_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AGE_INTERVAL_ID_GENERATOR")
	private long id;

	@Column(name="RANGE_MAX")
	private BigDecimal rangeMax;

	@Column(name="RANGE_MIN")
	private BigDecimal rangeMin;

	@Column(name="SHORT_DSC")
	private String shortDsc;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

}