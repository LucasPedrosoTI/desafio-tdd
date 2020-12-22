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
@Table(name="cyberbank_core.CUSTOMER_USER")
public class CustomerUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_USER_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_USER_ID_GENERATOR")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "ASSOCIATED_USER")
	private SystemUserCore associatedUser;
	
	@ManyToOne
	@JoinColumn(name = "CUSTOMER")
	private Customer customer;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;
	
	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;
	
	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore systemUserCore;
	
	private BigDecimal status;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

}