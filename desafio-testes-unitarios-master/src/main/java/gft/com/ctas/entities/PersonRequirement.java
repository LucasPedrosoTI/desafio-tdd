package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="PERSON_REQUIREMENT")
@NamedQuery(name="PersonRequirement.findAll", query="SELECT p FROM PersonRequirement p")
public class PersonRequirement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PERSON_REQUIREMENT_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERSON_REQUIREMENT_ID_GENERATOR")
	private long id;

	@Column(name="ENTITY_FLAG")
	private BigDecimal entityFlag;

	@Column(name="FIELD")
	private String field;

	@Column(name="FIELD_ALIAS")
	private String fieldAlias;

	@Column(name="FIELD_NAME")
	private String fieldName;

	private BigDecimal mandatory;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="TABLE_ALIAS")
	private String tableAlias;

}