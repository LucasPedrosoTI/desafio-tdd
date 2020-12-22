package gft.com.ctas.entities;

import java.io.Serializable;
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
@Table(name="SPECIAL_CUSTOMER")
@NamedQuery(name="SpecialCustomer.findAll", query="SELECT s FROM SpecialCustomer s")
public class SpecialCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SPECIAL_CUSTOMER_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SPECIAL_CUSTOMER_ID_GENERATOR")
	private long id;

	@Column(name="DESCRIPTION_CARGO_SPECIAL")
	private String descriptionCargoSpecial;

	@Column(name="DESCRIPTION_RELATIVE")
	private String descriptionRelative;

	@Column(name="IDENTIFICATION_NUMBER_RELATIVE")
	private String identificationNumberRelative;

	@Column(name="IDENTIFICATION_NUMBER_SPECIAL")
	private String identificationNumberSpecial;

	@Column(name="NAME_RELATIVE_SPECIAL")
	private String nameRelativeSpecial;

	@Column(name="NAME_SPECIAL_CUSTOMER")
	private String nameSpecialCustomer;

	private String reference;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@Column(name="SYSTEM_USER_CORE")
	private String systemUserCore;


}