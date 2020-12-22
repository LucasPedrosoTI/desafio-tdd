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
@Table(name="\"QUALIFICATION\"")
@NamedQuery(name="Qualification.findAll", query="SELECT q FROM Qualification q")
public class Qualification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="QUALIFICATION_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="QUALIFICATION_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="CENTRAL_BANK_RATING_DATE")
	private Date centralBankRatingDate;

	@Temporal(TemporalType.DATE)
	@Column(name="CENTRAL_BANK_RATING_EXPIRY")
	private Date centralBankRatingExpiry;

	@Column(name="CENTRAL_BANK_RATING_ID")
	private String centralBankRatingId;

	@Temporal(TemporalType.DATE)
	@Column(name="INITIAL_CLASSIFICATION_DATE")
	private Date initialClassificationDate;

	@Column(name="MONTH_PERIOD")
	private BigDecimal monthPeriod;

	@Column(name="OFFICER_CURRENT_CLASSIFCATION")
	private String officerCurrentClassifcation;

	@Column(name="OFFICER_INITIAL_CLASSIFICATION")
	private String officerInitialClassification;

	@Column(name="OFFICER_PREVIUS_CLASSIFICATION")
	private String officerPreviusClassification;

	@Temporal(TemporalType.DATE)
	@Column(name="PREVIOUS_CLASSIFICATION_DATE")
	private Date previousClassificationDate;

	@Column(name="QUALIFICATION_ID")
	private BigDecimal qualificationId;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="SYSTEM_USER_CORE")
	private String systemUserCore;

	@Column(name="YEAR_PERIOD")
	private BigDecimal yearPeriod;

	
}