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
@Table(name="cyberbank_core.CUSTOMER_BEHAVIOR_QUOTATION")
public class CustomerBehaviorQuotation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_BEHAVIOR_QUOTATION_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_BEHAVIOR_QUOTATION_ID_GENERATOR")
	private long id;

	@ManyToOne
	@JoinColumn(name="CURRENCY")
	private Currency currency;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_BEHAVIOUR_TYPE")
	private CustomerBehaviourType customerBehaviourType;
	
	@Column(name="DATE_FROM")
	private Timestamp dateFrom;

	@Column(name="DATE_TO")
	private Timestamp dateTo;

	@Column(name="EXPRESSION_UNIT")
	private BigDecimal expressionUnit;
	
	@ManyToOne
	@JoinColumn(name = "INSTITUTION")
	private Institution institution;

	@Column(name="PARITY_USD")
	private BigDecimal parityUsd;

	@Column(name="QUOT_ARBITRAGE")
	private BigDecimal quotArbitrage;

	@ManyToOne
	@JoinColumn(name = "QUOTATION_TYPE")
	private QuotationType quotationType;
	
	@Column(name="QUOT_BUY")
	private BigDecimal quotBuy;

	@Column(name="QUOT_SALE")
	private BigDecimal quotSale;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;

}