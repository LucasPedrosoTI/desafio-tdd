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
@Table(name="cyberbank_core.CUSTOMER_DOCUMENT_TYPE")
public class CustomerDocumentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_DOCUMENT_TYPE_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_DOCUMENT_TYPE_ID_GENERATOR")
	private long id;

	@ManyToOne
	@JoinColumn(name = "CUSTOMER")
	private Customer customer;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATE_ENTRANCE")
	private Date dateEntrance;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_TO")
	private Date dateTo;

	@ManyToOne
	@JoinColumn(name = "DOCUMENT_TYPE")
	private DocumentType documentType;
	
	@ManyToOne
	@JoinColumn(name = "FILE_PATH")
	private FilePath filePath;
	
	@Column(name="IDENTIFICATION_NUMBER")
	private String identificationNumber;

	@Column(name="IMPUT_DATE")
	private Timestamp imputDate;

	@Column(name="\"SEQUENCE\"")
	private BigDecimal sequence;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@ManyToOne
	@JoinColumn(name = "STAMP_USER")
	private SystemUserCore stampUser;
	
	@ManyToOne
	@JoinColumn(name = "STATUS")
	private Status status;
	
	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

	@ManyToOne
	@JoinColumn(name = "STATUS_REASON")
	private StatusReason statusReason;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name="VALIDITY_IDENTIFICATION")
	private Date validityIdentification;
}