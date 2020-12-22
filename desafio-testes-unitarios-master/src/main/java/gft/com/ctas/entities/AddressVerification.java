package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ADDRESS_VERIFICATION")
public class AddressVerification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ADDRESS_VERIFICATION_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ADDRESS_VERIFICATION_ID_GENERATOR")
	private long id;

	@Column(name="ACTIVITY_OBSERVATION")
	private String activityObservation;

	@Column(name="ACTIVITY_OK")
	private BigDecimal activityOk;

	@Column(name="ADDRESS_OBSERVATION")
	private String addressObservation;

	@Column(name="ADDRESS_OK")
	private BigDecimal addressOk;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="VERIFICATION_DATE")
	private Timestamp verificationDate;

}