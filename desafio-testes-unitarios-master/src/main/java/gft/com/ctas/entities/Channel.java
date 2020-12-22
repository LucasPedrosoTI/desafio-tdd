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
@Table(name = "cyberbank_core.CHANNEL")
public class Channel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CHANNEL_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CHANNEL_ID_GENERATOR")
	private long id;

	@Column(name="ALLOW_MULTIPLE_SESSIONS")
	private BigDecimal allowMultipleSessions;

	private BigDecimal authentication;

	@Column(name="CHANNEL_ID")
	private BigDecimal channelId;

	@Column(name="CHANNEL_IS_OWN")
	private BigDecimal channelIsOwn;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FROM")
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TO")
	private Date dateTo;

	private String description;
	
	@ManyToOne
	@JoinColumn(name = "INSTITUTION")
	private Institution institution;

	private String nemotecnico;

	@Column(name="SERVICES_HOURS_FLAG")
	private BigDecimal servicesHoursFlag;

	@Column(name="SHORT_DESC")
	private String shortDesc;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;
	
	@ManyToOne
	@JoinColumn(name="STAMP_USER")
	private SystemUserCore stampUser;

	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;
	
	
	@Column(name="SYSTEM_USER_CORE")
	private String systemUserCore;

	@Column(name="TIME_FROM")
	private Timestamp timeFrom;

	@Column(name="TIME_TO")
	private Timestamp timeTo;

	@Column(name="TIMEOUT")
	private BigDecimal timeout;

}