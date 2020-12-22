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
@Table(name="RELATION_KYC_INVESTMENT")
@NamedQuery(name="RelationKycInvestment.findAll", query="SELECT r FROM RelationKycInvestment r")
public class RelationKycInvestment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RELATION_KYC_INVESTMENT_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RELATION_KYC_INVESTMENT_ID_GENERATOR")
	private long id;

	@Column(name="INVESTMENT_AMOUNT_EXPECTED")
	private BigDecimal investmentAmountExpected;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;


}