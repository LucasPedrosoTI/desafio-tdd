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
@Table(name="cyberbank_core.CUSTOMER_RESTRICTION_ORIGIN")
public class CustomerRestrictionOrigin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_RESTRICTION_ORIGIN_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_RESTRICTION_ORIGIN_ID_GENERATOR")
	private long id;

	@Column(name="CUSTOMER_RESTRICTION_ORIGIN_ID")
	private BigDecimal customerRestrictionOriginId;

	@Column(name="LONG_DESC")
	private String longDesc;

	private String nemotecnico;

	@Column(name="OFFICIAL_ID")
	private String officialId;

	@Column(name="SHORT_DESC")
	private String shortDesc;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;
	
	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;
	
	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;
	

}