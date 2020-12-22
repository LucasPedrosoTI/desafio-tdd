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
@Table(name="BASIC_INDIVIDUAL_DATA_HIST")
public class BasicIndividualDataHist implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="BASIC_INDIVIDUAL_DATA_HIST_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BASIC_INDIVIDUAL_DATA_HIST_ID_GENERATOR")
	private long id;

	@Column(name="BASIC_INDIVIDUAL_DATA")
	private BigDecimal basicIndividualData;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Column(name="COUNTRY_OF_BIRTH_ID")
	private BigDecimal countryOfBirthId;

	@Column(name="CUSTOMER_ID")
	private String customerId;

	@Temporal(TemporalType.DATE)
	@Column(name="DECEASE_DATE")
	private Date deceaseDate;

	@Column(name="EDUCATION_LEVEL_NT")
	private String educationLevelNt;

	@Column(name="FAMILY_SIZE")
	private BigDecimal familySize;

	@Column(name="FATHER_NAME")
	private String fatherName;

	@Column(name="MARITAL_STATUS_NT")
	private String maritalStatusNt;

	@Column(name="MOTHER_NAME")
	private String motherName;

	@Column(name="PROVINCE_OF_BIRTH_NT")
	private String provinceOfBirthNt;

	@Column(name="SEX_CODE_NT")
	private String sexCodeNt;

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

	@Column(name="STATUS_EDUCATION_NT")
	private String statusEducationNt;
}