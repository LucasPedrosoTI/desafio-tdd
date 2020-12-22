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
@Table(name="PARTNERSHIP_SUBPRODUCT")
@NamedQuery(name="PartnershipSubproduct.findAll", query="SELECT p FROM PartnershipSubproduct p")
public class PartnershipSubproduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARTNERSHIP_SUBPRODUCT_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARTNERSHIP_SUBPRODUCT_ID_GENERATOR")
	private long id;

	@Column(name="PARTNERSHIP_SUBPRODUCT_ID")
	private BigDecimal partnershipSubproductId;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

}