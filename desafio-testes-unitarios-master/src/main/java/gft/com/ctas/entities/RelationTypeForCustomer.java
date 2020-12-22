package gft.com.ctas.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


import lombok.Data;
import javax.persistence.Entity;

@Data
@Entity
@Table(name="RELATION_TYPE_FOR_CUSTOMERS")
@NamedQuery(name="RelationTypeForCustomer.findAll", query="SELECT r FROM RelationTypeForCustomer r")
public class RelationTypeForCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RELATION_TYPE_FOR_CUSTOMERS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RELATION_TYPE_FOR_CUSTOMERS_ID_GENERATOR")
	private long id;

	@Column(name="LONG_DESC")
	private String longDesc;

	private String nemotecnico;

	@Column(name="OFFICIAL_ID")
	private String officialId;

	@Column(name="RELATION_TYPE_FOR_CUSTOMERS_ID")
	private BigDecimal relationTypeForCustomersId;

	@Column(name="SHORT_DESC")
	private String shortDesc;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;


}