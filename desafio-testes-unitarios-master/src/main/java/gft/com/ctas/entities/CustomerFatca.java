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
@Table(name="CUSTOMER_FATCA")
@NamedQuery(name="CustomerFatca.findAll", query="SELECT c FROM CustomerFatca c")
public class CustomerFatca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_FATCA_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_FATCA_ID_GENERATOR")
	private long id;

	@Column(name="ADDRESS_PHONE_OTHER_COUNTRIES")
	private BigDecimal addressPhoneOtherCountries;

	@Column(name="ANOTHER_CITIZENSHIP")
	private BigDecimal anotherCitizenship;

	@Column(name="OFFICIAL_ID")
	private String officialId;

	@Column(name="OTHER_TAX_ADDRESS")
	private BigDecimal otherTaxAddress;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="STAYED_OUTSIDE_BRAZIL_LAST_12M")
	private BigDecimal stayedOutsideBrazilLast12m;

	@Column(name="VALID_PERM_RESIDENCE_STATUS")
	private BigDecimal validPermResidenceStatus;

}