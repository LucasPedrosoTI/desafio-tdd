package gft.com.ctas.entities;

import java.io.Serializable;
import java.sql.Timestamp;
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
@Table(name="PARC_CONTACT_PHONE")
@NamedQuery(name="ParcContactPhone.findAll", query="SELECT p FROM ParcContactPhone p")
public class ParcContactPhone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARC_CONTACT_PHONE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARC_CONTACT_PHONE_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="ADDITION_DATE")
	private Date additionDate;

	@Column(name="AREA_CODE")
	private String areaCode;

	@Column(name="PHONE_EXTENSION")
	private String phoneExtension;

	@Column(name="PHONE_NUMBER")
	private String phoneNumber;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;


}