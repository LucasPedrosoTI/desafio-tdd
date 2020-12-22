package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(name="REAL_PROPERTY_GROUND_TYPE")
@NamedQuery(name="RealPropertyGroundType.findAll", query="SELECT r FROM RealPropertyGroundType r")
public class RealPropertyGroundType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REAL_PROPERTY_GROUND_TYPE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REAL_PROPERTY_GROUND_TYPE_ID_GENERATOR")
	private long id;

	@Column(name="AFFECTATION_PERCENT")
	private BigDecimal affectationPercent;

}