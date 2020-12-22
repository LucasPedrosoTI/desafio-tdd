package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="cyberbank_core.CUSTOMER_RESTRICTION_LEVEL")
public class CustomerRestrictionLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_RESTRICTION_LEVEL_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_RESTRICTION_LEVEL_ID_GENERATOR")
	private long id;

	@Column(name="ADJUSTMENT_DATE")
	private Timestamp adjustmentDate;

	@Column(name="CANCELATION_DATE")
	private Timestamp cancelationDate;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_RESTRICTION_ORIGIN")
	private CustomerRestrictionOrigin customerRestrictionOrigin;

	@Column(name="EVENT_DATE")
	private Timestamp eventDate;

	@Column(name="IDENTIFICATION_NUMBER")
	private String identificationNumber;
	
	@ManyToOne
	@JoinColumn(name = "PEP_TYPE")
	private PepType pepType;

	@ManyToOne
	@JoinColumn(name = "RESTRICTION_TYPE")
	private RestrictionType restrictionType;
	
	@ManyToOne
	@JoinColumn(name = "RESTRICTION_LEVEL")
	private RestrictionLevel restrictionLevel;
	
	@Column(name="RESTRICTION_REASON")
	private String restrictionReason;

	@Column(name="RESTRICTION_VALUE")
	private BigDecimal restrictionValue;

	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;
	
	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;
	
	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

}