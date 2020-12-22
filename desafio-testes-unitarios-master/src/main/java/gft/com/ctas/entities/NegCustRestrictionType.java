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
@Table(name="NEG_CUST_RESTRICTION_TYPE")
@NamedQuery(name="NegCustRestrictionType.findAll", query="SELECT n FROM NegCustRestrictionType n")
public class NegCustRestrictionType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="NEG_CUST_RESTRICTION_TYPE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NEG_CUST_RESTRICTION_TYPE_ID_GENERATOR")
	private long id;

	@Column(name="LONG_DESC")
	private String longDesc;

	@Column(name="NEG_RESTRICTION_ID")
	private BigDecimal negRestrictionId;

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