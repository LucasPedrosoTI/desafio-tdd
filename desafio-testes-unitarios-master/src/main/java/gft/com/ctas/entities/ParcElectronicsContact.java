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
@Table(name="PARC_ELECTRONICS_CONTACT")
@NamedQuery(name="ParcElectronicsContact.findAll", query="SELECT p FROM ParcElectronicsContact p")
public class ParcElectronicsContact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARC_ELECTRONICS_CONTACT_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARC_ELECTRONICS_CONTACT_ID_GENERATOR")
	private long id;

	@Temporal(TemporalType.DATE)
	@Column(name="ADDITION_DATE")
	private Date additionDate;

	@Column(name="EMAIL_ADDRESS_COMPLETE")
	private String emailAddressComplete;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;


}