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
@Table(name="LOTTERY_CATALOG")
@NamedQuery(name="LotteryCatalog.findAll", query="SELECT l FROM LotteryCatalog l")
public class LotteryCatalog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LOTTERY_CATALOG_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LOTTERY_CATALOG_ID_GENERATOR")
	private long id;

	@Column(name="INDICATOR_LOTTERY_TYPE")
	private BigDecimal indicatorLotteryType;

	@Column(name="LOTTERY_CATALOG_ID")
	private BigDecimal lotteryCatalogId;

	@Column(name="LOTTERY_DESCRIPTION")
	private String lotteryDescription;

	@Column(name="LOTTERY_NUMBER")
	private BigDecimal lotteryNumber;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="TRANSACTION_LIMIT_VALUE_CREDIT")
	private BigDecimal transactionLimitValueCredit;

	@Column(name="TRANSACTION_LIMIT_VALUE_DEBIT")
	private BigDecimal transactionLimitValueDebit;

	@Temporal(TemporalType.DATE)
	@Column(name="VALIDITY_END_DATE")
	private Date validityEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="VALIDITY_START_DATE")
	private Date validityStartDate;

}