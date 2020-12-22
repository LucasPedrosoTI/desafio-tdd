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
@Table(name="CUSTOMER_OFFICER_USER")
@NamedQuery(name="CustomerOfficerUser.findAll", query="SELECT c FROM CustomerOfficerUser c")
public class CustomerOfficerUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_OFFICER_USER_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_OFFICER_USER_ID_GENERATOR")
	private long id;

	@Column(name="CRM_INFO")
	private String crmInfo;

	@Column(name="DATE_FROM")
	private Timestamp dateFrom;

	@Column(name="DATE_TO")
	private Timestamp dateTo;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRY_DATE_CRM_INFO")
	private Date expiryDateCrmInfo;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;


}