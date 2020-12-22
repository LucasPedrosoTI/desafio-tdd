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
@Table(name="cyberbank_core.CUSTOMER_CLASSIFICATION")
public class CustomerClassification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_CLASSIFICATION_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_CLASSIFICATION_ID_GENERATOR")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "ABILITY_TO_PAY")
	private AbilityToPay abilityToPay;
	
	@ManyToOne
	@JoinColumn(name = "CURRENT_CLASSIFICATION_BANK")
	private ClassificationCode classificationCode;
	
	@ManyToOne
	@JoinColumn(name = "CLASSIFICATION_GROUP")
	private ClassificationGroup classificationGroup;
	
	@Temporal(TemporalType.DATE)
	@Column(name="CLASSIFICATION_DATE")
	private Date classificationDate;

	@ManyToOne
	@JoinColumn(name="CUSTOMER")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_BEHAVIOUR_TYPE")
	private CustomerBehaviourType customerBehaviourType;
	
	@ManyToOne
	@JoinColumn(name = "DEBTOR_SPECIAL_CONDITION")
	private DebtorSpecialCondition debtorSpecialCondition;
	
	@Column(name="MONTH_PERIOD")
	private BigDecimal monthPeriod;
	
	@ManyToOne
	@JoinColumn(name = "PORTFOLIO_CODE")
	private PortfolioCode portfolioCode;

	@ManyToOne
	@JoinColumn(name = "QUALIFICATION_ASSIGNMENT")
	private QualificationAssignment qualificationAssignment;
	
	@ManyToOne
	@JoinColumn(name = "QUALIFIER_ENTITY_CODE")
	private QualifierEntityCode qualifierEntityCode;
	
	@ManyToOne
	@JoinColumn(name = "RISK_CALIFICATION")
	private RiskCalification riskCalification;
	
	@ManyToOne
	@JoinColumn(name = "RISK_CATEGORY")
	private RiskCategory riskCategory;
	
	@Column(name="RISK_QUALIFICATION")
	private BigDecimal riskQualification;
	
	@ManyToOne
	@JoinColumn(name = "RISK_QUALIFICATION_CATEGORY")
	private RiskQualificationCategory riskQualificationCategory;

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
	
	@Temporal(TemporalType.DATE)
	@Column(name="STATUS_DATE")
	private Date statusDate;

	@Column(name="STATUS_REASON")
	private BigDecimal statusReason;
	
	@ManyToOne
	@JoinColumn(name = "SYSTEM_USER_CORE")
	private SystemUserCore systemUserCore;
	
	@ManyToOne
	@JoinColumn(name = "OFFICER_CURRENT_CLASSIFICATION")
	private SystemUserCore officerCurrentClassification;

	@Column(name="YEAR_PERIOD")
	private BigDecimal yearPeriod;

}