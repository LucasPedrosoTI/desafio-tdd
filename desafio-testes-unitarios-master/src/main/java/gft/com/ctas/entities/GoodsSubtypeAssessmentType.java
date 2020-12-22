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
@Table(name="GOODS_SUBTYPE_ASSESSMENT_TYPE")
@NamedQuery(name="GoodsSubtypeAssessmentType.findAll", query="SELECT g FROM GoodsSubtypeAssessmentType g")
public class GoodsSubtypeAssessmentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="GOODS_SUBTYPE_ASSESSMENT_TYPE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="GOODS_SUBTYPE_ASSESSMENT_TYPE_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="REGISTRY_DATE")
	private Date registryDate;

	@Column(name="REGISTRY_NUMBER")
	private String registryNumber;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;


}