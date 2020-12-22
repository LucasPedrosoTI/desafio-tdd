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
@Table(name="PARTNERSHIP_PARAMETER")
@NamedQuery(name="PartnershipParameter.findAll", query="SELECT p FROM PartnershipParameter p")
public class PartnershipParameter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARTNERSHIP_PARAMETER_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARTNERSHIP_PARAMETER_ID_GENERATOR")
	private long id;

	@Column(name="PARTNERSHIP_PARAMETER_ID")
	private BigDecimal partnershipParameterId;

	private BigDecimal quantity;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="TRANSACTION_REASON")
	private BigDecimal transactionReason;

	@Column(name="\"VALUE\"")
	private BigDecimal value;


}