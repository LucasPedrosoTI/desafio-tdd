package gft.com.ctas.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="CUSTOMER_ENTITY_FIELDS")
@NamedQuery(name="CustomerEntityField.findAll", query="SELECT c FROM CustomerEntityField c")
public class CustomerEntityField implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_ENTITY_FIELDS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_ENTITY_FIELDS_ID_GENERATOR")
	private long id;

	private String entity;

	@Column(name="FIELD_DESCRIPTION")
	private String fieldDescription;

	@Column(name="FIELD_NAME")
	private String fieldName;

	@ManyToOne
	@JoinColumn(name = "PERSON_TYPE")
	private PersonType personType;
	
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
	
	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;
	
	@Column(name="SYSTEM_USER_CORE")
	private String systemUserCore;


}