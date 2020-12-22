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
@Table(name="PARTNERSHIP_TRANSACTION_REASON")
@NamedQuery(name="PartnershipTransactionReason.findAll", query="SELECT p FROM PartnershipTransactionReason p")
public class PartnershipTransactionReason implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARTNERSHIP_TRANSACTION_REASON_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARTNERSHIP_TRANSACTION_REASON_ID_GENERATOR")
	private long id;

	@Column(name="PARTNERSHIP_TRANSACTION_REA_ID")
	private BigDecimal partnershipTransactionReaId;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="TRANSACTION_REASON")
	private BigDecimal transactionReason;

	@Column(name="TXN_CODE")
	private BigDecimal txnCode;

}