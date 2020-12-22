package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CUSTOMER_OFFICER_USER_HIST")
@NamedQuery(name="CustomerOfficerUserHist.findAll", query="SELECT c FROM CustomerOfficerUserHist c")
public class CustomerOfficerUserHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_OFFICER_USER_HIST_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_OFFICER_USER_HIST_ID_GENERATOR")
	private long id;

	@Column(name="\"ACTION\"")
	private String action;

	@Column(name="CUSTOMER_ID")
	private String customerId;

	@Column(name="CUSTOMER_OFFICER_USER")
	private BigDecimal customerOfficerUser;

	@Column(name="OFFICER_ID")
	private String officerId;

	@Column(name="OFFICER_ROL_NT")
	private String officerRolNt;

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

	
}