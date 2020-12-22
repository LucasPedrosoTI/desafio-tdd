package gft.com.ctas.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Data;
import javax.persistence.Entity;

@Data
@Entity
@Table(name="CLIENT_LEVEL")
@NamedQuery(name="ClientLevel.findAll", query="SELECT c FROM ClientLevel c")
public class ClientLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CLIENT_LEVEL_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CLIENT_LEVEL_ID_GENERATOR")
	private long id;

	@Column(name="CLIENT_LEVEL_ID")
	private BigDecimal clientLevelId;

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