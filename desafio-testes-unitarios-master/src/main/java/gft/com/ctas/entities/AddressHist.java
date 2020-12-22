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
@Table(name="ADDRESS_HIST")
@NamedQuery(name="AddressHist.findAll", query="SELECT a FROM AddressHist a")
public class AddressHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ADDRESS_HIST_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ADDRESS_HIST_ID_GENERATOR")
	private long id;

	@Column(name="\"ACTION\"")
	private String action;

	private BigDecimal address;

	@Column(name="ADDRESS_TYPE_NT")
	private String addressTypeNt;

	@Column(name="COUNTRY_ID")
	private BigDecimal countryId;

	@Column(name="COUNTRY_ZIP_CODE")
	private String countryZipCode;

	@Column(name="CUSTOMER_ID")
	private String customerId;

	@Column(name="EXACT_ADDRESS")
	private String exactAddress;

	@Column(name="IS_FOR_CORRESPONDENCE")
	private BigDecimal isForCorrespondence;

	private String locality;

	@Column(name="LOCALITY_CODE_ID")
	private BigDecimal localityCodeId;

	@Column(name="PROVINCE_CODE_ID")
	private BigDecimal provinceCodeId;

	@Temporal(TemporalType.DATE)
	@Column(name="RESIDE_BEGIN_DATE")
	private Date resideBeginDate;

	@Column(name="RESIDENCE_CONDITION_NT")
	private String residenceConditionNt;

	@Column(name="RESIDENCE_TYPE_NT")
	private String residenceTypeNt;

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

	private String street;

	@Column(name="STREET_NUMBER")
	private BigDecimal streetNumber;

	@Column(name="STREET_TYPE_NT")
	private String streetTypeNt;

	@Column(name="TOWN_ZONE")
	private String townZone;

}