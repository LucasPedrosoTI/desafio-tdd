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
@Table(name="EMAIL_TYPE")
@NamedQuery(name="EmailType.findAll", query="SELECT e FROM EmailType e")
public class EmailType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EMAIL_TYPE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EMAIL_TYPE_ID_GENERATOR")
	private long id;

	@Column(name="EMAIL_TYPE_ID")
	private BigDecimal emailTypeId;

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

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;


}