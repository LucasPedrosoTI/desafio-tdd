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
@Table(name="cyberbank_core.CUSTOMER_OPERATION")
public class CustomerOperation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_OPERATION_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_OPERATION_ID_GENERATOR")
	private long id;

	@ManyToOne
	@JoinColumn(name = "BRANCH")
	private Branch branch;
	
	@ManyToOne
	@JoinColumn(name = "CURRENCY")
	private Currency currency;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER")
	private Customer customer;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FROM")
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TO")
	private Date dateTo;

	@ManyToOne
	@JoinColumn(name = "FIRST_ACCESS")
	private FirstAccess firstAccess;
	
	@Column(name="HOLDER_FLAG")
	private BigDecimal holderFlag;

	@ManyToOne
	@JoinColumn(name = "ISO_PRODUCT")
	private IsoProductType isoProduct;
	
	@ManyToOne
	@JoinColumn(name = "OFFICIAL_ACCOUNT")
	private SystemUserCore officialAccount;
	
	@Column(name="OPERATION_ID")
	private String operationId;
	
	@ManyToOne
	@JoinColumn(name = "OPERATING_MODE")
	private OperatingMode operatingMode;

	@Column(name="PARTICIPATION_PERCENTAGE")
	private BigDecimal participationPercentage;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;
	
	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;
	
	@ManyToOne
	@JoinColumn(name = "SUBPRODUCT")
	private Subproduct subproduct;
	
	@ManyToOne
	@JoinColumn(name = "TYPE")
	private CustomerOperationType type;

}