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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="cyberbank_core.CUSTOMER_GROUP_CICLE")
public class CustomerGroupCicle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_GROUP_CICLE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_GROUP_CICLE_ID_GENERATOR")
	private long id;

	@Column(name="ACCOUNT_REFERENCE")
	private String accountReference;

	@Column(name="ACCOUNT_TO_DEPOSIT")
	private String accountToDeposit;

	@Column(name="CUSTOMER_QUANTITY")
	private BigDecimal customerQuantity;

	@Column(name="CYCLE_NUMBER")
	private BigDecimal cycleNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FROM")
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TO")
	private Date dateTo;

	@Column(name="INSTALLMENT_QUANTITY")
	private BigDecimal installmentQuantity;

	private BigDecimal loan;

	@Column(name="LOAN_REFERENCE")
	private String loanReference;

	private String observations;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Temporal(TemporalType.DATE)
	@Column(name="STATUS_DATE")
	private Date statusDate;

	private BigDecimal warranty;

	@Column(name="WARRANTY_REFERENCE")
	private String warrantyReference;
}