package gft.com.ctas.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


import lombok.Data;
import javax.persistence.Entity;

@Data
@Entity
@Table(name="EC_INF_LEGAL_ENTITY_TERM_TYPE")
@NamedQuery(name="EcInfLegalEntityTermType.findAll", query="SELECT e FROM EcInfLegalEntityTermType e")
public class EcInfLegalEntityTermType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EC_INF_LEGAL_ENTITY_TERM_TYPE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EC_INF_LEGAL_ENTITY_TERM_TYPE_ID_GENERATOR")
	private long id;

	@Column(name="BILLING_TERM_TYPE")
	private BigDecimal billingTermType;

	@Temporal(TemporalType.DATE)
	@Column(name="LEGAL_DATE")
	private Date legalDate;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

}