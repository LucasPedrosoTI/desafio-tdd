package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="cyberbank_core.CUSTOMER_RENOVATION_RULE")
public class CustomerRenovationRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_RENOVATION_RULE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_RENOVATION_RULE_ID_GENERATOR")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "PERSON_TYPE")
	private PersonType personType;

	@Column(name="QTY_OVERDUE_DAYS")
	private BigDecimal qtyOverdueDays;

	@Column(name="QTY_WARNING_DAYS")
	private BigDecimal qtyWarningDays;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;
	
	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;
	
	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore userCore;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

}