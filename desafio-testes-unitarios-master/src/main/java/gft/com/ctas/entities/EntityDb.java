package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cyberbank_core.ENTITY")
public class EntityDb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ENTITY_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ENTITY_ID_GENERATOR")
	private long id;

	@Column(name="CORE_MODULE")
	private BigDecimal coreModule;

	@Column(name="DEFAULT_VALUE")
	private BigDecimal defaultValue;

	private String description;

	@Column(name="IS_AUDITABLE")
	private BigDecimal isAuditable;

	@Column(name="IS_CLONABLE")
	private BigDecimal isClonable;

	@Column(name="IS_FIXED")
	private BigDecimal isFixed;

	@Column(name="IS_TG")
	private BigDecimal isTg;

	private String name;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="USE_INSTITUTION")
	private BigDecimal useInstitution;

	@Column(name="USE_NUMERATOR")
	private BigDecimal useNumerator;

}