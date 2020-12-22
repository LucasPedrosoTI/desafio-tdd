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
@Table(name="CUSTOMER_INCOME_PREVIEW")
@NamedQuery(name="CustomerIncomePreview.findAll", query="SELECT c FROM CustomerIncomePreview c")
public class CustomerIncomePreview implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CUSTOMER_INCOME_PREVIEW_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_INCOME_PREVIEW_ID_GENERATOR")
	private long id;

	@Column(name="CODE_INCOME")
	private String codeIncome;

	private String document;

	@Column(name="IDENTIFICATION_NUMBER_EMPLOYER")
	private String identificationNumberEmployer;

	@Column(name="INCOME_VALUE")
	private BigDecimal incomeValue;

	@Column(name="INPUT_DATE")
	private Timestamp inputDate;

	@Column(name="MONTHLY_INCOME")
	private BigDecimal monthlyIncome;

	@Column(name="ORIGIN_INCOME")
	private String originIncome;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;


}