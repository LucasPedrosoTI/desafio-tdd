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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="cyberbank_core.CUSTOMER_CONTACTS_VERIFICATION")
public class CustomerContactsVerification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_CONTACTS_VERIFICATION_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_CONTACTS_VERIFICATION_ID_GENERATOR")
	private long id;

	private BigDecimal advisable;

	@Column(name="ANTIQUITY_IN_BUSINESS")
	private BigDecimal antiquityInBusiness;

	private BigDecimal calification;

	private BigDecimal consider;

	@ManyToOne
	@JoinColumn(name = "CUSTOMER_CONTACTS")
	private CustomerContact customerContact;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_GROUP_CICLE")
	private CustomerGroupCicle customerGroupCircle;
	
	@Column(name="GIVE_MONEY")
	private BigDecimal giveMoney;

	private BigDecimal guarantor;

	@Temporal(TemporalType.DATE)
	@Column(name="INVESTIGATION_DATE")
	private Date investigationDate;

	@Column(name="KNOW_WHERE_LIVE")
	private BigDecimal knowWhereLive;

	private String observations;

	@Column(name="PLACE_ACTIVITY")
	private BigDecimal placeActivity;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;
	
	@ManyToOne
	@JoinColumn(name = "SYSTEM_USER_CORE")
	private SystemUserCore stampUser;
	
	@Column(name="TIME_CALL")
	private Timestamp timeCall;

	@ManyToOne
	@JoinColumn(name = "OCCUPATION_CODE")
	private OccupationCode occupationCode;
	
	@Column(name="YEARS_TO_KNOW")
	private BigDecimal yearsToKnow;

}