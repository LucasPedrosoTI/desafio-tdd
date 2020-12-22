package gft.com.ctas.entities;

import java.io.Serializable;
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
@Table(name="NEGATIVE_CUSTOMER")
@NamedQuery(name="NegativeCustomer.findAll", query="SELECT n FROM NegativeCustomer n")
public class NegativeCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="NEGATIVE_CUSTOMER_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NEGATIVE_CUSTOMER_ID_GENERATOR")
	private long id;

	@Column(name="\"ACTION\"")
	private String action;

	private String comments;

	@Column(name="DESCRIPTION_DROP")
	private String descriptionDrop;

	@Column(name="DESCRIPTION_REASON")
	private String descriptionReason;

	@Temporal(TemporalType.DATE)
	@Column(name="DROP_FROM_NEGATIVE_RECORDING")
	private Date dropFromNegativeRecording;

	@Column(name="IDENTIFICATION_NUMBER")
	private String identificationNumber;

	private String name;

	@Temporal(TemporalType.DATE)
	@Column(name="NEGATIVE_DATE_FROM")
	private Date negativeDateFrom;

	private String reference;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="SYSTEM_USER_CORE")
	private String systemUserCore;

}