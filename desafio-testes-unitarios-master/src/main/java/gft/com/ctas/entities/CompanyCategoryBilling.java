package gft.com.ctas.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


import lombok.Data;
import javax.persistence.Entity;

@Data
@Entity
@Table(name="COMPANY_CATEGORY_BILLING")
@NamedQuery(name="CompanyCategoryBilling.findAll", query="SELECT c FROM CompanyCategoryBilling c")
public class CompanyCategoryBilling implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COMPANY_CATEGORY_BILLING_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COMPANY_CATEGORY_BILLING_ID_GENERATOR")
	private long id;

	@Column(name="MAX_BILLING_VALUE")
	private BigDecimal maxBillingValue;

	@Column(name="MIN_BILLING_VALUE")
	private BigDecimal minBillingValue;

	@Column(name="OFFICIAL_ID")
	private String officialId;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;
}