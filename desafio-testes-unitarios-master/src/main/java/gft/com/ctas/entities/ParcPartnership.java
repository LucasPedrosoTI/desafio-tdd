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
@Table(name="PARC_PARTNERSHIP")
@NamedQuery(name="ParcPartnership.findAll", query="SELECT p FROM ParcPartnership p")
public class ParcPartnership implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARC_PARTNERSHIP_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARC_PARTNERSHIP_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FROM")
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TO")
	private Date dateTo;

	@Column(name="DESCRIPTION_DETAILED")
	private String descriptionDetailed;

	@Column(name="IS_PACKAGE")
	private BigDecimal isPackage;

	@Column(name="IS_REWARDS")
	private BigDecimal isRewards;

	@Column(name="IS_TARJETA")
	private BigDecimal isTarjeta;

	@Column(name="PARC_PARTNERSHIP_ID")
	private String parcPartnershipId;

	@Column(name="PARTNERSHIP_DESC")
	private String partnershipDesc;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	
}