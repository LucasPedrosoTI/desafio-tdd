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
@Table(name = "cyberbank_core.BRANCH")
@Entity
public class Branch implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="BRANCH_ID_GENERATOR" )
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BRANCH_ID_GENERATOR")
	private long id;

	@Column(name="ATTENTION_POINT_QUANTITY")
	private BigDecimal attentionPointQuantity;

	@Column(name="BRANCH_CATEGORY")
	private BigDecimal branchCategory;

	@Column(name="BRANCH_ID")
	private BigDecimal branchId;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FROM")
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TO")
	private Date dateTo;

	@Column(name="HANDLE_CASH")
	private BigDecimal handleCash;

	@Column(name="LONG_DESC")
	private String longDesc;

	@Column(name="MEAN_TIME")
	private BigDecimal meanTime;

	@Column(name="OFFICIAL_ID")
	private String officialId;

	private BigDecimal region;

	@Column(name="REGION_CLEARING")
	private BigDecimal regionClearing;

	@Column(name="SHORT_DESC")
	private String shortDesc;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="TIME_FROM")
	private Timestamp timeFrom;

	@Column(name="TIME_TO")
	private Timestamp timeTo;

	@Column(name="TURN_TYPE")
	private BigDecimal turnType;

	@Column(name="WORK_ON_SATURDAY")
	private BigDecimal workOnSaturday;

	@Column(name="\"ZONE\"")
	private BigDecimal zone;

}