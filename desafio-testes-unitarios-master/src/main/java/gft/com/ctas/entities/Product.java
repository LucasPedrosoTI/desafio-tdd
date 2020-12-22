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
@Table(name = "cyberbank_core.PRODUCT")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PRODUCT_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCT_ID_GENERATOR")
	private long id;

	@Column(name="CRM_INFO")
	private String crmInfo;

	@Temporal(TemporalType.DATE)
	@Column(name="CRM_INFO_EXPIRY_DATE")
	private Date crmInfoExpiryDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FROM")
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TO")
	private Date dateTo;

	@Column(name="DETAIL_TABLE_NAME")
	private String detailTableName;

	@ManyToOne
	@JoinColumn(name = "INSTITUTION")
	private Institution institution;
	
	@ManyToOne
	@JoinColumn(name = "ISO_PRODUCT")
	private IsoProductType isoProductType;
	
	@Column(name="LONG_DESC")
	private String longDesc;

	@Column(name="OFFICIAL_ID")
	private String officialId;

	@Column(name="PRODUCT_ID")
	private String productId;

	@Column(name="PRODUCT_IS_OWN")
	private BigDecimal productIsOwn;

	@Column(name="SHORT_DESC")
	private String shortDesc;

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
	
	@Column(name="SYSTEM_USER_CORE")
	private String systemUserCore;

}