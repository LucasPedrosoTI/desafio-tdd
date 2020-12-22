package gft.com.ctas.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="BOARD_LEGAL_ENTITY")
public class BoardLegalEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="BOARD_LEGAL_ENTITY_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BOARD_LEGAL_ENTITY_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="APPOINTMENT_END_DATE")
	private Date appointmentEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="APPOINTMENT_START_DATE")
	private Date appointmentStartDate;

	private String description;

	@Column(name="POSITION")
	private java.math.BigDecimal position;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;
}