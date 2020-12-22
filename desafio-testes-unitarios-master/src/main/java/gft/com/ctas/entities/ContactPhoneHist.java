package gft.com.ctas.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


import lombok.Data;
import javax.persistence.Entity;

@Data
@Entity
@Table(name="CONTACT_PHONE_HIST")
@NamedQuery(name="ContactPhoneHist.findAll", query="SELECT c FROM ContactPhoneHist c")
public class ContactPhoneHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CONTACT_PHONE_HIST_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONTACT_PHONE_HIST_ID_GENERATOR")
	private long id;

	@Column(name="\"ACTION\"")
	private String action;

	@Temporal(TemporalType.DATE)
	@Column(name="ADDITION_DATE")
	private Date additionDate;

	@Column(name="AREA_CODE_NT")
	private String areaCodeNt;

	private String comments;

	@Column(name="COMMUNICATION_TYPE_NT")
	private String communicationTypeNt;

	@Column(name="CONTACT_PHONE")
	private BigDecimal contactPhone;

	@Column(name="COUNTRY_ID")
	private BigDecimal countryId;

	@Column(name="CUSTOMER_ID")
	private String customerId;

	@Column(name="ORDER_PHONE")
	private BigDecimal orderPhone;

	@Temporal(TemporalType.DATE)
	@Column(name="PHONE_EXPIRY_DATE")
	private Date phoneExpiryDate;

	@Column(name="PHONE_EXTENSION")
	private String phoneExtension;

	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STAMP_DATE_TIME_CHANGE")
	private Timestamp stampDateTimeChange;

	@Column(name="STAMP_USER_CHANGE")
	private String stampUserChange;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="TEL_FOR_COMU")
	private BigDecimal telForComu;

	@Column(name="TELEPHONE_TYPE_NT")
	private String telephoneTypeNt;

}