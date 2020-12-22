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
@Table(name="ECONOMIC_INFO_LEGAL_ENTITY")
@NamedQuery(name="EconomicInfoLegalEntity.findAll", query="SELECT e FROM EconomicInfoLegalEntity e")
public class EconomicInfoLegalEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ECONOMIC_INFO_LEGAL_ENTITY_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ECONOMIC_INFO_LEGAL_ENTITY_ID_GENERATOR")
	private long id;

	private BigDecimal amortizations;

	@Temporal(TemporalType.DATE)
	@Column(name="BALANCE_DATE")
	private Date balanceDate;

	@Column(name="BILLING_ANNUAL")
	private BigDecimal billingAnnual;

	@Column(name="CLEAR__PATRIMONY")
	private BigDecimal clearPatrimony;

	@Column(name="CLEAR_SALES_GOODS_SERVICES")
	private BigDecimal clearSalesGoodsServices;

	@Column(name="CURRENT_ACCOUNT_PAYABLE")
	private BigDecimal currentAccountPayable;

	@Column(name="CURRENT_ASSET")
	private BigDecimal currentAsset;

	@Column(name="CURRENT_CAPITAL_ASSET")
	private BigDecimal currentCapitalAsset;

	@Column(name="CURRENT_LIABILITY")
	private BigDecimal currentLiability;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FROM")
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_INSERT")
	private Date dateInsert;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TO")
	private Date dateTo;

	@Column(name="DISTRIBUTION_PROFITS")
	private BigDecimal distributionProfits;

	@Column(name="GROSS_RESULT")
	private BigDecimal grossResult;

	@Column(name="INCOME_TAX")
	private BigDecimal incomeTax;

	@Column(name="NET_AMT_TECNICAL_REVALUATION")
	private BigDecimal netAmtTecnicalRevaluation;

	@Column(name="NET_RESULT")
	private BigDecimal netResult;

	@Column(name="NON_CURRENT_ACCOUNT_PAYABLE")
	private BigDecimal nonCurrentAccountPayable;

	@Column(name="NON_CURRENT_CAPITAL_ASSET")
	private BigDecimal nonCurrentCapitalAsset;

	@Column(name="NON_OPERATIONAL_PROFIT")
	private BigDecimal nonOperationalProfit;

	@Column(name="OFFICIAL_QUANTITY")
	private BigDecimal officialQuantity;

	@Column(name="PROFIT_BOTTOM_LINE")
	private BigDecimal profitBottomLine;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="SUSCRIBED_CAP_UNINCORPORATED")
	private BigDecimal suscribedCapUnincorporated;

	@Column(name="SYSTEM_USER_CORE")
	private String systemUserCore;

	@Column(name="TOTAL_ASSET")
	private BigDecimal totalAsset;

	@Column(name="TOTAL_CURRENT_RECEIVABLE")
	private BigDecimal totalCurrentReceivable;

	@Column(name="TOTAL_LIABILITY")
	private BigDecimal totalLiability;

	@Column(name="TOTAL_NON_CURRENT_RECEIVABLE")
	private BigDecimal totalNonCurrentReceivable;

	@Column(name="TRADING_PROFIT")
	private BigDecimal tradingProfit;

	@Column(name="UNALLOCATED_PROFIT")
	private BigDecimal unallocatedProfit;

	@Column(name="VARIATION_ASSET")
	private BigDecimal variationAsset;

	
}