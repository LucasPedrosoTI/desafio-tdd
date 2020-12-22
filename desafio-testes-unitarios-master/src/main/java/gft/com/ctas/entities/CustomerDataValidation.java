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
@Table(name="cyberbank_core.CUSTOMER_DATA_VALIDATION")
public class CustomerDataValidation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_DATA_VALIDATION_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_DATA_VALIDATION_ID_GENERATOR")
	private long id;

	@ManyToOne
	@JoinColumn(name = "TABLE_NAME")
	private EntityDb entity;
	
	@Column(name="ENTITY_FLAG")
	private BigDecimal entityFlag;

	@Column(name="FIELD")
	private String field;

	@Column(name="FIELD_ALIAS")
	private String fieldAlias;

	@Column(name="FIELD_NAME")
	private String fieldName;

	@ManyToOne
	@JoinColumn(name = "INSTITUTION")
	private Institution institution;
	
	private BigDecimal mandatory;

	@ManyToOne
	@JoinColumn(name = "PERSON_TYPE")
	private PersonType personType;
	
	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;
	
	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;
	
	@Column(name="TABLE_ALIAS")
	private String tableAlias;
	
}