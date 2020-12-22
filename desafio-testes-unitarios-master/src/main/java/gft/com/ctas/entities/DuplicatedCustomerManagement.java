package gft.com.ctas.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


import lombok.Data;
import javax.persistence.Entity;

@Data
@Entity
@Table(name="DUPLICATED_CUSTOMER_MANAGEMENT")
@NamedQuery(name="DuplicatedCustomerManagement.findAll", query="SELECT d FROM DuplicatedCustomerManagement d")
public class DuplicatedCustomerManagement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DUPLICATED_CUSTOMER_MANAGEMENT_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DUPLICATED_CUSTOMER_MANAGEMENT_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="BIRTH_DATE")
	private Date birthDate;

	@Column(name="FIRST_NAME1")
	private String firstName1;

	@Column(name="FIRST_NAME2")
	private String firstName2;

	@Column(name="GROUP_AFFECTED_NUMBER")
	private BigDecimal groupAffectedNumber;

	@Column(name="IDENTIFICATION_COMPLEMENT")
	private String identificationComplement;

	@Column(name="LAST_NAME1")
	private String lastName1;

	@Column(name="LAST_NAME2")
	private String lastName2;

	private String name;

	@Column(name="RESULT")
	private BigDecimal result;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

}