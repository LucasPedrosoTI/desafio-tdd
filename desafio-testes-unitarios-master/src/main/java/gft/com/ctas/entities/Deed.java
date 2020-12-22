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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@NamedQuery(name="Deed.findAll", query="SELECT d FROM Deed d")
public class Deed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DEED_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEED_ID_GENERATOR")
	private long id;

	@Column(name="AUTHORIZING_NOTARY")
	private String authorizingNotary;

	@Column(name="DEED_NUMBER")
	private BigDecimal deedNumber;

	@Column(name="INSCRIPTION_NUMBER")
	private String inscriptionNumber;

	@Column(name="PUBLIC_DEED_DATE")
	private Timestamp publicDeedDate;

	@Column(name="REGISTRY_BOOK")
	private BigDecimal registryBook;

	@Column(name="REGISTRY_FOLIO")
	private BigDecimal registryFolio;

	@Column(name="REGISTRY_NAME")
	private String registryName;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Temporal(TemporalType.DATE)
	@Column(name="STATUS_DATE")
	private Date statusDate;

}