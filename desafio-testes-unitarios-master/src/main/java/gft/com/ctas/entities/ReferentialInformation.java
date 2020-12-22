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
@Table(name="REFERENTIAL_INFORMATION")
@NamedQuery(name="ReferentialInformation.findAll", query="SELECT r FROM ReferentialInformation r")
public class ReferentialInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REFERENTIAL_INFORMATION_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REFERENTIAL_INFORMATION_ID_GENERATOR")
	private long id;

	@Column(name="REFERENCE_COMMENTS")
	private String referenceComments;

	@Column(name="REFERENCE_CONCEPT")
	private String referenceConcept;

	@Temporal(TemporalType.DATE)
	@Column(name="REFERENCE_DATE")
	private Date referenceDate;

	@Column(name="REFERENCE_NUMBER")
	private BigDecimal referenceNumber;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;


}