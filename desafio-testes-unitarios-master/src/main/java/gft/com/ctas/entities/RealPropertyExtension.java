package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name="REAL_PROPERTY_EXTENSION")
@NamedQuery(name="RealPropertyExtension.findAll", query="SELECT r FROM RealPropertyExtension r")
public class RealPropertyExtension implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REAL_PROPERTY_EXTENSION_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REAL_PROPERTY_EXTENSION_ID_GENERATOR")
	private long id;

	@Column(name="ANNOTATION_ENROLLMET")
	private BigDecimal annotationEnrollmet;

	@Temporal(TemporalType.DATE)
	@Column(name="CAR_EMISSION_DATE")
	private Date carEmissionDate;

	@Column(name="CAR_NUMBER")
	private String carNumber;

	@Column(name="CAR_REGISTRY")
	private BigDecimal carRegistry;

	@Column(name="CAR_YEAR")
	private BigDecimal carYear;

	@Column(name="CCIR_NUMBER")
	private String ccirNumber;

	private BigDecimal certificated;

	@Column(name="CERTIFICATED_NUMBER")
	private String certificatedNumber;

	private BigDecimal fraction;

	private BigDecimal georeferenced;

	private BigDecimal insurance;

	@Temporal(TemporalType.DATE)
	@Column(name="INSURANCE_EXPIRATION_DATE")
	private Date insuranceExpirationDate;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_REGISTRT_AVAIL_DATE")
	private Date lastRegistrtAvailDate;

	@Column(name="LAST_REGISTRT_AVAIL_NUMBER")
	private BigDecimal lastRegistrtAvailNumber;

	private BigDecimal latitude;

	@Temporal(TemporalType.DATE)
	@Column(name="LAU_EMISSION_DATE")
	private Date lauEmissionDate;

	@Column(name="LAU_NUMBER")
	private String lauNumber;

	@Column(name="LAU_REGISTRY")
	private BigDecimal lauRegistry;

	@Temporal(TemporalType.DATE)
	@Column(name="LAU_VALIDITY_DATE")
	private Date lauValidityDate;

	@Column(name="LAU_YEAR")
	private BigDecimal lauYear;

	private BigDecimal longitude;

	@Column(name="NIRF_NUMBER")
	private String nirfNumber;

	@Column(name="PROPERTY_COORDINATE_UTM")
	private String propertyCoordinateUtm;

	@Column(name="PROPERTY_NAME")
	private String propertyName;

	private String registration;

	@Temporal(TemporalType.DATE)
	@Column(name="REGISTRATION_DATE")
	private Date registrationDate;

	@Column(name="\"ZONE\"")
	private String zone;

}