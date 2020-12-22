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
@Table(name="ZIP_CODE")
@NamedQuery(name="ZipCode.findAll", query="SELECT z FROM ZipCode z")
public class ZipCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ZIP_CODE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ZIP_CODE_ID_GENERATOR")
	private long id;

	private BigDecimal locality;

	@Column(name="LONG_DESC")
	private String longDesc;

	private String nemotecnico;

	@Column(name="OFFICIAL_ID")
	private String officialId;

	@Column(name="PROVINCE_CODE")
	private BigDecimal provinceCode;

	@Column(name="SHORT_DESC")
	private String shortDesc;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	private BigDecimal status;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="STATUS_REASON")
	private BigDecimal statusReason;

	@Column(name="ZIP_CODE_ID")
	private String zipCodeId;

	@Column(name="ZIP_CODE_TYPE")
	private BigDecimal zipCodeType;

}