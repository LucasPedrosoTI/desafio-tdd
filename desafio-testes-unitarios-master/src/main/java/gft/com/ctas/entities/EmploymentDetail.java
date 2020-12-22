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
@Table(name="EMPLOYMENT_DETAILS")
@NamedQuery(name="EmploymentDetail.findAll", query="SELECT e FROM EmploymentDetail e")
public class EmploymentDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EMPLOYMENT_DETAILS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMPLOYMENT_DETAILS_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="ANTIQUITY_COMPANY")
	private Date antiquityCompany;

	@Column(name="ANTIQUITY_IN_BUSINESS")
	private BigDecimal antiquityInBusiness;

	@Column(name="ANTIQUITY_IN_BUSINESS_SECOND")
	private BigDecimal antiquityInBusinessSecond;

	@Temporal(TemporalType.DATE)
	@Column(name="APPOINTMENT_END_DATE")
	private Date appointmentEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="APPOINTMENT_START_DATE")
	private Date appointmentStartDate;

	@Column(name="EMPLOYER_IDENTIFICATION")
	private String employerIdentification;

	@Column(name="EMPLOYER_NAME")
	private String employerName;

	@Column(name="EMPLOYER_NAME_SECONDARY")
	private String employerNameSecondary;

	@Column(name="EMPLOYER_SECONDARY")
	private String employerSecondary;

	@Temporal(TemporalType.DATE)
	@Column(name="EMPLOYMENTE_START_DATE")
	private Date employmenteStartDate;

	@Column(name="FIXED_INCOME")
	private BigDecimal fixedIncome;

	@Column(name="INCOME_CHECK")
	private BigDecimal incomeCheck;

	@Column(name="INCOME_CHECK_SECOND")
	private BigDecimal incomeCheckSecond;

	@Temporal(TemporalType.DATE)
	@Column(name="INCOME_VERIFICATION_DATE")
	private Date incomeVerificationDate;

	@Column(name="\"POSITION\"")
	private BigDecimal position;

	@Column(name="RESIGN_DATE")
	private Timestamp resignDate;

	@Column(name="RESIGN_MOTIVE")
	private String resignMotive;

	@Temporal(TemporalType.DATE)
	@Column(name="SECONDARY_EMPLOYMENT_START")
	private Date secondaryEmploymentStart;

	@Column(name="SECONDARY_INCOME")
	private BigDecimal secondaryIncome;

	@Temporal(TemporalType.DATE)
	@Column(name="SECONDARY_INCOME_VERIFICAT")
	private Date secondaryIncomeVerificat;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	private String underactivity;

	@Column(name="UNEMPLOYMENT_INSURANCE")
	private BigDecimal unemploymentInsurance;

	@Column(name="VARIABLE_INCOME")
	private BigDecimal variableIncome;

	@Column(name="VARIABLE_INCOME_CHECK")
	private BigDecimal variableIncomeCheck;


}