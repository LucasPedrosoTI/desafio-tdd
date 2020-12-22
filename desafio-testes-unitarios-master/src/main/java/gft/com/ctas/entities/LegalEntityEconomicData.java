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
@Table(name="LEGAL_ENTITY_ECONOMIC_DATA")
@NamedQuery(name="LegalEntityEconomicData.findAll", query="SELECT l FROM LegalEntityEconomicData l")
public class LegalEntityEconomicData implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LEGAL_ENTITY_ECONOMIC_DATA_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LEGAL_ENTITY_ECONOMIC_DATA_ID_GENERATOR")
	private long id;

	@Column(name="SOCIAL_CAPITAL_AMMOUNT")
	private BigDecimal socialCapitalAmmount;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;

}