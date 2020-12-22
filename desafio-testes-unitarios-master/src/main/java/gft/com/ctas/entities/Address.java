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
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class Address implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ADDRESS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ADDRESS_ID_GENERATOR")
	private long id;

	@Column(name="ADDRESS_ALLOCATE")
	private BigDecimal addressAllocate;

	@Temporal(TemporalType.DATE)
	@Column(name="ADDRESS_EXPIRY_DATE")
	private Date addressExpiryDate;

	@Column(name="ADDRESS_ID")
	private BigDecimal addressId;

	@Temporal(TemporalType.DATE)
	@Column(name="ADDRESS_LAST_USE_DATE")
	private Date addressLastUseDate;

	@Temporal(TemporalType.DATE)
	@Column(name="ADITION_DATE")
	private Date aditionDate;

	private String apartment;

	private String area;

	@Column(name="\"BLOCK\"")
	private String block;

	@Column(name="BRANCH_POSTAL_OFFICE_BOX")
	private String branchPostalOfficeBox;

	private String comments;

	@Column(name="COUNTRY_ZIP_CODE")
	private String countryZipCode;

	@Column(name="EXACT_ADDRESS")
	private String exactAddress;

	@Column(name="\"FLOOR\"")
	private String floor;

	private String highway;

	@Column(name="HIGHWAY_EXIT")
	private String highwayExit;

	@Column(name="HOUSE_NUMBER")
	private String houseNumber;

	@Column(name="HOUSE_TYPE")
	private String houseType;

	@Column(name="INTERNAL_STREET")
	private String internalStreet;

	@Column(name="INTERNAL_STREET_NUMBER")
	private String internalStreetNumber;

	@Column(name="IS_FOR_CORRESPONDENCE")
	private BigDecimal isForCorrespondence;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_RETURN_MAIL_DATE")
	private Date lastReturnMailDate;

	@Column(name="LEFT_STREET")
	private String leftStreet;

	private String locality;

	@Column(name="MAPS_RELATIONS")
	private String mapsRelations;

	private String office;

	private String parcell;

	@Column(name="POSTAL_BOX")
	private String postalBox;

	@Column(name="POSTAL_BOX_BRANCH")
	private String postalBoxBranch;

	@Column(name="POSTAL_OFFICE_BOX")
	private String postalOfficeBox;

	@Column(name="PROPERTY_REGISTER")
	private String propertyRegister;

	private String province;

	@Temporal(TemporalType.DATE)
	@Column(name="PURGE_DATE")
	private Date purgeDate;

	private String region;

	@Temporal(TemporalType.DATE)
	@Column(name="RESIDE_BEGIN_DATE")
	private Date resideBeginDate;

	@Column(name="RIGHT_STREET")
	private String rightStreet;

	private String route;

	@Column(name="ROUTE_KILOMETRE")
	private BigDecimal routeKilometre;

	@Column(name="RURAL_ZONE")
	private String ruralZone;

	private String sector;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	private String street;

	@Column(name="STREET_EXTENSION")
	private String streetExtension;

	@Column(name="STREET_NUMBER")
	private BigDecimal streetNumber;

	@Column(name="TOWN_ZONE")
	private String townZone;

	@Column(name="TRAIN_STATION_NAME")
	private String trainStationName;

	@Column(name="WITHOUT_NUMBER_STREET")
	private String withoutNumberStreet;

}