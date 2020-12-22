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
@Table(name = "cyberbank_core.OFFICER")
public class Officer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="OFFICER_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="OFFICER_ID_GENERATOR")
	private long id;

	@Column(name="COMPANY_NAME")
	private String companyName;

	private String description;

	@Column(name="IS_MANAGER")
	private BigDecimal isManager;

	@Column(name="OFFICER_COMPANY_GROUP")
	private BigDecimal officerCompanyGroup;

	@Column(name="OFFICER_ID")
	private String officerId;

	@Column(name="OFFICER_NAME")
	private String officerName;

	@Column(name="POSITION_CODE")
	private BigDecimal positionCode;

	@Column(name="POSITION_DESC")
	private String positionDesc;

	@Column(name="POSITION_LEVEL")
	private String positionLevel;

	@Column(name="\"SEGMENT\"")
	private BigDecimal segment;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="USER_NAME")
	private String userName;

}