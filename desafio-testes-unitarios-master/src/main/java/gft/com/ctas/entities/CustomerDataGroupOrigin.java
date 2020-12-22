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
@Table(name="cyberbank_core.CUSTOMER_DATA_GROUP_ORIGIN")
public class CustomerDataGroupOrigin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_DATA_GROUP_ORIGIN_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_DATA_GROUP_ORIGIN_ID_GENERATOR")
	private long id;

	@ManyToOne
	@JoinColumn(name = "CHANNEL")
	private Channel channel;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_DATA_GROUP")
	private CustomerDataGroup customerDataGroup;
	
	@Column(name="MAX_NUMBER")
	private BigDecimal maxNumber;

	@Column(name="\"OPERATION\"")
	private BigDecimal operation;

	@Column(name="QUANTITY_TO_SEND")
	private BigDecimal quantityToSend;

	@Column(name="SCORE_UPDATE")
	private BigDecimal scoreUpdate;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;
	
	@Column(name="STATUS_DATE")
	private Timestamp statusDate;
	
	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;

	@ManyToOne
	@JoinColumn(name = "ORIGIN_STATUS")
	private OriginStatus originStatus;

}