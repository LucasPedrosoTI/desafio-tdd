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
@Table(name="CUSTOMER_IDENTIFICATION_HIST")
@NamedQuery(name="CustomerIdentificationHist.findAll", query="SELECT c FROM CustomerIdentificationHist c")
public class CustomerIdentificationHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_IDENTIFICATION_HIST_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_IDENTIFICATION_HIST_ID_GENERATOR")
	private long id;

	@Column(name="CUSTOMER_ID")
	private String customerId;

	@Column(name="CUSTOMER_IDENTIFICATION")
	private BigDecimal customerIdentification;

	@Column(name="EMITING_COUNTRY_NT")
	private String emitingCountryNt;

	@Column(name="EMITTING_PROVINCE_CODE_ID")
	private BigDecimal emittingProvinceCodeId;

	@Column(name="IDENTIFICATION_COMPLEMENT")
	private String identificationComplement;

	@Column(name="IDENTIFICATION_NUMBER")
	private String identificationNumber;

	@Column(name="IDENTIFICATION_TYPE_NT")
	private String identificationTypeNt;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STAMP_DATE_TIME_CHANGE")
	private Timestamp stampDateTimeChange;

	@Column(name="STAMP_USER_CHANGE")
	private String stampUserChange;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;


}