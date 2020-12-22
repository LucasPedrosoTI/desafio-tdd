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
@Table(name="ADDRESS_GOODS")
public class AddressGood implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ADDRESS_GOODS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ADDRESS_GOODS_ID_GENERATOR")
	private long id;

	@Column(name="COUNTRY_ZIP_CODE")
	private String countryZipCode;

	@Column(name="EXACT_ADDRESS")
	private String exactAddress;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	private String street;

	@Column(name="STREET_NUMBER")
	private BigDecimal streetNumber;

	@Column(name="TOWN_ZONE")
	private String townZone;

}