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
@Table(name="cyberbank_core.ELECTRONICS_CONTACT")
public class ElectronicsContact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ELECTRONICS_CONTACT_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ELECTRONICS_CONTACT_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="ADDITION_DATE")
	private Date additionDate;

	private String comments;

	@ManyToOne
	@JoinColumn(name = "CUSTOMER")
	private Customer customer;
	
	@Column(name="ELECTRONICS_CONTACT_ID")
	private BigDecimal electronicsContactId;
	
	@ManyToOne
	@JoinColumn(name = "ELECTRONICS_CONTACT_TYPE")
	private ElectronicsContactType eletronicsContactType;

	@Column(name="EMAIL_ADDRESS_COMPLETE")
	private String emailAddressComplete;

	@Column(name="EMAIL_FOR_COMU")
	private BigDecimal emailForComu;

	@Temporal(TemporalType.DATE)
	@Column(name="EMAIL_LAST_USE")
	private Date emailLastUse;

	@Column(name="EMAIL_ORDER")
	private BigDecimal emailOrder;

	@ManyToOne
	@JoinColumn(name = "EMAIL_USE")
	private EmailUse emailUse;
	
	@ManyToOne
	@JoinColumn(name = "EMAIL_TYPE")
	private EmailType emailType;
	
	@ManyToOne
	@JoinColumn(name = "INTEGRITY_STRUCTURE")
	private IntegrityStructure integrityStructure;
	
	private BigDecimal priority;

	@Temporal(TemporalType.DATE)
	@Column(name="PURGE_DATE")
	private Date purgeDate;

	@ManyToOne
	@JoinColumn(name = "PURGE_REASON")
	private PurgeReason purgeReason;
	
	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;
	
	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@Column(name="STATUS_DATE")
	private Timestamp statusDate;
	
	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;

	@ManyToOne
	@JoinColumn(name = "SYSTEM_USER_CORE")
	private SystemUserCore systemUserCore;

}