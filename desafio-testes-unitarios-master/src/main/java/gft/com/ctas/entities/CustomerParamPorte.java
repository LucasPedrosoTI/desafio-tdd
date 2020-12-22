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
@Table(name="CUSTOMER_PARAM_PORTE")
@NamedQuery(name="CustomerParamPorte.findAll", query="SELECT c FROM CustomerParamPorte c")
public class CustomerParamPorte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_PARAM_PORTE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_PARAM_PORTE_ID_GENERATOR")
	private long id;

	private String description;

	@Column(name="\"DOMAIN\"")
	private BigDecimal domain;

	@Column(name="\"MAX\"")
	private BigDecimal max;

	@Column(name="\"MIN\"")
	private BigDecimal min;

	@Column(name="MIN_INCOME")
	private BigDecimal minIncome;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;


}