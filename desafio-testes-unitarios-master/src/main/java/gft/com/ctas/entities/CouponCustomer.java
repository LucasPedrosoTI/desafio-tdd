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
@Table(name="COUPON_CUSTOMER")
@NamedQuery(name="CouponCustomer.findAll", query="SELECT c FROM CouponCustomer c")
public class CouponCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COUPON_CUSTOMER_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COUPON_CUSTOMER_ID_GENERATOR")
	private long id;

	@Column(name="COUPON_CUSTOMER_ID")
	private BigDecimal couponCustomerId;

	@Column(name="COUPON_NUMBER")
	private BigDecimal couponNumber;

	@Column(name="DESCRIPTION_ESTABLISHMENT")
	private String descriptionEstablishment;

	@Column(name="IS_RESTRICT")
	private BigDecimal isRestrict;

	@Column(name="IS_WINNER_COUPON")
	private BigDecimal isWinnerCoupon;

	@Column(name="RESTRICT_REASON")
	private String restrictReason;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="TRANSACTION_AMOUNT")
	private BigDecimal transactionAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="TRANSACTION_DATE")
	private Date transactionDate;

	@Column(name="TRANSACTION_TYPE")
	private String transactionType;
}