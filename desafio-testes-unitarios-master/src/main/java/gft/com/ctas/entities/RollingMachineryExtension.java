package gft.com.ctas.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name="ROLLING_MACHINERY_EXTENSION")
@NamedQuery(name="RollingMachineryExtension.findAll", query="SELECT r FROM RollingMachineryExtension r")
public class RollingMachineryExtension implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ROLLING_MACHINERY_EXTENSION_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ROLLING_MACHINERY_EXTENSION_ID_GENERATOR")
	private long id;

	private BigDecimal insurance;

	@Temporal(TemporalType.DATE)
	@Column(name="INSURANCE_EXPIRATION_DATE")
	private Date insuranceExpirationDate;

	@Column(name="INVOICE_NUMBER")
	private String invoiceNumber;

	@Column(name="PATRIMONY_NUMBER")
	private String patrimonyNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="REGISTRATION_DATE")
	private Date registrationDate;


}