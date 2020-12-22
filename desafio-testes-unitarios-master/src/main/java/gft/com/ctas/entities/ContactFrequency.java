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
@Table(name="CONTACT_FREQUENCY")
@NamedQuery(name="ContactFrequency.findAll", query="SELECT c FROM ContactFrequency c")
public class ContactFrequency implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CONTACT_FREQUENCY_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONTACT_FREQUENCY_ID_GENERATOR")
	private long id;

	@Column(name="CONTACT_FREQUENCY_ID")
	private BigDecimal contactFrequencyId;

	@Column(name="LONG_DESC")
	private String longDesc;

	private String nemotecnico;

	@Column(name="OFFICIAL_ID")
	private String officialId;

	@Column(name="SHORT_DESC")
	private String shortDesc;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Temporal(TemporalType.DATE)
	@Column(name="STATUS_DATE")
	private Date statusDate;
}