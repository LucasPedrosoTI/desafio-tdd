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
@Table(name="CUSTOMER_IDENTIFICATION")
@NamedQuery(name="CustomerIdentification.findAll", query="SELECT c FROM CustomerIdentification c")
public class CustomerIdentification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_IDENTIFICATION_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_IDENTIFICATION_ID_GENERATOR")
	private long id;

	@Column(name="CHECK_IDENTIFICATION")
	private BigDecimal checkIdentification;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_ENTRANCE")
	private Date dateEntrance;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FROM")
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TO")
	private Date dateTo;

	@Column(name="IDENTIFICATION_COMPLEMENT")
	private String identificationComplement;

	@Column(name="IDENTIFICATION_NUMBER")
	private String identificationNumber;

	@Column(name="IMAGE_ID")
	private String imageId;

	private String legal;

	@Column(name="PARENT_COMPANY_FLAG")
	private BigDecimal parentCompanyFlag;

	@Column(name="REGISTER_STATE_DATE")
	private Timestamp registerStateDate;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="SYSTEM_USER_CORE")
	private String systemUserCore;

	@Temporal(TemporalType.DATE)
	@Column(name="VALIDITY_IDENTIFICATION")
	private Date validityIdentification;


}