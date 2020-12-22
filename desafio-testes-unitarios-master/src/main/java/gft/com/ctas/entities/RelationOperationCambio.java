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
@Table(name="RELATION_OPERATION_CAMBIO")
@NamedQuery(name="RelationOperationCambio.findAll", query="SELECT r FROM RelationOperationCambio r")
public class RelationOperationCambio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RELATION_OPERATION_CAMBIO_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RELATION_OPERATION_CAMBIO_ID_GENERATOR")
	private long id;

	@Column(name="EXPORT_EXCHANGE_VOLUME_LAST12M")
	private BigDecimal exportExchangeVolumeLast12m;

	@Column(name="INVEST_MENT_AMOUNT_EXPECTED")
	private BigDecimal investMentAmountExpected;

	@Column(name="MAIN_PRODUCT_SERV")
	private String mainProductServ;

	@Column(name="STAMP_ADDITIONAL")
	private String stampAdditional;

	@Column(name="STAMP_DATE_TIME")
	private Timestamp stampDateTime;

	@Column(name="STATUS_DATE")
	private Timestamp statusDate;


}