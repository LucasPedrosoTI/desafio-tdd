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
@Table(name="OPERATION_RELATED_DETAIL")
@NamedQuery(name="OperationRelatedDetail.findAll", query="SELECT o FROM OperationRelatedDetail o")
public class OperationRelatedDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="OPERATION_RELATED_DETAIL_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OPERATION_RELATED_DETAIL_ID_GENERATOR")
	private long id;

	@Column(name="AMOUNT_RULE")
	private BigDecimal amountRule;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FROM")
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TO")
	private Date dateTo;

	@Column(name="DAY")
	private BigDecimal day;

	@Column(name="DAY_ID")
	private BigDecimal dayId;

	@Column(name="DAY_NBR")
	private BigDecimal dayNbr;

	@Column(name="DAY_WEEK_1")
	private BigDecimal dayWeek1;

	@Column(name="DAY_WEEK_2")
	private BigDecimal dayWeek2;

	@Column(name="DAY_WEEK_3")
	private BigDecimal dayWeek3;

	@Column(name="INSTITUTION_ID")
	private BigDecimal institutionId;

	@Column(name="INTERVAL")
	private BigDecimal interval;

	@Column(name="MONTH_NBR")
	private BigDecimal monthNbr;

	@Column(name="OPERATION_EXTERNAL")
	private String operationExternal;

	@Column(name="OPERATION_RELATED_ID")
	private BigDecimal operationRelatedId;

	@Column(name="OPERATION_TYPE_EXTERNAL")
	private BigDecimal operationTypeExternal;

	@Column(name="ORDER_ID")
	private BigDecimal orderId;

	@Column(name="ORDINAL_ID")
	private BigDecimal ordinalId;

	@Column(name="PERCENT_RULE")
	private BigDecimal percentRule;

	@Column(name="PERIOD_ID")
	private BigDecimal periodId;

	@Temporal(TemporalType.DATE)
	@Column(name="PROCESS_DATE")
	private Date processDate;

	@Column(name="RULE_RELATED_ID")
	private BigDecimal ruleRelatedId;

	@Column(name="SST_HOLIDAY_ANALISYS_TYPE_ID")
	private BigDecimal sstHolidayAnalisysTypeId;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="STATUS_ID")
	private BigDecimal statusId;

	@Column(name="STATUS_REASON_ID")
	private BigDecimal statusReasonId;

	@Column(name="SYSTEM_USER_CORE")
	private String systemUserCore;

	private BigDecimal term;

	@Column(name="TERM_ID")
	private BigDecimal termId;

	@Column(name="TYPE_RULE_ID")
	private BigDecimal typeRuleId;

}