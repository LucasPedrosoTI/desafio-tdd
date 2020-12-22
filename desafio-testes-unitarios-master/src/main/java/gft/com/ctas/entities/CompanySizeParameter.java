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
@Table(name="COMPANY_SIZE_PARAMETER")
@NamedQuery(name="CompanySizeParameter.findAll", query="SELECT c FROM CompanySizeParameter c")
public class CompanySizeParameter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COMPANY_SIZE_PARAMETER_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMPANY_SIZE_PARAMETER_ID_GENERATOR")
	private long id;

	private BigDecimal afe;

	private BigDecimal ate;

	private BigDecimal medium;

	private BigDecimal micro;

	private BigDecimal small;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="VAN_COM")
	private BigDecimal vanCom;

	@Column(name="VAN_IND")
	private BigDecimal vanInd;
}