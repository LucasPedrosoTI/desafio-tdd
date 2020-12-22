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
@Table(name = "cyberbank_core.COUNTRY")
public class Country implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="COUNTRY_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="COUNTRY_ID_GENERATOR")
	private long id;

	@Column(name="CODE_ISO_A2")
	private String codeIsoA2;

	@Column(name="CODE_ISO_A3")
	private String codeIsoA3;

	@Column(name="CODE_ISO_NUM")
	private String codeIsoNum;

	private BigDecimal continent;

	@Column(name="COUNTRY_ID")
	private BigDecimal countryId;

	private String gentilic;

	@Column(name="LOCAL_LANGUAGE")
	private BigDecimal localLanguage;

	@Column(name="LONG_DESC")
	private String longDesc;

	private String nemotecnico;

	@Column(name="OFFICIAL_ID")
	private String officialId;

	@Column(name="SHORT_DESC")
	private String shortDesc;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="TEL_CODE")
	private BigDecimal telCode;

}