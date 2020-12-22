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
@Table(name="OPERATION_RELATED")
@NamedQuery(name="OperationRelated.findAll", query="SELECT o FROM OperationRelated o")
public class OperationRelated implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="OPERATION_RELATED_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OPERATION_RELATED_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FROM")
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TO")
	private Date dateTo;

	@Column(name="DETAIL_FLAG")
	private BigDecimal detailFlag;

	@Column(name="OPERATION_ID")
	private String operationId;

	@Column(name="OPERATION_ID_RELATED")
	private String operationIdRelated;

	@Column(name="OPERATION_RELATED")
	private String operationRelatedColumn;

	@Column(name="ORDER_ID")
	private BigDecimal orderId;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="SYSTEM_USER_CORE")
	private String systemUserCore;

}