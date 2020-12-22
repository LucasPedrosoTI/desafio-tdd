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
@Table(name="OFFICER_EXT")
@NamedQuery(name="OfficerExt.findAll", query="SELECT o FROM OfficerExt o")
public class OfficerExt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="OFFICER_EXT_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OFFICER_EXT_ID_GENERATOR")
	private long id;

	@Column(name="COMPANY_NAME")
	private String companyName;

	@Column(name="COST_CENTER")
	private String costCenter;

	@Column(name="ERROR_CODE")
	private BigDecimal errorCode;

	@Column(name="ERROR_DESCRIPTION")
	private String errorDescription;

	@Column(name="IDENTIFICATION_NUMBER")
	private String identificationNumber;

	@Column(name="IMMEDIATE_SUPERIOR_DOC_NUMBER")
	private String immediateSuperiorDocNumber;

	@Column(name="IMMEDIATE_SUPERIOR_NAME")
	private String immediateSuperiorName;

	@Column(name="IMMEDIATE_SUPERIOR_OFFICER_ID")
	private String immediateSuperiorOfficerId;

	@Column(name="LOCATION_DESCRIPTION")
	private String locationDescription;

	@Column(name="LOCATION_ID")
	private String locationId;

	@Column(name="LOCATION_STATE")
	private String locationState;

	private String name;

	@Column(name="OFFICER_ID")
	private String officerId;

	@Column(name="OPERATION_CODE")
	private String operationCode;

	@Column(name="POSITION_CODE")
	private BigDecimal positionCode;

	@Column(name="POSITION_DESC")
	private String positionDesc;

	@Column(name="POSITION_LEVEL")
	private String positionLevel;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	
}