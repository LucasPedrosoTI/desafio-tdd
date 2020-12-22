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
@Table(name="cyberbank_core.CUSTOMER_HIST")
public class CustomerHist implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_HIST_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_HIST_ID_GENERATOR")
	private long id;

	@Column(name="\"ACTION\"")
	private String action;

	private BigDecimal customer;

	@Column(name="CUSTOMER_ID")
	private String customerId;

	@Column(name="DEPARTMENT_DESC")
	private String departmentDesc;

	private String name;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STAMP_DATE_TIME_CHANGE")
	private Timestamp stampDateTimeChange;

	@Column(name="STAMP_USER_CHANGE")
	private String stampUserChange;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

}