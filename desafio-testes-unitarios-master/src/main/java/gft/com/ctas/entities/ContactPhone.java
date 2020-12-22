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
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="CONTACT_PHONE")
@NamedQuery(name="ContactPhone.findAll", query="SELECT c FROM ContactPhone c")
public class ContactPhone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CONTACT_PHONE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONTACT_PHONE_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="ADDITION_DATE")
	private Date additionDate;

	@Column(name="AREA_CODE")
	private String areaCode;

	private String comments;

	@Column(name="COMMUNICATION_ID")
	private BigDecimal communicationId;

	@Column(name="COUNTRY_PHONE")
	private BigDecimal countryPhone;

	@Column(name="ORDER_PHONE")
	private BigDecimal orderPhone;

	@Temporal(TemporalType.DATE)
	@Column(name="PHONE_EXPIRY_DATE")
	private Date phoneExpiryDate;

	@Column(name="PHONE_EXTENSION")
	private String phoneExtension;

	@Temporal(TemporalType.DATE)
	@Column(name="PHONE_LAST_USE_DATE")
	private Date phoneLastUseDate;

	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="PURGE_DATE")
	private Date purgeDate;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="TEL_FOR_COMU")
	private BigDecimal telForComu;
}