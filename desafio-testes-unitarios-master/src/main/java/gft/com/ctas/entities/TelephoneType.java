package gft.com.ctas.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


import lombok.Data;
import javax.persistence.Entity;

@Data
@Entity
@Table(name="TELEPHONE_TYPE")
@NamedQuery(name="TelephoneType.findAll", query="SELECT t FROM TelephoneType t")
public class TelephoneType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TELEPHONE_TYPE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TELEPHONE_TYPE_ID_GENERATOR")
	private long id;

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

	private BigDecimal status;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="STATUS_REASON")
	private BigDecimal statusReason;

	@Column(name="TELEPHONE_TYPE_ID")
	private BigDecimal telephoneTypeId;

}