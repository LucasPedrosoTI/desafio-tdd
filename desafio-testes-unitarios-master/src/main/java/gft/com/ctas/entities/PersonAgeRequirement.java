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
@Table(name="PERSON_AGE_REQUIREMENT")
@NamedQuery(name="PersonAgeRequirement.findAll", query="SELECT p FROM PersonAgeRequirement p")
public class PersonAgeRequirement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PERSON_AGE_REQUIREMENT_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PERSON_AGE_REQUIREMENT_ID_GENERATOR")
	private long id;

	@Column(name="MAXIMAL_AGE")
	private BigDecimal maximalAge;

	@Column(name="MINIMAL_AGE")
	private BigDecimal minimalAge;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

}