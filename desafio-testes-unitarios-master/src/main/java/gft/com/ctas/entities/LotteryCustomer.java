	package gft.com.ctas.entities;

import java.io.Serializable;
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
@Table(name="LOTTERY_CUSTOMER")
@NamedQuery(name="LotteryCustomer.findAll", query="SELECT l FROM LotteryCustomer l")
public class LotteryCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LOTTERY_CUSTOMER_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LOTTERY_CUSTOMER_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="ACCEPT_DATE")
	private Date acceptDate;

	@Temporal(TemporalType.DATE)
	@Column(name="OPTIN_DATE")
	private Date optinDate;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

}