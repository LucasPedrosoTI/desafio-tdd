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
@Table(name="KYC_TYPE_CHANGE")
@NamedQuery(name="KycTypeChange.findAll", query="SELECT k FROM KycTypeChange k")
public class KycTypeChange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="KYC_TYPE_CHANGE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="KYC_TYPE_CHANGE_ID_GENERATOR")
	private long id;

	@Column(name="KYC_TYPE_CHANGE_ID")
	private BigDecimal kycTypeChangeId;

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

	
}