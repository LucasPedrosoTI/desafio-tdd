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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="cyberbank_core.SYSTEM_USER_CORE")
public class SystemUserCore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SYSTEM_USER_CORE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SYSTEM_USER_CORE_ID_GENERATOR")
	private long id;

	@Column(name="ACTIVE_FLAG")
	private BigDecimal activeFlag;

	private BigDecimal branch;

	private BigDecimal institution;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_ACCESS_DATE")
	private Date lastAccessDate;

	@Column(name="LAST_TRX_DATE")
	private Timestamp lastTrxDate;

	private BigDecimal logged;

	private String name;

	private String password;

	@Column(name="PASSWORD_ATTEMPS")
	private BigDecimal passwordAttemps;

	@Temporal(TemporalType.DATE)
	@Column(name="PASSWORD_EXPIRE_DATED")
	private Date passwordExpireDated;

	@Column(name="SESSION_ID")
	private String sessionId;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	private BigDecimal status;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="STATUS_REASON")
	private BigDecimal statusReason;

	@Column(name="USER_ID")
	private String userId;

	@Column(name="USER_POSITION")
	private BigDecimal userPosition;

	@Column(name="VALIDITY_TERM")
	private BigDecimal validityTerm;

}