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
@Table(name="PARC_CUSTOMER_IDENTIFICATION")
@NamedQuery(name="ParcCustomerIdentification.findAll", query="SELECT p FROM ParcCustomerIdentification p")
public class ParcCustomerIdentification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARC_CUSTOMER_IDENTIFICATION_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARC_CUSTOMER_IDENTIFICATION_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="ADDITION_DATE")
	private Date additionDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FROM")
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TO")
	private Date dateTo;

	@Column(name="IDENTIFICATION_NUMBER")
	private String identificationNumber;

	@Column(name="REGISTER_STATE_DATE")
	private Timestamp registerStateDate;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;


}