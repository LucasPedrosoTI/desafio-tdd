package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name="RELATION_CUSTOMER_CUSTOMER")
@NamedQuery(name="RelationCustomerCustomer.findAll", query="SELECT r FROM RelationCustomerCustomer r")
public class RelationCustomerCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RELATION_CUSTOMER_CUSTOMER_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RELATION_CUSTOMER_CUSTOMER_ID_GENERATOR")
	private long id;

	@Column(name="BANK_CUSTOMER_OR_SUPPLIER")
	private BigDecimal bankCustomerOrSupplier;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_FROM")
	private Date dateFrom;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TO")
	private Date dateTo;

	private String description;

	@Column(name="EXTERNAL_CUSTOMER")
	private BigDecimal externalCustomer;

	private BigDecimal notification;

	private BigDecimal porcentaje;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;


}