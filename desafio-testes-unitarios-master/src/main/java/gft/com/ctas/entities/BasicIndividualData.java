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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name="BASIC_INDIVIDUAL_DATA")
public class BasicIndividualData implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="BASIC_INDIVIDUAL_DATA_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BASIC_INDIVIDUAL_DATA_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DECEASE_DATE")
	private Date deceaseDate;

	@Temporal(TemporalType.DATE)
	@Column(name="EDUCATION_ENDING_DATE")
	private Date educationEndingDate;

	@Column(name="FAMILY_SIZE")
	private BigDecimal familySize;

	@Column(name="FATHER_NAME")
	private String fatherName;

	@Column(name="IDENTIFICATION_NUMBER_SPOUSE")
	private String identificationNumberSpouse;

	@Column(name="MOTHER_NAME")
	private String motherName;

	@Column(name="NUMBER_OF_CHILDREN")
	private BigDecimal numberOfChildren;

	@Column(name="PLACE_OF_BIRTH")
	private String placeOfBirth;

	@Column(name="SCHOOL_NAME")
	private String schoolName;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

}