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
@Table(name="ELECTRONICS_CONTACT_HIST")
@NamedQuery(name="ElectronicsContactHist.findAll", query="SELECT e FROM ElectronicsContactHist e")
public class ElectronicsContactHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ELECTRONICS_CONTACT_HIST_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ELECTRONICS_CONTACT_HIST_ID_GENERATOR")
	private long id;

	@Column(name="\"ACTION\"")
	private String action;

	@Temporal(TemporalType.DATE)
	@Column(name="ADDITION_DATE")
	private Date additionDate;

	@Column(name="CUSTOMER_ID")
	private String customerId;

	@Column(name="ELECTRONICS_CONTACT")
	private BigDecimal electronicsContact;

	@Column(name="ELECTRONICS_CONTACT_TYPE_NT")
	private String electronicsContactTypeNt;

	@Column(name="EMAIL_ADDRESS_COMPLETE")
	private String emailAddressComplete;

	@Column(name="EMAIL_FOR_COMU")
	private BigDecimal emailForComu;

	@Column(name="EMAIL_ORDER")
	private BigDecimal emailOrder;

	@Column(name="EMAIL_TYPE_NT")
	private String emailTypeNt;

	@Column(name="EMAIL_USE_NT")
	private String emailUseNt;

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