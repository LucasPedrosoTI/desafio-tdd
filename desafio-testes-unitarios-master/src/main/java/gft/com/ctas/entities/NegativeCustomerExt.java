package gft.com.ctas.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Data;
import javax.persistence.Entity;

@Data
@Entity
@Table(name="NEGATIVE_CUSTOMER_EXT")
@NamedQuery(name="NegativeCustomerExt.findAll", query="SELECT n FROM NegativeCustomerExt n")
public class NegativeCustomerExt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="NEGATIVE_CUSTOMER_EXT_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NEGATIVE_CUSTOMER_EXT_ID_GENERATOR")
	private long id;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	private String field1;

	private String field2;

	@Column(name="IDENTIFICATION_NUMBER")
	private String identificationNumber;

	@Column(name="IDENTIFICATION_TYPE")
	private BigDecimal identificationType;

	@Column(name="LIST_RESTRICTION_TYPE")
	private BigDecimal listRestrictionType;

	private String name;

	private String nemotecnico;

	private String officer;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STAMP_USER")
	private BigDecimal stampUser;

	private BigDecimal status;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="STATUS_REASON")
	private BigDecimal statusReason;

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getField1() {
		return this.field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return this.field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public String getIdentificationNumber() {
		return this.identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public BigDecimal getIdentificationType() {
		return this.identificationType;
	}

	public void setIdentificationType(BigDecimal identificationType) {
		this.identificationType = identificationType;
	}

	public BigDecimal getListRestrictionType() {
		return this.listRestrictionType;
	}

	public void setListRestrictionType(BigDecimal listRestrictionType) {
		this.listRestrictionType = listRestrictionType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNemotecnico() {
		return this.nemotecnico;
	}

	public void setNemotecnico(String nemotecnico) {
		this.nemotecnico = nemotecnico;
	}

	public String getOfficer() {
		return this.officer;
	}

	public void setOfficer(String officer) {
		this.officer = officer;
	}

	public String getStampAdditional() {
		return this.stampAdditional;
	}

	public void setStampAdditional(String stampAdditional) {
		this.stampAdditional = stampAdditional;
	}

	public Timestamp getStampDateTime() {
		return this.stampDateTime;
	}

	public void setStampDateTime(Timestamp stampDateTime) {
		this.stampDateTime = stampDateTime;
	}

	public BigDecimal getStampUser() {
		return this.stampUser;
	}

	public void setStampUser(BigDecimal stampUser) {
		this.stampUser = stampUser;
	}

	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

	public Timestamp getStatusDate() {
		return this.statusDate;
	}

	public void setStatusDate(Timestamp statusDate) {
		this.statusDate = statusDate;
	}

	public BigDecimal getStatusReason() {
		return this.statusReason;
	}

	public void setStatusReason(BigDecimal statusReason) {
		this.statusReason = statusReason;
	}

}